package com.example.okheart.appandroidlevel3.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.arellomobile.mvp.MvpAppCompatFragment;
import com.example.okheart.appandroidlevel3.Presenters.InterfaceMoxyUser;
import com.example.okheart.appandroidlevel3.R;
import com.example.okheart.appandroidlevel3.models.UserModel;

public class FragmentUserProfile extends MvpAppCompatFragment implements InterfaceMoxyUser {

    public FragmentUserProfile() {
    }

    public static FragmentUserProfile newInstance() {
        return new FragmentUserProfile();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_user, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView tvUserNickName = view.findViewById(R.id.tv_user_nickname);
        TextView tvUserName = view.findViewById(R.id.tv_user_name);
        TextView tvUserEmail = view.findViewById(R.id.tv_user_email);

        UserModel userModel = UserModel.getUserProfile();
        tvUserNickName.setText(userModel.userNickName);
        tvUserName.setText(userModel.userName);
        tvUserEmail.setText(userModel.userEmail);
    }

    @Override
    public void setUserNickname(String nickname) {

    }

    @Override
    public void setUserName(String name) {

    }

    @Override
    public void setUserEmail(String email) {

    }

}
