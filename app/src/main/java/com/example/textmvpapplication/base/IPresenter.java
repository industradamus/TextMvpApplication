package com.example.textmvpapplication.base;

public interface IPresenter<VIEW extends IView> {

    void attach(VIEW view);

    void deAttach();
}
