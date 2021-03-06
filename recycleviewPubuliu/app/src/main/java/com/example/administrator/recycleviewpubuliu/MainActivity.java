package com.example.administrator.recycleviewpubuliu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
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
//       RecyclerView本身提供了三个LayoutManager的实现：
//        LinearLayoutManager  等同一般的listview
//        GridLayoutManager     等同gridviews
//        StaggeredGridLayoutManager 瀑布流的方式
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL));
//        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        adapter = new MasonryAdapter(productList) ;
        recyclerView.setAdapter(adapter);

        //给每个item设置外边距
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
        productList.add(new Product(R.drawable.k,"k"));
        productList.add(new Product(R.drawable.l,"l"));
        productList.add(new Product(R.drawable.m,"m"));
        productList.add(new Product(R.drawable.n,"n"));
        productList.add(new Product(R.drawable.o,"o"));
        productList.add(new Product(R.drawable.p,"p"));
        productList.add(new Product(R.drawable.q,"q"));

        adapter.notifyDataSetChanged();
    }
}
