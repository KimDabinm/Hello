package com.example.hello;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hello.databinding.ActivityMain10Binding;

public class MainActivity10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMain10Binding binding = ActivityMain10Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}