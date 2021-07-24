package com.example.PAUI;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

public class list10Act extends AppCompatActivity {

    ViewPager2 viewPager10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list10);

        viewPager10 = findViewById(R.id.viewPager10);

        List<String> list = new ArrayList<>();
        list.add("");
        list.add("");



        viewPager10.setAdapter(new ViewPagerAdapter10(this, list, viewPager10));

    }
}

