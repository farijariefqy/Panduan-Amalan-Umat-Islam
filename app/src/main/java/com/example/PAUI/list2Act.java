package com.example.PAUI;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

public class list2Act extends AppCompatActivity {

    ViewPager2 viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list2);

        viewPager2 = findViewById(R.id.viewPager2);

        List<String> list = new ArrayList<>();
        list.add("");
        list.add("");
        list.add("");
        list.add("");

        viewPager2.setAdapter(new ViewPagerAdapter2(this, list, viewPager2));

    }
}

