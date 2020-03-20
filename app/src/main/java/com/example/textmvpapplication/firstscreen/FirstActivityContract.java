package com.example.textmvpapplication.firstscreen;

import com.example.textmvpapplication.base.IPresenter;
import com.example.textmvpapplication.base.IView;

public interface FirstActivityContract {

    interface View extends IView {

        void updateUi(String message);

        void openSecondActivity();
    }

    interface Presenter {

        void loadData();

        void onClickNext();
    }
}
