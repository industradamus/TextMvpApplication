package com.example.textmvpapplication.firstscreen;

import android.os.Handler;

import com.example.textmvpapplication.base.BasePresenter;


public class FirstActivityPresenter extends BasePresenter<FirstActivityContract.View> implements FirstActivityContract.Presenter{

    @Override
    public void loadData() {
        view.showLoader();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                view.hideLoader();
                view.updateUi("Data Loaded");
            }
        }, 5000);
    }

    @Override
    public void onClickNext() {
        view.showLoader();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                view.hideLoader();
                view.openSecondActivity();
            }
        }, 5000);
    }
}
