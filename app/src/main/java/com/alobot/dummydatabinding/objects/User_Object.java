package com.alobot.dummydatabinding.objects;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.alobot.dummydatabinding.BR;

public class User_Object extends BaseObservable {
    private String firstName;
    private String lastName;

    public User_Object(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;

        notifyPropertyChanged(BR.firstName);
    }

    @Bindable
    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;

        notifyPropertyChanged(BR.lastName);
    }

    @Bindable
    public String getLastName() {
        return this.lastName;
    }
}