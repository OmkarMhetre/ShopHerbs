package com.omkar.shopherb.activity.auth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.omkar.shopherb.R;
import com.omkar.shopherb.activity.MainActivity;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private Button login;
    private EditText email, password;
    private TextView signup;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = findViewById(R.id.loginButton);
        signup = findViewById(R.id.signupheretextView);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        auth = FirebaseAuth.getInstance();

        login.setOnClickListener(this);
        signup.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.loginButton :
                String email_txt = email.getText().toString();
                String password_txt = password.getText().toString();
                loginUser(email_txt,password_txt);
                break;


            case R.id.signupheretextView :
                Intent i = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(i);
                break;

        }
    }

    private void loginUser(String email_txt, String password_txt) {
        auth.signInWithEmailAndPassword(email_txt, password_txt).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
            @Override
            public void onSuccess(AuthResult authResult) {
                Toast.makeText(LoginActivity.this, "Login Succesful", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
