package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DrinkActivity extends AppCompatActivity {

    Button myOrder, airMineral, jusApel, jusMangga, jusAlpukat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        myOrder = findViewById(R.id.myOrder);
        airMineral = findViewById(R.id.airMineral);
        jusApel = findViewById(R.id.jusApel);
        jusMangga = findViewById(R.id.jusMangga);
        jusAlpukat = findViewById(R.id.jusAlpukat);

        myOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrinkActivity.this, ReceiveOrderActivity.class);
                startActivity(intent);
            }
        });

        airMineral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrinkActivity.this, CreateOrderActivity.class);
                intent.putExtra("drinkName", airMineral.getText().toString());
                startActivity(intent);
            }
        });

        jusApel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrinkActivity.this, CreateOrderActivity.class);
                intent.putExtra("drinkName", jusApel.getText().toString());
                startActivity(intent);
            }
        });

        jusMangga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrinkActivity.this, CreateOrderActivity.class);
                intent.putExtra("drinkName", jusMangga.getText().toString());
                startActivity(intent);
            }
        });

        jusAlpukat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrinkActivity.this, CreateOrderActivity.class);
                intent.putExtra("drinkName", jusAlpukat.getText().toString());
                startActivity(intent);
            }
        });
    }
}
