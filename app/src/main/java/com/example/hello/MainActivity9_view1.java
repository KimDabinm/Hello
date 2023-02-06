package com.example.hello;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hello.databinding.ActivityMainActivity9View1Binding;


public class MainActivity9_view1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 뷰 바인딩 객체 생성
        ActivityMainActivity9View1Binding binding = ActivityMainActivity9View1Binding.inflate(getLayoutInflater());
        // 액티비티 화면에 출력하기
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        String msg2 = intent.getStringExtra("msg");
//        Log.d("msg의 값", msg2);
        binding.tv1.setText(msg2);

        binding.btn1.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View view) {
               // 인텐트 객체를 생성
               // - 첫번째 매개변수 : 메시지를 보내는 액티비티
               // - 두번째 매개변수 : 호출하고 싶은 액티비티 - >화면 전환하고 싶은 액티비티 클래스

               Intent intent = new Intent(getApplicationContext(),MainActivity9_view2.class);
               // editText의 getText() 함수가 리턴하는 타입??
               // : String 클래스 타입이 아님 // Editable 인터페이스 타입을 리턴함
               //      --> toString() 호출하여 String 타입으로 변환해주기
               String str = binding.sendText.getText().toString();

               //데이터 넣을 때 putExtra(키, 값) 한 쌍으로 묶어서 데이터를 보냄
                intent.putExtra("msg", str);
               startActivity(intent);
               finish();
           }
        });

    }
}