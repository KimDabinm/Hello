package com.example.hello;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity7 extends AppCompatActivity {
    // 텍스트뷰 - 선택한 계절
    TextView selectSeason;
    // 라디오 그룹
    RadioGroup radioGroup;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity7_main);
        
        selectSeason = findViewById(R.id.select_season);
        radioGroup = findViewById(R.id.radioGroup);
        
        //setOnCheckedChangeListener : 체크박스나 라디오버튼의 체크 상태를 변경할 때 발생하는 이벤트
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.spring:
                        selectSeason.setText("봄"); break;
                    case R.id.summer:
                        selectSeason.setText("여름"); break;
                    case R.id.fall:
                        selectSeason.setText("가을"); break;
                    case R.id.winter:
                        selectSeason.setText("겨울"); break;
                }
            }
        });
    }
}
