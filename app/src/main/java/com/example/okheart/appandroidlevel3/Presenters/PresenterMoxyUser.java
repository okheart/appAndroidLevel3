package com.example.okheart.appandroidlevel3.Presenters;

import com.arellomobile.mvp.MvpPresenter;
import com.example.okheart.appandroidlevel3.models.UserModel;

public class PresenterMoxyUser extends MvpPresenter<InterfaceMoxyRV> {

    private UserModel userModel;

    @Override
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
    }

    @Override
    public void attachView(InterfaceMoxyRV view) {
        super.attachView(view);
    }
}
