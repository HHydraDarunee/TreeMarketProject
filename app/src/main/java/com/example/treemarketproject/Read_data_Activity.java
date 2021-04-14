package com.example.treemarketproject;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Read_data_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_data_);



        RecyclerView recyclerview = findViewById(R.id.recyclerview);
        recyclerview.setHasFixedSize(true);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));

        Product_data[] Product_data = new Product_data[]{

                /*สมมติว่ามี Data จาก Database ควรสร้าง Class เพื่อดึงค่าและในส่วนนี้ทำการสร้าง Cardview ของสินค้าด้วย Loop และทำ if else ว่าเป็น Seller หรือ Buyer โดย true-buyer และ false-seller*/
                new Product_data("ต้นที่1","พี่จีซอง","15",R.drawable.test_pic1,"ตลาดต้นไม้ ซอยที่ 1"),
                new Product_data("ต้นที่2","ป้าแม้ว","5",R.drawable.test_pic2,"ตลาดต้นไม้ ซอยที่ 2"),
                new Product_data("ต้นที่3","สมศรี","1",R.drawable.test_pic3,"ตลาดต้นไม้ ซอยที่ 3"),
                new Product_data("ต้นที่4","ปลาทอง","20",R.drawable.test_pic4,"ตลาดต้นไม้ ซอยที่ 4"),
                new Product_data("ต้นที่5","รวยทรัพย์","50",R.drawable.test_pic5,"ตลาดต้นไม้ ซอยที่ 5"),
                new Product_data("ต้นที่6","อิอิ","0",R.drawable.test_pic6,"ตลาดต้นไม้ ซอยที่ 6")

        };

        ProductAdapter ProductAdapter = new ProductAdapter(Product_data,Read_data_Activity.this);
        recyclerview.setAdapter(ProductAdapter);


        FloatingActionButton button_back_data_seller = findViewById(R.id.floatingBackButton);
        FloatingActionButton button_home_seller = findViewById(R.id.floatingBackHomeButton);

        button_back_data_seller.setOnClickListener(view -> {

           /*เช็กค่า boolean จากหน้าที่เปิดมาดู Data ว่าเป็น Seller หรือ Buyer คือ true-buyer และ false-seller*/
            if(getValue.Boolean_for_back_toseller_or_buyer_page_in_read_data){
                Intent in = new Intent(Read_data_Activity.this,Buyer.class);
                startActivity(in);
            }
            else {
                Intent in = new Intent(Read_data_Activity.this,Seller.class);
                startActivity(in);
            }
        });

        button_home_seller.setOnClickListener(view -> {
                Intent in = new Intent(Read_data_Activity.this,MainActivity.class);
                startActivity(in);
        });


    }
}