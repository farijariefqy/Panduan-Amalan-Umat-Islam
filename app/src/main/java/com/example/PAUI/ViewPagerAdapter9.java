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

public class ViewPagerAdapter9 extends RecyclerView.Adapter<ViewPagerAdapter9.ViewHolder> {

    private List<String> mData;
    private LayoutInflater mInflater;
    private ViewPager2 viewPager9;


    //    private int[] colorArray = new int[]{R.drawable.a,R.drawable.b,R.drawable.a,R.drawable.a,R.drawable.a,R.drawable.a};
    private int[] colorArray = new int[]{ R.drawable.i1, R.drawable.i2, R.drawable.i3, R.drawable.i4, R.drawable.i5
            , R.drawable.i6, R.drawable.i7};

    ViewPagerAdapter9(Context context, List<String> data, ViewPager2 viewPager9) {
        this.mInflater = LayoutInflater.from(context);
        this.mData = data;
        this.viewPager9 = viewPager9;
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


                    if(viewPager9.getOrientation() == ViewPager2.ORIENTATION_VERTICAL)
                        viewPager9.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);
                    else{
                        viewPager9.setOrientation(ViewPager2.ORIENTATION_VERTICAL);
                    }
                }
            });
        }
    }

}
