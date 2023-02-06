package com.example.app2;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.app2.databinding.ActivityMainActivity3FrameBinding;

public class MainActivity3_frame extends AppCompatActivity {
    ActivityMainActivity3FrameBinding binding;
    int cnt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainActivity3FrameBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        // * 프레임 레이아웃
        //  - setVisibility()
        //      1. VISIBLE : 화면에 보임
        //      2. INVISIBLE : 화면에 안보임 / 크기는 확보함
        //      3. GONE : 화면에 안보임 / 크기는 미확보
        clearView(); // 화면에 모든 텍스트뷰를 안보이게 하는 함수 호출


        // 전체 텍스트 뷰 3개를 안보이게 함
        // -> 다음 버튼 클릭시 A B C 보이게
        binding.nextBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                clearView();
                cnt++;
                if(cnt>3){
                    cnt=1;
                }
                switch(cnt){
                  case 1:  binding.textViewA.setVisibility(View.VISIBLE); break;
                  case 2:  binding.textViewB.setVisibility(View.VISIBLE); break;
                  case 3:  binding.textViewC.setVisibility(View.VISIBLE); break;
                }
            }
        });
        // -> 이전 버튼 클릭시
    }

    // 3개 text뷰를 안보이게 하기위해 메소드를 하나 만들어서 정의해줌
    public void clearView(){
        binding.textViewA.setVisibility(View.INVISIBLE);
        binding.textViewB.setVisibility(View.INVISIBLE);
        binding.textViewC.setVisibility(View.INVISIBLE);
    }
}