package com.bitcode.sep_24_recyclerview_demo_day1;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ProductViewHolder> {
    ArrayList<String> products;

    public ProductsAdapter(ArrayList<String> products){
        this.products = products;
    }

    class ProductViewHolder extends RecyclerView.ViewHolder{
        TextView txtProduct;
        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            txtProduct = (TextView) itemView;
        }
    }

    @SuppressLint("ResourceAsColor")
    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        TextView txtProductView = new TextView(parent.getContext());

        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        txtProductView.setLayoutParams(layoutParams);
        txtProductView.setPadding(10,10,10,10);
        txtProductView.setTextColor(R.color.black);
        txtProductView.setTextSize(30.0F);
        return new ProductViewHolder(txtProductView);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
            holder.txtProduct.setText(products.get(position));
    }

    @Override
    public int getItemCount() {
        return products.size();
    }
}
