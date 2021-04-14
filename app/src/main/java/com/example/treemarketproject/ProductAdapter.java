package com.example.treemarketproject;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {

    Product_data[] Product_data;
    Context context;
    private static final String TAG = "ProductAdapter";
    /*Class เพื่อนดึงข้อมูลแค่ รูป ชื่อร้าน จำนวน ชื่อสินค้า มาโชว์หน้าดูสินค้าเฉยๆ*/

    public ProductAdapter (Product_data[] Product_data,Context context){
        this.Product_data = Product_data;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.product_item_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {

        final Product_data Product_data_list = Product_data[position];

        viewHolder.text_name_product.setText(Product_data_list.getProductName());
        viewHolder.text_num_product.setText(Product_data_list.getProductNumber());
        viewHolder.text_shop.setText(Product_data_list.getShopName());
        viewHolder.image_product.setImageResource(Product_data_list.getProductImage());


        Log.d(TAG, "onBindViewHolder: called.");


        Glide.with(context)
                .asBitmap()
                .load(Product_data_list.getProductImage())
                .into(viewHolder.image_product);

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*ใส่ Click listener เมื่อกดเข้าหน้าข้อมูลสินค้า*/
                Toast.makeText(context,Product_data_list.getProductName(),Toast.LENGTH_SHORT).show();

/*ถ้าค่า Boolean_for_back_toseller_or_buyer_page_in_read_data เป็น true เปิดหน้าดูข้อมูลของ Buyer ถ้า false เป็น ของ seller*/
                Intent intent = new Intent(context,Detail_data_buyer_Activity.class);
                if(getValue.Boolean_for_back_toseller_or_buyer_page_in_read_data){
                    intent = new Intent(context,Detail_data_buyer_Activity.class);
                }
                else {
                    intent = new Intent(context,Detail_data_seller_Activity.class);
                }

                    intent.putExtra("image_url",Product_data_list.getProductImage());
                    intent.putExtra("shop_name",Product_data_list.getShopName());
                    intent.putExtra("product_num",Product_data_list.getProductNumber());
                    intent.putExtra("product_name",Product_data_list.getProductName());
                    intent.putExtra("shop_address",Product_data_list.getShopAddress());
                    context.startActivities(new Intent[]{intent});


            }
        });

    }

    @Override
    public int getItemCount() {
        return Product_data.length;
    }

    /*Crate กล่องข้อความที่หน้าดูสินค้า*/

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView image_product;
        TextView text_name_product;
        TextView text_shop;
        TextView text_num_product;


        public ViewHolder (@NonNull View itemView){
            super(itemView);

            image_product = itemView.findViewById(R.id.imageView_product);
            text_name_product = itemView.findViewById(R.id.textView_name_product);
            text_shop = itemView.findViewById(R.id.textView_shop_name);
            text_num_product = itemView.findViewById(R.id.textView_num_of_product);
        }

    }
}
