package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CompleteOrderActivity extends AppCompatActivity {

    Button menuUtama;
    TextView item, price, totalPrice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_order);

        menuUtama = findViewById(R.id.menuUtama);

        menuUtama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompleteOrderActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Intent intent = getIntent();

        String orderName = intent.getStringExtra("orderName");

        item = findViewById(R.id.textView7);
        price = findViewById(R.id.textView9);
        totalPrice = findViewById(R.id.textView10);
        if(orderName.equals("Empty")){
            price.setText("Rp. 0");
            totalPrice.setText("Total: Rp. 0");
        }
        else if (orderName != null) {
            item.setText(orderName);
        }
    }
}
