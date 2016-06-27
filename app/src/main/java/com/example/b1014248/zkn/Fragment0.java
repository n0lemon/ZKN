package com.example.b1014248.zkn;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by b1014248 on 2016/06/17.
 */
public class Fragment0 extends Fragment {
    ArrayList<AdapterItem> items;
    AdapterItem item;


    @Override
    public View onCreateView(LayoutInflater inflater,
                                       ViewGroup container, Bundle savedInstanceState) {

        /*ページもってくるとして
        　page=0 item(0)1.2
          page=1 item 3.4.5
          だからpage*3=posをつかう

         */

        Bundle bundle = getArguments();
        Integer i = bundle.getInt("page");
        int pos = i * 3;
        items = MainActivity.items;
        item = items.get(pos);

        LinearLayout layout = (LinearLayout) inflater.inflate(R.layout.fragment0, null);
        ImageView image1 = (ImageView) layout.findViewById(R.id.image1);
        ImageView image2 = (ImageView) layout.findViewById(R.id.image2);
        ImageView image3 = (ImageView) layout.findViewById(R.id.image3);
        TextView title1 = (TextView) layout.findViewById(R.id.title1);
        TextView title2 = (TextView) layout.findViewById(R.id.title2);
        TextView title3 = (TextView) layout.findViewById(R.id.title3);


        image1.setImageResource(item.getIcon());
        title1.setText(item.getT());
        pos++;
        if(items.size() > pos) {//あったら処理
            item = items.get(pos);
            image2.setImageResource(item.getIcon());
            title2.setText(item.getT());
        }
        pos++;
        if(items.size() > pos) {
            item = items.get(pos);
            image3.setImageResource(item.getIcon());
            title3.setText(item.getT());
        }

        return layout;

    }

}
