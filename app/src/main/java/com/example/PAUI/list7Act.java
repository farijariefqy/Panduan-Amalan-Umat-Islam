package com.example.PAUI;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

public class list7Act extends AppCompatActivity {

    ViewPager2 viewPager7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list7);

        viewPager7 = findViewById(R.id.viewPager7);

        List<String> list = new ArrayList<>();
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");

        viewPager7.setAdapter(new ViewPagerAdapter7(this, list, viewPager7));

    }
}

