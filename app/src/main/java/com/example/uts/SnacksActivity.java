package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SnacksActivity extends AppCompatActivity {

    Button myOrder, chitato, taro, doritos, popcorn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snacks);

        myOrder = findViewById(R.id.myOrder);
        chitato = findViewById(R.id.chitato);
        taro = findViewById(R.id.taro);
        doritos = findViewById(R.id.doritos);
        popcorn = findViewById(R.id.popcorn);

        myOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SnacksActivity.this, ReceiveOrderActivity.class);
                startActivity(intent);
            }
        });

        chitato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SnacksActivity.this, CreateOrderActivity.class);
                intent.putExtra("snackName", chitato.getText().toString());
                startActivity(intent);
            }
        });

        taro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SnacksActivity.this, CreateOrderActivity.class);
                intent.putExtra("snackName", taro.getText().toString());
                startActivity(intent);
            }
        });

        doritos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SnacksActivity.this, CreateOrderActivity.class);
                intent.putExtra("snackName", doritos.getText().toString());
                startActivity(intent);
            }
        });

        popcorn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SnacksActivity.this, CreateOrderActivity.class);
                intent.putExtra("snackName", popcorn.getText().toString());
                startActivity(intent);
            }
        });
    }
}
