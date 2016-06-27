package com.example.b1014248.zkn;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by b1014248 on 2016/06/17.
 */
public class AdapterItem extends AppCompatActivity {
    public int icon;
    public String title;
    public String de;
    public String co;

    public void setIcon(int icon){
        this.icon = icon;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setDe(String de){
        this.de = de;
    }

    public void setCo(String co){
        this.co = co;
    }

    public int getIcon(){
        return this.icon;
    }

    public String getT(){
        return title;
    }
}
