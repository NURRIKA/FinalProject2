package com.marcod.finalproject2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeUserActivity extends AppCompatActivity {

    private CardView CD1, CD2, CD3, CD4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_user);
        CD1 = (CardView) findViewById(R.id.cd1);
        CD2 = (CardView) findViewById(R.id.cd2);
        CD3 = (CardView) findViewById(R.id.cd3);
        CD4 = (CardView) findViewById(R.id.cd4);

        CD1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeUserActivity.this, Clothings2Activity.class);
                startActivity(intent);
            }
        });
        CD2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeUserActivity.this, ElectronicActivity.class);
                startActivity(intent);
            }
        });
        CD3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeUserActivity.this, BookActivity.class);
                startActivity(intent);
            }
        });
        CD4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeUserActivity.this, OthersActivity.class);
                startActivity(intent);
            }
        });
    }
}