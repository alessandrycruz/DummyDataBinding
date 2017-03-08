package com.alobot.dummydatabinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.alobot.dummydatabinding.databinding.ActivityMainBinding;
import com.alobot.dummydatabinding.handlers.Main_Handler;
import com.alobot.dummydatabinding.objects.Button_Object;
import com.alobot.dummydatabinding.objects.User_Object;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        User_Object user_Object = new User_Object("Alessandry", "Cruz");
        Button_Object button_Object = new Button_Object("Next User");
        Main_Handler main_Handler = new Main_Handler();

        binding.setUser(user_Object);
        binding.setButton(button_Object);
        binding.setHandler(main_Handler);
    }
}
