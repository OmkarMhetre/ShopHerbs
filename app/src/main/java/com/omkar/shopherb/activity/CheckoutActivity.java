package com.omkar.shopherb.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.omkar.shopherb.R;

public class CheckoutActivity extends AppCompatActivity {

    EditText city, state;
    TextView name, price;
    private FirebaseAuth auth;
    String email;
    Button pay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        Intent iin= getIntent();
        Bundle b = iin.getExtras();


        city = findViewById(R.id.cityCheckout);
        state = findViewById(R.id.stateCheckout);
        name = findViewById(R.id.nameCheckout);
        price = findViewById(R.id.priceCheckout);
        pay = findViewById(R.id.pay);


        if(b!=null)
        {
            int j =(int) b.get("price");
            price.setText(String.valueOf(j));
        }

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        if (user != null){
            email = user.getEmail().substring(0, user.getEmail().indexOf("@"));

        }

        name.setText(email);

        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CheckoutActivity.this, SuccessfulActivity.class);
                startActivity(intent);
            }
        });




    }
}
