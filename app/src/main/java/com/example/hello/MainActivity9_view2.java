package com.example.hello;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hello.databinding.ActivityMainActivity9View2Binding;

public class MainActivity9_view2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 뷰 바인딩 객체
        ActivityMainActivity9View2Binding binding = ActivityMainActivity9View2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        String msg = intent.getStringExtra("msg");
        // Log.e(String, String): Error   - 가장 심각한 문제가 발생했을 때 남기는 로그
        // Log.w(String, String): warning - 심각하지는 않지만, 나중에 문제의 소지가 있을 수 있어서 남기는 로그
        // Log.i(String, String): Information - 진행 과정들을 모니터링하기 위한 목적으로 남기는 로그
        // Log.d(String, String): Debug     - 디버깅 목적으로 문제 발생 가능성이 있는 곳에 남기는 로그
        // Log.v(String, String): Verbose   - 동작 여부를 최대한 자세히 살펴볼 목적으로 남기는 로그

        Log.d("msg의 값", msg);

        binding.tv2.setText(msg);

        binding.btnbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 인텐트 객체 생성
                Intent intent = new Intent(getApplicationContext(), MainActivity9_view1.class);
                String str2 = binding.sendText.getText().toString();
                intent.putExtra("msg", str2);
                startActivity(intent);
                finish();
            }
        });
    }
}