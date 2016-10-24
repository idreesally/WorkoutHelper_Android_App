package com.example.idrees.myapplication;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * Created by Idrees on 8/22/2016.
 */
public class FragmentA extends Fragment implements View.OnClickListener{
   // private View inflate;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_a, container, false);
        Button b1 = (Button)inflate.findViewById(R.id.button1);
        Button b2 = (Button)inflate.findViewById(R.id.button2);
        Button b3 = (Button)inflate.findViewById(R.id.button3);
        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/good_times.ttf");
        b1.setTypeface(font);
        b2.setTypeface(font);
        b3.setTypeface(font);

        b3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                getActivity().moveTaskToBack(true);
                getActivity().finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            // @Override
            public void onClick(View view) {
                /*switch (view.getId()) {
                    case R.id.button1:
                        //what to put here
                        FragmentManager fm = getFragmentManager();
                        FragmentTransaction ft = fm.beginTransaction();
                        ft.replace(R.id.fragment_a_id, newFragment, "fragment_screen");
                        ft.addToBackStack(null);
                        ft.commit();
                        break;
                }*/

                MainActivity.viewPager.setCurrentItem(1, true);
            }

        });



        //return inflater.inflate(R.layout.fragment_a, container, false);
        return inflate;
    }

    @Override
    public void onClick(View view) {
       // MainActivity.viewPager.setCurrentItem(1, true);
    }

}

