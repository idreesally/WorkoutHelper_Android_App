package com.example.idrees.myapplication;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.view.PagerTitleStrip;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Idrees on 8/27/2016.
 */
public class CustomFontPagerTitleStrip extends PagerTitleStrip {
    //Moved typeface instantiation here, only required once.
    Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/good_times.ttf");

    public CustomFontPagerTitleStrip(Context context) {
        super(context);
    }
    public CustomFontPagerTitleStrip(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

        super.onLayout(changed, l, t, r, b);
        for (int i=0; i<this.getChildCount(); i++) {
            if (this.getChildAt(i) instanceof TextView) {
                ((TextView)this.getChildAt(i)).setTypeface(tf);
            }
        }
    }
}