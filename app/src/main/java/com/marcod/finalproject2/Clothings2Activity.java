package com.marcod.finalproject2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Clothings2Activity extends AppCompatActivity {

    private ImageView CD1, CD2, CD3, CD4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothings2);
        CD1 = (ImageView) findViewById(R.id.cd1);
        CD2 = (ImageView) findViewById(R.id.cd2);
        CD3 = (ImageView) findViewById(R.id.cd3);
        CD4 = (ImageView) findViewById(R.id.cd4);

        CD1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Clothings2Activity.this, ClothingsActivity.class);
                startActivity(intent);
            }
        });
        CD2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Clothings2Activity.this, ClothingsActivity.class);
                startActivity(intent);
            }
        });
        CD3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Clothings2Activity.this, ClothingsActivity.class);
                startActivity(intent);
            }
        });
        CD4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Clothings2Activity.this, ClothingsActivity.class);
                startActivity(intent);
            }
        });

    }
}