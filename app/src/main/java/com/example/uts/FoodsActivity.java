package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FoodsActivity extends AppCompatActivity {

    Button myOrder, nasiGoreng, buahApel, buahMangga, buahAlpukat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foods);

        myOrder = findViewById(R.id.myOrder);
        nasiGoreng = findViewById(R.id.nasiGoreng);
        buahApel = findViewById(R.id.buahApel);
        buahMangga = findViewById(R.id.buahMangga);
        buahAlpukat = findViewById(R.id.buahAlpukat);

        myOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodsActivity.this, ReceiveOrderActivity.class);
                startActivity(intent);
            }
        });

        nasiGoreng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodsActivity.this, CreateOrderActivity.class);
                intent.putExtra("foodName", nasiGoreng.getText().toString());
                startActivity(intent);
            }
        });

        buahApel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodsActivity.this, CreateOrderActivity.class);
                intent.putExtra("foodName", buahApel.getText().toString());
                startActivity(intent);
            }
        });

        buahMangga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodsActivity.this, CreateOrderActivity.class);
                intent.putExtra("foodName", buahMangga.getText().toString());
                startActivity(intent);
            }
        });

        buahAlpukat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodsActivity.this, CreateOrderActivity.class);
                intent.putExtra("foodName", buahAlpukat.getText().toString());
                startActivity(intent);
            }
        });
    }
}
