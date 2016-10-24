package com.example.idrees.myapplication;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import java.util.concurrent.TimeUnit;

/**
 * Created by Idrees on 8/22/2016.
 */
public class FragmentC extends Fragment{

    Button startButton, stopButton;
    TextView textTime;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_c, container, false);

        startButton = (Button) inflate.findViewById(R.id.btnStart);
        stopButton = (Button) inflate.findViewById(R.id.btnStop);
        textTime = (TextView) inflate.findViewById(R.id.textTime);

        textTime.setText("03:00");

        final CounterClass timer = new CounterClass(180000, 1000);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timer.start();
            }
        });

        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timer.cancel();
            }
        });

        return inflate;
    }

    public class CounterClass extends CountDownTimer{

        public CounterClass(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {

            long millis = millisUntilFinished;
            String minSec = String.format("%02d:%02d", TimeUnit.MILLISECONDS.toMinutes(millis)
                    - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millis)),
                    TimeUnit.MILLISECONDS.toSeconds(millis)
                            - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis)));

            Log.d("TIME IS: ", minSec);
            textTime.setText(minSec);
        }

        @Override
        public void onFinish() {
            textTime.setText("GET UP!");
        }
    }
}
