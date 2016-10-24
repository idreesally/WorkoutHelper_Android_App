package com.example.idrees.myapplication;

import android.graphics.Typeface;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerTitleStrip;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends FragmentActivity {

    public static ViewPager viewPager=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.pager);
        FragmentManager fragmentManager = getSupportFragmentManager();
        viewPager.setAdapter(new MyAdapter(fragmentManager));

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Testing", "On Destroy .....");
    }

    @Override
    public void onBackPressed(){
        moveTaskToBack(true);
        Log.i("Testing", "On BackPressed .....");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Testing", "On Pause .....");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Testing", "On Restart .....");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Testing", "On Resume .....");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Testing", "On Start .....");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Testing", "On Stop .....");
    }
}

class MyAdapter extends FragmentStatePagerAdapter{


    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        //Log.d("idrees", "getItem is called" + position);
        if(position==0) fragment = new FragmentA();
        if(position==1) fragment = new FragmentB();
        if(position==2) fragment = new FragmentC();

        return fragment;
    }

    @Override
    public int getCount() {
        //Log.d("idrees", "getCount is called");
        return 3; //we have 3 pages
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0) return "HOME";
        if(position == 1) return "WORKOUT";
        if(position == 2) return "TIMER";
        return null;
    }
}