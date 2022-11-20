package com.marcod.finalproject2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class RegisterUserActivity extends AppCompatActivity {

    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://finpro2-fceb1-default-rtdb.firebaseio.com/");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);

        final EditText etName = findViewById(R.id.etName);
        final EditText etPhone = findViewById(R.id.etPhone);
        final EditText etPassword = findViewById(R.id.etPassword);
        final Button registUser = findViewById(R.id.registUser);

        registUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String etNameTxt = etName.getText().toString();
                final String etPhoneTxt = etPhone.getText().toString();
                final String etPasswordTxt = etPassword.getText().toString();
                final String registUserTxt = registUser.getText().toString();

                if(etNameTxt.isEmpty() || etPhoneTxt.isEmpty() || etPasswordTxt.isEmpty()) {
                    Toast.makeText(RegisterUserActivity.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                }
                else {
                    databaseReference.child("users").addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            if (snapshot.hasChild(etPhoneTxt)){
                                Toast.makeText(RegisterUserActivity.this, "Phone is already registered!", Toast.LENGTH_SHORT).show();
                            }
                            else{
                                databaseReference.child("users").child(etPhoneTxt).child("etName").setValue(etNameTxt);
                                databaseReference.child("users").child(etPhoneTxt).child("etPassword").setValue(etPasswordTxt);

                                Intent intent = new Intent(RegisterUserActivity.this, LoginUserActivity.class);
                                startActivity(intent);
                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });
                }
            }
        });

    }
}