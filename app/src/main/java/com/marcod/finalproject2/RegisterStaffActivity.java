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

public class RegisterStaffActivity extends AppCompatActivity {

    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://finpro2-fceb1-default-rtdb.firebaseio.com/");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_staff);
        final EditText etName = findViewById(R.id.etName);
        final EditText etPassword1 = findViewById(R.id.etPass1);
        final EditText etPassword2 = findViewById(R.id.etPass2);
        final Button registStaff = findViewById(R.id.registStaff);

        registStaff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String etNameTxt = etName.getText().toString();
                final String etPassword1Txt = etPassword1.getText().toString();
                final String etPassword2Txt = etPassword2.getText().toString();
                final String registStaffTxt = registStaff.getText().toString();

                if(etNameTxt.isEmpty() || etPassword1Txt.isEmpty() || etPassword2Txt.isEmpty()) {
                    Toast.makeText(RegisterStaffActivity.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                }
                else {
                    databaseReference.child("staffs").addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            if (snapshot.hasChild(etPassword1Txt)){
                                Toast.makeText(RegisterStaffActivity.this, "Staff is already registered!", Toast.LENGTH_SHORT).show();
                            }
                            else{
                                databaseReference.child("staffs").child(etNameTxt).child("etPassword").setValue(etPassword1Txt);

                                Intent intent = new Intent(RegisterStaffActivity.this, LoginStaffActivity.class);
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