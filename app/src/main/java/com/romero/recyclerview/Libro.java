package com.romero.recyclerview;

/**
 * Created by Sara on 18/4/2018.
 */

public class Libro {
    private String name;
    private String chaps;
    private String desc;
    private int img;

    public Libro(String name, String chaps, int img, String desc){
        this.name=name;
        this.chaps=chaps;
        this.img=img;
        this.desc=desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChaps() {
        return chaps;
    }

    public void setChaps(String chaps) {
        this.chaps = chaps;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
