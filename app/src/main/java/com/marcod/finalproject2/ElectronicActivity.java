package com.marcod.finalproject2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ElectronicActivity extends AppCompatActivity {
    private CardView CD1, CD2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronic);
        CD1 = (CardView) findViewById(R.id.cd1);
        CD2 = (CardView) findViewById(R.id.cd2);

        CD1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ElectronicActivity.this, Electronic1Activity.class);
                startActivity(intent);
            }
        });
        CD2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ElectronicActivity.this, Electronic1Activity.class);
                startActivity(intent);
            }
        });
    }
}