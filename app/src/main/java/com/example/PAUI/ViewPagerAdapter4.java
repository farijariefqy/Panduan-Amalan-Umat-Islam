package com.example.PAUI;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

public class ViewPagerAdapter4 extends RecyclerView.Adapter<ViewPagerAdapter4.ViewHolder> {

    private List<String> mData;
    private LayoutInflater mInflater;
    private ViewPager2 viewPager4;


    //    private int[] colorArray = new int[]{R.drawable.a,R.drawable.b,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a};
    private int[] colorArray = new int[]{ R.drawable.d1, R.drawable.d2,R.drawable.d3,
            R.drawable.d4,R.drawable.d5,R.drawable.d5,R.drawable.d7};

    ViewPagerAdapter4(Context context, List<String> data, ViewPager2 viewPager4) {
        this.mInflater = LayoutInflater.from(context);
        this.mData = data;
        this.viewPager4 = viewPager4;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_viewpager, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String animal = mData.get(position);
        holder.myTextView.setText(animal);

        holder.relativeLayout.setBackgroundResource(colorArray[position]);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView myTextView;
        RelativeLayout relativeLayout;
        Button button;

        ViewHolder(View itemView) {
            super(itemView);
            myTextView = itemView.findViewById(R.id.tvTitle);
            relativeLayout = itemView.findViewById(R.id.container);
            button = itemView.findViewById(R.id.btnToggle);
            button.setVisibility(View.GONE);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if(viewPager4.getOrientation() == ViewPager2.ORIENTATION_VERTICAL)
                        viewPager4.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);
                    else{
                        viewPager4.setOrientation(ViewPager2.ORIENTATION_VERTICAL);
                    }
                }
            });
        }
    }

}
