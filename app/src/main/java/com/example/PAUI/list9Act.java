package com.example.PAUI;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

public class list9Act extends AppCompatActivity {

    ViewPager2 viewPager9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list9);

        viewPager9 = findViewById(R.id.viewPager9);

        List<String> list = new ArrayList<>();
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");


        viewPager9.setAdapter(new ViewPagerAdapter9(this, list, viewPager9));

    }
}

