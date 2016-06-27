package com.example.b1014248.zkn;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
//import android.support.v4.app.FragmentTransaction;

import java.util.ArrayList;

/**
 * Created by b1014248 on 2016/06/17.
 */
public class MyFragmentStatePagerAdapter extends FragmentStatePagerAdapter {
    private ArrayList<AdapterItem> items;


    public MyFragmentStatePagerAdapter(FragmentManager fm) {
        super(fm);
        items = MainActivity.items;
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = new Fragment0();
        Bundle bundle = new Bundle();
        bundle.putInt("page",i );
        fragment.setArguments(bundle);

        return fragment;

    }


    @Override
    public int getCount() {
        int i = items.size();
        if(i%3==0){
            i = (i)/3;
        }else{
            i = ((i)/3)+1;
        }
        return i;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Page " + position;
    }
}
