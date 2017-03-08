package com.alobot.dummydatabinding.objects;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.alobot.dummydatabinding.BR;

public class Button_Object extends BaseObservable {
    private String title;

    public Button_Object(String title) {
        this.title = title;
    }

    @Bindable
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;

        notifyPropertyChanged(BR.title);
    }
}
