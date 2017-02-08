package com.example.administrator.recycleviewpubuliu.bean;

/**
 * Created by Administrator on 2017/2/8.
 */

public class Product {

    private int img;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    private String title;

    public Product(int img, String title){
        this.img = img ;
        this.title = title ;
    }



}
