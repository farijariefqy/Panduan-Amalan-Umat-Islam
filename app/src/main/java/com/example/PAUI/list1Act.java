package com.example.PAUI;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

public class list1Act extends AppCompatActivity {

    ViewPager2 viewPager1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list1);

        viewPager1 = findViewById(R.id.viewPager1);

        List<String> list = new ArrayList<>();
        list.add("");
        list.add("");
        list.add("");


        viewPager1.setAdapter(new ViewPagerAdapter1(this, list, viewPager1));

    }
}

