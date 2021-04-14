package com.example.treemarketproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Login_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



        /*Go to seller page*/
        Button button_login = findViewById(R.id.button_login_seller);
        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*สร้าง Method ใหม่ไว้เช็ก Username กับ Password*/
                OpenSellerActivity();
            }
        });
    }


    public void OpenSellerActivity() {
        Intent intent = new Intent(this, Seller.class);
        String message = "lover";
        intent.putExtra("com.example.myfirstapp.MESSAGE", message);
        startActivity(intent);
    }

}