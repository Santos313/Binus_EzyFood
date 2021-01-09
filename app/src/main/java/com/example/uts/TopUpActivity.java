package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TopUpActivity extends AppCompatActivity {

    Button myOrder, rb10, rb20, rb50, rb100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_up);

        myOrder = findViewById(R.id.myOrder);
        rb10 = findViewById(R.id.rb10);
        rb20 = findViewById(R.id.rb20);
        rb50 = findViewById(R.id.rb50);
        rb100 = findViewById(R.id.rb100);

        myOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TopUpActivity.this, ReceiveOrderActivity.class);
                startActivity(intent);
            }
        });

        rb10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TopUpActivity.this, CreateOrderActivity.class);
                intent.putExtra("topUpName", rb10.getText().toString());
                startActivity(intent);
            }
        });

        rb20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TopUpActivity.this, CreateOrderActivity.class);
                intent.putExtra("topUpName", rb20.getText().toString());
                startActivity(intent);
            }
        });

        rb50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TopUpActivity.this, CreateOrderActivity.class);
                intent.putExtra("topUpName", rb50.getText().toString());
                startActivity(intent);
            }
        });

        rb100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TopUpActivity.this, CreateOrderActivity.class);
                intent.putExtra("topUpName", rb100.getText().toString());
                startActivity(intent);
            }
        });
    }
}
