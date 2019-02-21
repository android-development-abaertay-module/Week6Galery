package com.bodovix.simplegallerydemoweek6;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context context;

    // references to images
    private Integer[] thumbs = {
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7,
            R.drawable.sample_0, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7,
            R.drawable.sample_0, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7
    };

    public ImageAdapter(Context c){
        context = c;
    }

    @Override
    public int getCount() {
        return thumbs.length;
    }

    @Override
    public Object getItem(int position) {
        // This is where we normally return the data object.
        // since we don't use objects to store images, return drawable id (int)
        Log.w("ADAPTER", "Returning ID at position: " + position);
        return thumbs[position];
    }

    @Override
    public long getItemId(int position) {
        // not used in this example
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // If view is not recycled, (re)initialise it
            imageView = new ImageView(context);
            imageView.setLayoutParams(new GridView.LayoutParams(285, 285));
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setPadding(4, 4, 4, 4);
        } else {
            // otherwise, use the original
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(thumbs[position]);
        return imageView;
    }
}
