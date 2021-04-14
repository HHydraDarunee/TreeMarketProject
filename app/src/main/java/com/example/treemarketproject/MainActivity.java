package com.example.treemarketproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*Go to seller page*/
        Button button_seller = findViewById(R.id.button_to_seller_page);
        button_seller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenLoginActivity();
            }
        });


        Button button_buyer = findViewById(R.id.button_to_buyer_page);
        button_buyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenBuyerActivity();
            }
        });
    }

    public void OpenLoginActivity() {
        Intent intent = new Intent(this, Login_Activity.class);
        String message = "lover";
        intent.putExtra("com.example.myfirstapp.MESSAGE", message);
        startActivity(intent);
    }
    public void OpenBuyerActivity() {
        Intent intent = new Intent(this, Buyer.class);
        String message = "lover";
        intent.putExtra("com.example.myfirstapp.MESSAGE", message);
        startActivity(intent);
    }

}