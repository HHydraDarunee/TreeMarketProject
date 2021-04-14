package com.example.treemarketproject;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Seller extends AppCompatActivity {

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller);


        /*กลับ Home*/
        FloatingActionButton button_home_seller = findViewById(R.id.floatingBackHomeButton_seller);
        button_home_seller.setOnClickListener(view -> {
            Intent in = new Intent(Seller.this,MainActivity.class);
            startActivity(in);
        });


        /*boolean ให้ปุ่มกลับพาไปหา Seller Activity*/
        getValue.Boolean_for_back_toseller_or_buyer_page_in_read_data = false;

        /*ปุ่มเปลี่ยนหน้าย่อยของ seller*/
        ImageButton button_read_data_seller = findViewById(R.id.button_read_data_seller);
        ImageButton button_search_data_seller = findViewById(R.id.button_search_data_seller);
        ImageButton button_add_data_seller = findViewById(R.id.button_add_data_seller);
        ImageButton button_profile_data_seller = findViewById(R.id.button_profile_seller);


        TextView text_page_name = findViewById(R.id.textView_top_seller);
    /*เปิด search data เมื่อ create activity*/
        text_page_name.setText("ค้นหา");
        button_search_data_seller.setImageResource(R.drawable.ic_search2_list_foreground); /**/
        FragmentTransaction fr = getSupportFragmentManager().beginTransaction();
        fr.replace(R.id.center_seller_activity_layout,new Search_Bar());
        fr.commit();
    /*เปลี่ยน page fregment*/
        button_search_data_seller.setOnClickListener(view -> {
            text_page_name.setText("ค้นหา");
            button_search_data_seller.setImageResource(R.drawable.ic_search2_list_foreground); /**/
            button_read_data_seller.setImageResource(R.drawable.ic_product_list_foreground);
            button_profile_data_seller.setImageResource(R.drawable.ic_person_foreground);
            FragmentTransaction fr1 = getSupportFragmentManager().beginTransaction();
            fr1.replace(R.id.center_seller_activity_layout,new Search_Bar());
            fr1.commit();
        });
        button_read_data_seller.setOnClickListener(view -> {
            Intent in = new Intent(Seller.this,Read_data_Activity.class);
            startActivity(in);
        });
        button_add_data_seller.setOnClickListener(view -> {
            Intent in = new Intent(Seller.this,Add_data_seller_Activity.class);
            startActivity(in);
        });
        button_profile_data_seller.setOnClickListener(view -> {
            text_page_name.setText("ร้านค้า");
            button_profile_data_seller.setImageResource(R.drawable.ic_person2_foreground); /**/
            button_read_data_seller.setImageResource(R.drawable.ic_product_list_foreground);
            button_search_data_seller.setImageResource(R.drawable.ic_search_list_foreground);
            FragmentTransaction fr13 = getSupportFragmentManager().beginTransaction();
            fr13.replace(R.id.center_seller_activity_layout,new Profile_seller());
            fr13.commit();
        });


    }
}