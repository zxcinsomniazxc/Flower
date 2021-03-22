package com.example.flower;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import com.squareup.picasso.Picasso;

import java.util.List;

public class UsersAdapter {

    private final static String USERS_URL = "http://cinema.areas.su/up/images/";
    private List<Users> mUsers;
    private Context mContext;

    UsersAdapter(List<Users> users) {
        this.mUsers = users;
    }

}
