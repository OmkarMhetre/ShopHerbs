package com.omkar.shopherb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.omkar.shopherb.activity.auth.LoginActivity;

public class StartActivity extends AppCompatActivity {
    private Button getstarted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        getstarted = findViewById(R.id.gettingStartedButton);

        getstarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StartActivity.this, LoginActivity.class));
                finish();
            }
        });

    }
}
