package com.example.PAUI;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

public class list3Act extends AppCompatActivity {

    ViewPager2 viewPager3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list3);

        viewPager3 = findViewById(R.id.viewPager3);

        List<String> list = new ArrayList<>();
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");

        viewPager3.setAdapter(new ViewPagerAdapter3(this, list, viewPager3));

    }
}

