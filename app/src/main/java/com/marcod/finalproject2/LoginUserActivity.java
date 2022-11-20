package com.marcod.finalproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginUserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_user);
        final EditText phone = findViewById(R.id.etPhone);
        final EditText password = findViewById(R.id.etPassword);
        final Button login = findViewById(R.id.loginUser);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String phoneTxt = phone.getText().toString();
                final String passwordTxt = password.getText().toString();

                if (phoneTxt.isEmpty() || passwordTxt.isEmpty()){
                    Toast.makeText(LoginUserActivity.this, "Please enter your phone number or password", Toast.LENGTH_SHORT).show();
                }
                else {
                    login.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(LoginUserActivity.this, HomeUserActivity.class);
                            startActivity(intent);
                        }
                    });
                }
            }
        });

    }
}