package com.bitcode.sep_24_recyclerview_demo_day1;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ProductsAdapter productsAdapter;
    RecyclerView productsRecyclerView;
    ArrayList<String> productsList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        initializeArrayList();
        initViews();
    }

    private void initViews(){
        productsRecyclerView = findViewById(R.id.productsRecyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,
                false);

        productsRecyclerView.setLayoutManager(linearLayoutManager);

        productsAdapter = new ProductsAdapter(productsList);
        productsRecyclerView.setAdapter(productsAdapter);
    }

    private void initializeArrayList(){
        productsList = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            productsList.add("T Shirt" + i);
            productsList.add("Laptop" + i);
            productsList.add("iPhone" + i);
            productsList.add("Android" + i);
        }
    }
}