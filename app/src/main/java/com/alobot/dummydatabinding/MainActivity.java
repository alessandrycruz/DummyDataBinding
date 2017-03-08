package com.alobot.dummydatabinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.alobot.dummydatabinding.databinding.ActivityMainBinding;
import com.alobot.dummydatabinding.objects.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        User user = new User("Test", "User");
        binding.setUser(user);
    }
}
