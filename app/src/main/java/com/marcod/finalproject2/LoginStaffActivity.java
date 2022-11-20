package com.marcod.finalproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginStaffActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_staff);
        final EditText username = findViewById(R.id.etUsername);
        final EditText password = findViewById(R.id.etPassword);
        final Button login = findViewById(R.id.loginStaff);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String usernameTxt = username.getText().toString();
                final String passwordTxt = password.getText().toString();

                if (usernameTxt.isEmpty() || passwordTxt.isEmpty()){
                    Toast.makeText(LoginStaffActivity.this, "Please enter your username or password", Toast.LENGTH_SHORT).show();
                }
                else {
                    login.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(LoginStaffActivity.this, HomeStaffActivity.class);
                            startActivity(intent);
                        }
                    });
                }
            }
        });

    }
}