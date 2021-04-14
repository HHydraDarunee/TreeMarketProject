package com.example.treemarketproject;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Detail_data_seller_Activity extends AppCompatActivity {

    private static final String TAG = "Detail_data_buyer_Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_data_seller);
        getIncomingIntent();
        getValue.Boolean_for_back_toseller_or_buyer_page_in_read_data = false;
        FloatingActionButton button_back_data_seller = findViewById(R.id.floatingBackToProductButton_seller);
        button_back_data_seller.setOnClickListener(view -> {
            Intent in = new Intent(Detail_data_seller_Activity.this, Read_data_Activity.class);
            startActivity(in);
        });

        Log.d(TAG, "OnCreate: started.");


    }


    @SuppressLint("LongLogTag")
    private void getIncomingIntent() {
        Log.d(TAG, "getIncomingIntent: check fot incoming intent.");


        if (getIntent().hasExtra("image_url") && getIntent().hasExtra("shop_name")) {
            Log.d(TAG, "getIncomingIntent: found intent extras.");


            String imageDrawableId = getIntent().getStringExtra("image_url");
            /*โค้ดด้านบนคือรับค่ารูปเป็น URL*/


            String shopName = getIntent().getStringExtra("shop_name");
            String productName = getIntent().getStringExtra("product_name");
            String productNum = getIntent().getStringExtra("product_num");
            String shopAddress = getIntent().getStringExtra("shop_address");

            setImage(imageDrawableId, shopName,productName,productNum,shopAddress);
        }
    }

    private void setImage(String image_drawable_id, String shopName,String productName,String productNum,String shopAddress) {

        Log.d(TAG, "setImage: setting te image and name to widgets.");


        ImageView image = findViewById(R.id.imageView_detail_product_seller);
        image.setImageResource(R.drawable.test_pic1);
        /*ไว้เซ็ตค่ารูปจาก URL*/
        /* image.setImageResource(image_drawable_id);*/
        TextView shop_name = findViewById(R.id.textView__shopname_detail_product_seller);
        shop_name.setText(shopName);

        TextView product_name = findViewById(R.id.textView_name_detail_product_seller);
        product_name.setText(productName);

        TextView product_num = findViewById(R.id.textView_num_detail_product_seller);
        product_num.setText(productNum);

        TextView shop_address = findViewById(R.id.textView_address_detail_product_seller);
        shop_address.setText(shopAddress);



        /*ถ้าแก้ไขให้เป็น URLimage แล้ว อย่าลืมเอาคอมเม้นโค้ดด้านล่างออกด้วยนะ*/
    /*     Glide.with(this)
                .asBitmap()
                .load(image_drawable_id)
                .into(image);
    */

    }
}