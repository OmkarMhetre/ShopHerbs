package com.omkar.shopherb.activity.auth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.omkar.shopherb.R;
import com.omkar.shopherb.activity.MainActivity;

public class RegisterActivity extends AppCompatActivity {

    private Button register;
    private FirebaseAuth auth;
    private EditText email, passwood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        register = findViewById(R.id.registerButton);
        email = findViewById(R.id.emailRegister);
        passwood = findViewById(R.id.passwordRegister);
        auth = FirebaseAuth.getInstance();


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emailText = email.getText().toString();
                String passwordText = passwood.getText().toString();
                if (TextUtils.isEmpty(emailText) && TextUtils.isEmpty(passwordText)) {
                    Log.d("login", "Empty Credential");
                    Toast.makeText(RegisterActivity.this, "Empty Credential", Toast.LENGTH_SHORT).show();
                } else if (passwordText.length() < 6) {
                    Log.d("login", "password is too short");
                } else {
                    firebaseauth(emailText, passwordText);
                }
            }
        });


    }

    private void firebaseauth(String emailText, String passwordText) {
        auth.createUserWithEmailAndPassword(emailText, passwordText)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        Log.d("registerDebug","User Register Successful");
                        Toast.makeText(RegisterActivity.this, "Register Successfully", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(RegisterActivity.this, MainActivity.class));
                        finish();
                        FirebaseUser user = auth.getCurrentUser();
                    }
                });
    }
}
