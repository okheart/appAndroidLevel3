package com.example.okheart.appandroidlevel3.Presenters;

import com.arellomobile.mvp.MvpView;

public interface InterfaceMoxyUser extends MvpView {

    void setUserNickname(String nickname);
    void setUserName(String name);
    void setUserEmail(String email);
}
