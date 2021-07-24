package com.example.PAUI;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

public class list5Act extends AppCompatActivity {

    ViewPager2 viewPager5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list5);

        viewPager5 = findViewById(R.id.viewPager5);

        List<String> list = new ArrayList<>();
        list.add("");
        list.add("");
        viewPager5.setAdapter(new ViewPagerAdapter5(this, list, viewPager5));

    }
}

