package com.example.b1014248.zkn;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static ArrayList<AdapterItem> items;
    ViewPager viewPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items = new ArrayList<AdapterItem>();

        int c=1;//画像入れるのに一時ふらぐ的に使ってる的な

        for (int i = 0; i < 13; i++) {//13=魚の数
            AdapterItem item = new AdapterItem();


            if(c==1){//画像入れてるだけ
                item.setIcon(R.drawable.sakana);
            }else if(c==2){
                item.setIcon(R.drawable.kurione);
            }else {
                item.setIcon(R.drawable.kurage);
                c = 0;
            }

            item.setTitle("タイトル" + i);//引っ張ってくる
            item.setDe("説明" + i);
            item.setCo(i * 100 + "回");
            items.add(item);
            c++;
        }//構成OK

        viewPager = (ViewPager) findViewById(R.id.pager);
        viewPager.setAdapter( new MyFragmentStatePagerAdapter( getSupportFragmentManager()));

    }
}
