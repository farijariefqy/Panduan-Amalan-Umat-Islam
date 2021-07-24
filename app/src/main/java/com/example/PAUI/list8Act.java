package com.example.PAUI;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

public class list8Act extends AppCompatActivity {

    ViewPager2 viewPager8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list8);

        viewPager8 = findViewById(R.id.viewPager8);

        List<String> list = new ArrayList<>();
        list.add("");
        list.add("");
        list.add("");


        viewPager8.setAdapter(new ViewPagerAdapter8(this, list, viewPager8));

    }
}

