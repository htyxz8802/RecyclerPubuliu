package com.example.administrator.recycleviewpubuliu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.example.administrator.recycleviewpubuliu.adapter.MasonryAdapter;
import com.example.administrator.recycleviewpubuliu.bean.Product;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView ;
    private List<Product> productList = new ArrayList<>();
    private MasonryAdapter adapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) this.findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        adapter = new MasonryAdapter(productList) ;
        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new SpacesItemDecoration(16));
    }


    @Override
    protected void onResume() {
        super.onResume();
        initData();
    }

    void initData(){
        productList.add(new Product(R.drawable.a,"a"));
        productList.add(new Product(R.drawable.b,"b"));
        productList.add(new Product(R.drawable.c,"c"));
        productList.add(new Product(R.drawable.d,"d"));
        productList.add(new Product(R.drawable.e,"e"));
        productList.add(new Product(R.drawable.f,"f"));
        productList.add(new Product(R.drawable.g,"g"));
        productList.add(new Product(R.drawable.h,"h"));
        productList.add(new Product(R.drawable.i,"i"));
        productList.add(new Product(R.drawable.j,"j"));

        adapter.notifyDataSetChanged();
    }
}
