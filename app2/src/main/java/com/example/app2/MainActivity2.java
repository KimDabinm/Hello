package com.example.app2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.app2.databinding.ActivityMain25Binding;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // * layout_gravity vs gravity
        // 실습 1. 버튼 6개
//        ActivityMain2Binding binding = ActivityMain2Binding.inflate(getLayoutInflater());
        // 실습 2. 텍스트뷰 하나를 가운데로 배치
//        ActivityMain21Binding binding = ActivityMain21Binding.inflate(getLayoutInflater());

        // * weight
        // 실습 1.
        //ActivityMain22Binding binding = ActivityMain22Binding.inflate(getLayoutInflater());
        // 실습 2.
//        ActivityMain23Binding binding = ActivityMain23Binding.inflate(getLayoutInflater());
        // 실습 3. 카카오토 채팅 구현
        ActivityMain25Binding binding = ActivityMain25Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}