package com.example.hello;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hello.databinding.ActivityMain8Binding;

public class MainActivity8_1 extends AppCompatActivity {

    // ViewBinding 기법
    //  -> xml 파일에 선언된 뷰를 코드에서 좀 더 쉽게 이용할 수 있도록 하는 도구
    //  -> 빌더에 의해 레이아웃xml 뷰 객체가 자동으로 만들어짐
    // activity8_main -> ActivityMain8Binding
    //
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //뷰 바인딩 객체를 획득
        ActivityMain8Binding binding = ActivityMain8Binding.inflate(getLayoutInflater());
        // 액티비티 화면에 출력
        setContentView(binding.getRoot());

       // setContentView(R.layout.activity_main8);



        binding.submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result="";
                // isChecked() : 해당 체크박스가 체크된 상태인지를 반환
                //               true : 체크된 상태 // false : 체크 안 된 상태
                if(binding.java.isChecked()) {
                    result += binding.java.getText().toString() + " ";
                }
                if(binding.python.isChecked()) {
                    result += binding.python.getText().toString() + " ";
                }
                if(binding.C.isChecked()) {
                    result += binding.C.getText().toString() + " ";
                }
                binding.select.setText("선택한 언어 : \n" + result);
            }
        });

    }
}