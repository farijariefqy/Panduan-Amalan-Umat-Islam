package com.example.PAUI;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

public class list4Act extends AppCompatActivity {

    ViewPager2 viewPager4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list4);

        viewPager4 = findViewById(R.id.viewPager4);

        List<String> list = new ArrayList<>();
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");



        viewPager4.setAdapter(new ViewPagerAdapter4(this, list, viewPager4));

    }
}

