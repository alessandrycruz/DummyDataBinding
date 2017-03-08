package com.alobot.dummydatabinding.handlers;

import android.util.Log;
import android.view.View;

import com.alobot.dummydatabinding.objects.User_Object;

public class Main_Handler {
    private static final String TAG = Main_Handler.class.getSimpleName();

    public void onClickFirstName(View view) {
        Log.d(TAG, "onClickFirstName: ");
    }


    public void onClickLastName(View view, User_Object user_Object) {
        Log.d(TAG, "onClickLastName: " + user_Object.getFirstName());

        Log.d(TAG, "onClickLastName: " + user_Object.getLastName());
    }

    public void onClickNextUser(View view, User_Object user_Object) {
        user_Object.setFirstName("Julieta");
        user_Object.setLastName("Velazquez");
    }
}
