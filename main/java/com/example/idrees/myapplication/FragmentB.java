package com.example.idrees.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Idrees on 8/22/2016.
 */
public class FragmentB extends Fragment implements View.OnClickListener, View.OnFocusChangeListener {
    //private View inflate;

    final int MAX_NUM_OF_REPS = 15;
    int e1RepMax;
    int e2RepMax;
    int e3RepMax;
    int e4RepMax;
    int e5RepMax;
    int e6RepMax;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View inflate = inflater.inflate(R.layout.fragment_b, container, false);

        //---------------- EXERCISE 1: START ---------------//
        EditText e1Name = (EditText)inflate.findViewById(R.id.exercise1);
        e1Name.setOnFocusChangeListener(this);

        EditText e1RepsText = (EditText)inflate.findViewById(R.id.e1Reps);
        e1RepsText.setOnFocusChangeListener(this);
        setRepsOnEnter(e1RepsText);

        Button e1DoneButton = (Button)inflate.findViewById(R.id.e1DoneButton);
        setDoneOnClick(e1DoneButton, e1RepsText);

        Button e1B1 = (Button)inflate.findViewById(R.id.e1Button1);
        Button e1B2 = (Button)inflate.findViewById(R.id.e1Button2);
        Button e1B3 = (Button)inflate.findViewById(R.id.e1Button3);
        Button e1B4 = (Button)inflate.findViewById(R.id.e1Button4);
        Button e1B5 = (Button)inflate.findViewById(R.id.e1Button5);

        setOnClick(e1B1);// e1RepCounter);
        setOnClick(e1B2);// e1RepMax);
        setOnClick(e1B3);// e1RepMax);
        setOnClick(e1B4);// e1RepMax);
        setOnClick(e1B5);// e1RepMax);

        //----------------- EXERCISE 1: END ----------------//
        //---------------- EXERCISE 2: START ---------------//
        EditText e2Name = (EditText)inflate.findViewById(R.id.exercise2);
        e2Name.setOnFocusChangeListener(this);

        EditText e2RepsText = (EditText)inflate.findViewById(R.id.e2Reps);
        e2RepsText.setOnFocusChangeListener(this);
        setRepsOnEnter(e2RepsText);

        Button e2DoneButton = (Button)inflate.findViewById(R.id.e2DoneButton);
        setDoneOnClick(e2DoneButton, e2RepsText);

        Button e2B1 = (Button)inflate.findViewById(R.id.e2Button1);
        Button e2B2 = (Button)inflate.findViewById(R.id.e2Button2);
        Button e2B3 = (Button)inflate.findViewById(R.id.e2Button3);
        Button e2B4 = (Button)inflate.findViewById(R.id.e2Button4);
        Button e2B5 = (Button)inflate.findViewById(R.id.e2Button5);

        setOnClick(e2B1);// e1RepCounter);
        setOnClick(e2B2);// e1RepMax);
        setOnClick(e2B3);// e1RepMax);
        setOnClick(e2B4);// e1RepMax);
        setOnClick(e2B5);// e1RepMax);

        //---------------- EXERCISE 2: END ---------------//
        //---------------- EXERCISE 3: START ---------------//

        EditText e3Name = (EditText)inflate.findViewById(R.id.exercise3);
        e3Name.setOnFocusChangeListener(this);

        EditText e3RepsText = (EditText)inflate.findViewById(R.id.e3Reps);
        e3RepsText.setOnFocusChangeListener(this);
        setRepsOnEnter(e3RepsText);

        Button e3DoneButton = (Button)inflate.findViewById(R.id.e3DoneButton);
        setDoneOnClick(e3DoneButton, e3RepsText);

        Button e3B1 = (Button)inflate.findViewById(R.id.e3Button1);
        Button e3B2 = (Button)inflate.findViewById(R.id.e3Button2);
        Button e3B3 = (Button)inflate.findViewById(R.id.e3Button3);
        Button e3B4 = (Button)inflate.findViewById(R.id.e3Button4);
        Button e3B5 = (Button)inflate.findViewById(R.id.e3Button5);

        setOnClick(e3B1);// e1RepCounter);
        setOnClick(e3B2);// e1RepMax);
        setOnClick(e3B3);// e1RepMax);
        setOnClick(e3B4);// e1RepMax);
        setOnClick(e3B5);// e1RepMax);

        //---------------- EXERCISE 3: END ---------------//
        //---------------- EXERCISE 4: START ---------------//

        EditText e4Name = (EditText)inflate.findViewById(R.id.exercise4);
        e4Name.setOnFocusChangeListener(this);

        EditText e4RepsText = (EditText)inflate.findViewById(R.id.e4Reps);
        e4RepsText.setOnFocusChangeListener(this);
        setRepsOnEnter(e4RepsText);

        Button e4DoneButton = (Button)inflate.findViewById(R.id.e4DoneButton);
        setDoneOnClick(e4DoneButton, e4RepsText);

        Button e4B1 = (Button)inflate.findViewById(R.id.e4Button1);
        Button e4B2 = (Button)inflate.findViewById(R.id.e4Button2);
        Button e4B3 = (Button)inflate.findViewById(R.id.e4Button3);
        Button e4B4 = (Button)inflate.findViewById(R.id.e4Button4);
        Button e4B5 = (Button)inflate.findViewById(R.id.e4Button5);

        setOnClick(e4B1);// e1RepCounter);
        setOnClick(e4B2);// e1RepMax);
        setOnClick(e4B3);// e1RepMax);
        setOnClick(e4B4);// e1RepMax);
        setOnClick(e4B5);// e1RepMax);

        //---------------- EXERCISE 4: END ---------------//
        //---------------- EXERCISE 5: START ---------------//

        EditText e5Name = (EditText)inflate.findViewById(R.id.exercise5);
        e5Name.setOnFocusChangeListener(this);

        EditText e5RepsText = (EditText)inflate.findViewById(R.id.e5Reps);
        e5RepsText.setOnFocusChangeListener(this);
        setRepsOnEnter(e5RepsText);

        Button e5DoneButton = (Button)inflate.findViewById(R.id.e5DoneButton);
        setDoneOnClick(e5DoneButton, e5RepsText);

        Button e5B1 = (Button)inflate.findViewById(R.id.e5Button1);
        Button e5B2 = (Button)inflate.findViewById(R.id.e5Button2);
        Button e5B3 = (Button)inflate.findViewById(R.id.e5Button3);
        Button e5B4 = (Button)inflate.findViewById(R.id.e5Button4);
        Button e5B5 = (Button)inflate.findViewById(R.id.e5Button5);

        setOnClick(e5B1);// e1RepCounter);
        setOnClick(e5B2);// e1RepMax);
        setOnClick(e5B3);// e1RepMax);
        setOnClick(e5B4);// e1RepMax);
        setOnClick(e5B5);// e1RepMax);

        //---------------- EXERCISE 5: END ---------------//
        //---------------- EXERCISE 6: START ---------------//

        EditText e6Name = (EditText)inflate.findViewById(R.id.exercise6);
        e6Name.setOnFocusChangeListener(this);

        EditText e6RepsText = (EditText)inflate.findViewById(R.id.e6Reps);
        e6RepsText.setOnFocusChangeListener(this);
        setRepsOnEnter(e6RepsText);

        Button e6DoneButton = (Button)inflate.findViewById(R.id.e6DoneButton);
        setDoneOnClick(e6DoneButton, e6RepsText);

        Button e6B1 = (Button)inflate.findViewById(R.id.e6Button1);
        Button e6B2 = (Button)inflate.findViewById(R.id.e6Button2);
        Button e6B3 = (Button)inflate.findViewById(R.id.e6Button3);
        Button e6B4 = (Button)inflate.findViewById(R.id.e6Button4);
        Button e6B5 = (Button)inflate.findViewById(R.id.e6Button5);

        setOnClick(e6B1);// e1RepCounter);
        setOnClick(e6B2);// e1RepMax);
        setOnClick(e6B3);// e1RepMax);
        setOnClick(e6B4);// e1RepMax);
        setOnClick(e6B5);// e1RepMax);

        //---------------- EXERCISE 6: END ---------------//
        return inflate;
    }

    private void setRepsOnEnter(final EditText text) {

        text.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if(event.getAction() == KeyEvent.ACTION_DOWN)
                {
                    if((keyCode == KeyEvent.KEYCODE_ENTER || keyCode == KeyEvent.KEYCODE_DPAD_CENTER))
                    {
                        if(v.getId() == R.id.e1Reps)
                        {
                            Log.d("IDs match", Integer.toString(R.id.e1Reps));
                            e1RepMax = Integer.parseInt(text.getText().toString());
                            if(e1RepMax > MAX_NUM_OF_REPS) e1RepMax = MAX_NUM_OF_REPS;
                            Log.d("Exercise 1 repmax is ", Integer.toString(e1RepMax));
                        }
                        if(v.getId() == R.id.e2Reps)
                        {
                            Log.d("IDs match", Integer.toString(R.id.e2Reps));
                            e2RepMax = Integer.parseInt(text.getText().toString());
                            if(e2RepMax > MAX_NUM_OF_REPS) e2RepMax = MAX_NUM_OF_REPS;
                            Log.d("Exercise 2 repmax is ", Integer.toString(e2RepMax));
                        }
                        if(v.getId() == R.id.e3Reps)
                        {
                            Log.d("IDs match", Integer.toString(R.id.e3Reps));
                            e3RepMax = Integer.parseInt(text.getText().toString());
                            if(e3RepMax > MAX_NUM_OF_REPS) e3RepMax = MAX_NUM_OF_REPS;
                            Log.d("Exercise 3 repmax is ", Integer.toString(e3RepMax));
                        }
                        if(v.getId() == R.id.e4Reps)
                        {
                            Log.d("IDs match", Integer.toString(R.id.e4Reps));
                            e4RepMax = Integer.parseInt(text.getText().toString());
                            if(e4RepMax > MAX_NUM_OF_REPS) e4RepMax = MAX_NUM_OF_REPS;
                            Log.d("Exercise 4 repmax is ", Integer.toString(e4RepMax));
                        }
                        if(v.getId() == R.id.e5Reps)
                        {
                            Log.d("IDs match", Integer.toString(R.id.e5Reps));
                            e5RepMax = Integer.parseInt(text.getText().toString());
                            if(e5RepMax > MAX_NUM_OF_REPS) e5RepMax = MAX_NUM_OF_REPS;
                            Log.d("Exercise 5 repmax is ", Integer.toString(e5RepMax));
                        }
                        if(v.getId() == R.id.e6Reps)
                        {
                            Log.d("IDs match", Integer.toString(R.id.e6Reps));
                            e6RepMax = Integer.parseInt(text.getText().toString());
                            if(e6RepMax > MAX_NUM_OF_REPS) e6RepMax = MAX_NUM_OF_REPS;
                            Log.d("Exercise 6 repmax is ", Integer.toString(e6RepMax));
                        }
                        return true;
                    }
                    return false;
                }
                return false;
            }
        });
    }

    private void setDoneOnClick(Button btn, final EditText text){
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(view.getId() == R.id.e1DoneButton) {
                    try {
                        e1RepMax = Integer.parseInt(text.getText().toString());
                    }
                    catch (NumberFormatException nfe){
                        Log.d("NO USER INPUT", "!");
                    }
                    if (e1RepMax > MAX_NUM_OF_REPS) e1RepMax = MAX_NUM_OF_REPS;
                    Log.d("Exercise 1 repmax is ", Integer.toString(e1RepMax));
                }
                if(view.getId() == R.id.e2DoneButton) {
                    try {
                        e2RepMax = Integer.parseInt(text.getText().toString());
                    }
                    catch (NumberFormatException nfe){
                        Log.d("NO USER INPUT", "!");
                    }
                    if (e2RepMax > MAX_NUM_OF_REPS) e2RepMax = MAX_NUM_OF_REPS;
                    Log.d("Exercise 2 repmax is ", Integer.toString(e2RepMax));
                }
                if(view.getId() == R.id.e3DoneButton) {
                    try {
                        e3RepMax = Integer.parseInt(text.getText().toString());
                    }
                    catch (NumberFormatException nfe){
                        Log.d("NO USER INPUT", "!");
                    }
                    if (e3RepMax > MAX_NUM_OF_REPS) e3RepMax = MAX_NUM_OF_REPS;
                    Log.d("Exercise 3 repmax is ", Integer.toString(e3RepMax));
                }
                if(view.getId() == R.id.e4DoneButton) {
                    try {
                        e4RepMax = Integer.parseInt(text.getText().toString());
                    }
                    catch (NumberFormatException nfe){
                        Log.d("NO USER INPUT", "!");
                    }
                    if (e4RepMax > MAX_NUM_OF_REPS) e4RepMax = MAX_NUM_OF_REPS;
                    Log.d("Exercise 4 repmax is ", Integer.toString(e4RepMax));
                }
                if(view.getId() == R.id.e5DoneButton) {
                    try {
                        e5RepMax = Integer.parseInt(text.getText().toString());
                    }
                    catch (NumberFormatException nfe){
                        Log.d("NO USER INPUT", "!");
                    }
                    if (e5RepMax > MAX_NUM_OF_REPS) e5RepMax = MAX_NUM_OF_REPS;
                    Log.d("Exercise 5 repmax is ", Integer.toString(e5RepMax));
                }
                if(view.getId() == R.id.e6DoneButton) {
                    try {
                        e6RepMax = Integer.parseInt(text.getText().toString());
                    }
                    catch (NumberFormatException nfe){
                        Log.d("NO USER INPUT", "!");
                    }
                    if (e6RepMax > MAX_NUM_OF_REPS) e6RepMax = MAX_NUM_OF_REPS;
                    Log.d("Exercise 6 repmax is ", Integer.toString(e6RepMax));
                }
            }
        });
    }

    private void setOnClick(final Button btn){//, final int repMax) {

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                int repCount = Integer.parseInt(btn.getText().toString());
                repCount++;

                if(view.getId() == R.id.e1Button1 || view.getId() == R.id.e1Button2 || view.getId() == R.id.e1Button3 ||
                        view.getId() == R.id.e1Button4 || view.getId() == R.id.e1Button5)
                {
                    if(repCount >= e1RepMax+1) repCount = 0;

                }
                if(view.getId() == R.id.e2Button1 || view.getId() == R.id.e2Button2 || view.getId() == R.id.e2Button3 ||
                        view.getId() == R.id.e2Button4 || view.getId() == R.id.e2Button5)
                {
                    if(repCount >= e2RepMax+1) repCount = 0;
                }
                if(view.getId() == R.id.e3Button1 || view.getId() == R.id.e3Button2 || view.getId() == R.id.e3Button3 ||
                        view.getId() == R.id.e3Button4 || view.getId() == R.id.e3Button5)
                {
                    if(repCount >= e3RepMax+1) repCount = 0;
                }
                if(view.getId() == R.id.e4Button1 || view.getId() == R.id.e4Button2 || view.getId() == R.id.e4Button3 ||
                        view.getId() == R.id.e4Button4 || view.getId() == R.id.e4Button5)
                {
                    if(repCount >= e4RepMax+1) repCount = 0;
                }
                if(view.getId() == R.id.e5Button1 || view.getId() == R.id.e5Button2 || view.getId() == R.id.e5Button3 ||
                        view.getId() == R.id.e5Button4 || view.getId() == R.id.e5Button5)
                {
                    if(repCount >= e5RepMax+1) repCount = 0;
                }
                if(view.getId() == R.id.e6Button1 || view.getId() == R.id.e6Button2 || view.getId() == R.id.e6Button3 ||
                        view.getId() == R.id.e6Button4 || view.getId() == R.id.e6Button5)
                {
                    if(repCount >= e6RepMax+1) repCount = 0;
                }
                //if(repCount == e1RepMax+1) repCount = 0;
                btn.setText(Integer.toString(repCount));
            }
        });
    }

    @Override
    public void onFocusChange(View v, boolean hasFocus) {
        if (!hasFocus) {
            hideKeyboard(v);
        }
    }

    public void hideKeyboard(View view) {
        InputMethodManager inputMethodManager =(InputMethodManager)getActivity().getSystemService(Activity.INPUT_METHOD_SERVICE);
        //might need to get rid of the Activity in activity.input_method
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    @Override
    public void onClick(View view) {

    }

}
