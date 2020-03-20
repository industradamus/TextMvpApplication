package com.example.textmvpapplication.secondscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.textmvpapplication.R;

public class SecondActivity extends AppCompatActivity implements SecondActivityContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    @Override
    public void showLoader() {

    }

    @Override
    public void hideLoader() {

    }

    @Override
    public void handleError() {

    }
}
