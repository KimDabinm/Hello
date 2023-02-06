package com.example.app2;


import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.app2.databinding.ActivityMainActivity3Frame2Binding;

public class MainActivity3_frame2 extends AppCompatActivity {


    int imageIndex = 0;
    int cnt = 0;
    ActivityMainActivity3Frame2Binding binding;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainActivity3Frame2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        clearView();


        // 이벤트 리스너
//        binding.apeach.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                clearView();
//                binding.image1.setVisibility(View.VISIBLE);
//            }
//        });
//        binding.muzi.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                clearView();
//                binding.image2.setVisibility(View.VISIBLE);
//            }
//        });
//        binding.lion.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//                clearView();
//                binding.image3.setVisibility(View.VISIBLE);
//            }
//        });

//        binding.rightBtn.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//                clearView();
//                if(imageIndex==0){
//                    binding.image1.setVisibility(View.VISIBLE);
//                    imageIndex=1;
//                } else if(imageIndex==1){
//                    binding.image2.setVisibility(View.VISIBLE);
//                    imageIndex = 2;
//                } else if(imageIndex==2) {
//                    binding.image3.setVisibility(View.VISIBLE);
//                }
//            }
//        });
//        binding.leftBtn.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//                clearView();
//
//                if(imageIndex==2){
//                    binding.image3.setVisibility(View.VISIBLE);
//                    imageIndex=1;
//                } else if(imageIndex==1){
//                    binding.image2.setVisibility(View.VISIBLE);
//                    imageIndex = 0;
//                } else if(imageIndex==0) {
//                    binding.image1.setVisibility(View.VISIBLE);
//                }
//            }
//        });
    }
    /*한번만 쓸거면 구현객체 만들어서 사용하고, 여러번 사용할 거면 메소드 만들어서 이용*/

    public void clearView() {
        binding.image1.setVisibility(View.INVISIBLE);
        binding.image2.setVisibility(View.INVISIBLE);
        binding.image3.setVisibility(View.INVISIBLE);
    }

    public void onClickBtn(View view) {
        // 사용자가 클릭한 뷰를 클릭한 것을 매개값으로 전달

        clearView();
        switch (view.getId()) {
            case R.id.apeach:
                binding.image1.setVisibility(View.VISIBLE);
                cnt = 1;
                break;
            case R.id.muzi:
                binding.image2.setVisibility(View.VISIBLE);
                cnt = 2;
                break;
            case R.id.lion:
                binding.image3.setVisibility(View.VISIBLE);
                cnt = 3;
                break;
        }
    }

    public void onClickleftRightBtn(View view) {
        clearView();
        switch (view.getId()) {
            case R.id.leftBtn:
                if(cnt>1) cnt--; break;
            case R.id.rightBtn:
                if(cnt<3) cnt++; break;
        }
       switch(cnt){
           case 1 : binding.image1.setVisibility(View.VISIBLE); break;
           case 2 : binding.image2.setVisibility(View.VISIBLE); break;
           case 3 : binding.image3.setVisibility(View.VISIBLE); break;
       }
    }
}