package com.marcod.finalproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddStockActivity extends AppCompatActivity {

    private EditText id, qty;
    private Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_stock);

        add = findViewById(R.id.loginUser);
        id = findViewById(R.id.etItemID);
        qty = findViewById(R.id.etQty);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String i = id.getText().toString();
                String q = qty.getText().toString();

                Intent intent = new Intent(AddStockActivity.this,ClothingActivity.class);

                intent.putExtra("quantity",i);
                intent.putExtra("id",q);

                startActivity(intent);

            }
        });

    }
}