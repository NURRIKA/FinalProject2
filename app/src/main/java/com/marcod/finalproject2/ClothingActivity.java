package com.marcod.finalproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ClothingActivity extends AppCompatActivity {

    TextView textView1,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothing);

        textView1 = findViewById(R.id.textView5);
        textView2 = findViewById(R.id.textView6);

        String id = getIntent().getStringExtra("ids");
        String qty = getIntent().getStringExtra("qtys");

        textView1.setText(id);
        textView2.setText(qty);
    }
}