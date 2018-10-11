package com.example.okheart.appandroidlevel3.models;

public class UserModel {

    public String userNickName;
    public String userName;
    public String userEmail;

    public UserModel(String userNickName, String userName, String userEmail) {
        this.userNickName = userNickName;
        this.userName = userName;
        this.userEmail = userEmail;
    }

    public static UserModel getUserProfile(){
            return new UserModel("Okheart", "Aleksandr", "okheart90@gmail.com");
    }


}
