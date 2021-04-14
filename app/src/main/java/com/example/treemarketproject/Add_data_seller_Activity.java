package com.example.treemarketproject;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Add_data_seller_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_data_seller);


        getValue.Boolean_for_back_toseller_or_buyer_page_in_read_data = false;
        FloatingActionButton button_back_data_seller = findViewById(R.id.floatingBackToProductButton_seller);
        button_back_data_seller.setOnClickListener(view -> {
            Intent in = new Intent(Add_data_seller_Activity.this, Seller.class);
            startActivity(in);
        });




    }
}