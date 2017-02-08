package com.example.administrator.recycleviewpubuliu.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.recycleviewpubuliu.R;
import com.example.administrator.recycleviewpubuliu.bean.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/2/8.
 */

public class MasonryAdapter extends RecyclerView.Adapter<MasonryAdapter.MosonryView> {
    private List<Product> productLists = new ArrayList<>();

    public MasonryAdapter(List<Product> productLists){
        this.productLists = productLists ;
    }


    @Override
    public MosonryView onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.masonry_item,parent,false) ;
        return new MosonryView(view);
    }

    @Override
    public void onBindViewHolder(MosonryView holder, int position) {
        if (null != productLists && productLists.size() > position) {
            Product product = productLists.get(position);
            holder.img.setImageResource(product.getImg());
            holder.title.setText(product.getTitle());
        }
    }

    @Override
    public int getItemCount() {
        return productLists.size();
    }


    public static class MosonryView extends RecyclerView.ViewHolder{

        ImageView img ;
        TextView title ;

        public MosonryView(View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.iv_masonry_item_img);
            title = (TextView) itemView.findViewById(R.id.masonry_item_title);

        }
    }

}
