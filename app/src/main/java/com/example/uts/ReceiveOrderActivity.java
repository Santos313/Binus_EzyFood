package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ReceiveOrderActivity extends AppCompatActivity {

    Button payNow, delete;
    TextView item, price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_order);

        payNow = findViewById(R.id.payNow);
        delete = findViewById(R.id.delete);

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReceiveOrderActivity.this, ReceiveOrderActivity.class);
                startActivity(intent);
            }
        });

        Intent intent = getIntent();

        String orderName = intent.getStringExtra("orderName");

        item = findViewById(R.id.textView7);
        price = findViewById(R.id.textView9);
        if (orderName != null) {
            item.setText(orderName);
        }
        else{
            price.setText("Rp. 0");
        }

        payNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReceiveOrderActivity.this, CompleteOrderActivity.class);
                intent.putExtra("orderName",item.getText().toString());
                startActivity(intent);
            }
        });
    }
}
