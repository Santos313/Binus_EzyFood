package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CreateOrderActivity extends AppCompatActivity {

    Button myOrder, orderMore;

    TextView item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_order);

        myOrder = findViewById(R.id.myOrder);
        orderMore = findViewById(R.id.orderMore);

        Intent intent = getIntent();

        String drinkName = intent.getStringExtra("drinkName");
        String foodName = intent.getStringExtra("foodName");
        String snackName = intent.getStringExtra("snackName");
        String topUpName = intent.getStringExtra("topUpName");

        item = findViewById(R.id.textView7);
        if(drinkName != null){
            item.setText(drinkName);
        } else if (foodName != null) {
            item.setText(foodName);
        } else if (snackName != null) {
            item.setText(snackName);
        } else if (topUpName != null) {
            item.setText(topUpName);
        }

        myOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreateOrderActivity.this, ReceiveOrderActivity.class);
                intent.putExtra("orderName",item.getText().toString());
                startActivity(intent);
            }
        });

        orderMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreateOrderActivity.this, getParent().getClass());
                startActivity(intent);
            }
        });

    }
}
