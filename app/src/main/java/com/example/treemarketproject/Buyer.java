package com.example.treemarketproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Buyer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buyer);

        /*boolean ให้ปุ่มกลับพาไปหา Buyer Activity*/
        getValue.Boolean_for_back_toseller_or_buyer_page_in_read_data = true;

        ImageButton button_read_data_buyer = findViewById(R.id.button_read_data_buyer);
        ImageButton button_search_data_buyer = findViewById(R.id.button_search_data_buyer);


        TextView text_page_name = findViewById(R.id.textView_top_buyer);
        /*เปิด search data เมื่อ create activity*/
        text_page_name.setText("ค้นหา");
        button_search_data_buyer.setImageResource(R.drawable.ic_search2_list_foreground); /**/
        FragmentTransaction fr = getSupportFragmentManager().beginTransaction();
        fr.replace(R.id.center_buyer_activity_layout,new Search_Bar());
        fr.commit();

        /*กลับ Home*/
        FloatingActionButton button_home_seller = findViewById(R.id.floatingBackHomeButton_buyer);
        button_home_seller.setOnClickListener(view -> {
            Intent in = new Intent(Buyer.this,MainActivity.class);
            startActivity(in);
        });

        button_search_data_buyer.setOnClickListener(view -> {
            text_page_name.setText("ค้นหา");
            button_search_data_buyer.setImageResource(R.drawable.ic_search2_list_foreground); /**/
            button_read_data_buyer.setImageResource(R.drawable.ic_product_list_foreground);
            FragmentTransaction fr1 = getSupportFragmentManager().beginTransaction();
            fr1.replace(R.id.center_buyer_activity_layout,new Search_Bar());
            fr1.commit();
        });


        button_read_data_buyer.setOnClickListener(view -> {

            Intent in = new Intent(Buyer.this,Read_data_Activity.class);
            startActivity(in);
        });


    }
}