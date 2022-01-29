package com.example.smilyrating;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.hsalf.smileyrating.SmileyRating;

public class MainActivity extends AppCompatActivity implements SmileyRating.OnSmileySelectedListener {

    private static final String TAG = "MainActivity";

    private SmileyRating mSmileRating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSmileRating = (SmileyRating) findViewById(R.id.ratingView);
        mSmileRating.setSmileySelectedListener(this);
    }


    @Override
    public void onSmileySelected(SmileyRating.Type type) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
