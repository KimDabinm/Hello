package com.example.hello;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity5 extends AppCompatActivity {
    ImageView image1;
    ImageView image2;
    ImageView image3;

    int imageIndex=0;
    Button imgBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity5_main);

        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        image3 = findViewById(R.id.image3);

        Button apeachBtn = findViewById(R.id.apeach);
        Button muziBtn = findViewById(R.id.muzi);
        Button ryanBtn = findViewById(R.id.lion);
        //image = findViewById(R.id.image1);

        ImageButton leftBtn = findViewById(R.id.leftBtn);
        ImageButton rightBtn = findViewById(R.id.rightBtn);

        // 이벤트 리스너
        apeachBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
               // image.setImageResource(R.drawable.apeach);
            }
        });
        muziBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
               // image.setImageResource(R.drawable.muzi);
            }
        });
        ryanBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
               // image.setImageResource(R.drawable.lion);
            }
        });

        rightBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(imageIndex==0){
                    image1.setVisibility(View.VISIBLE);
                    image2.setVisibility(View.INVISIBLE);
                    image3.setVisibility(View.INVISIBLE);
                    imageIndex=1;
                } else if(imageIndex==1){
                    image1.setVisibility(View.INVISIBLE);
                    image2.setVisibility(View.VISIBLE);
                    image3.setVisibility(View.INVISIBLE);
                    imageIndex = 2;
                } else if(imageIndex==2) {
                    image1.setVisibility(View.INVISIBLE);
                    image2.setVisibility(View.INVISIBLE);
                    image3.setVisibility(View.VISIBLE);
                    imageIndex=0;
                }
            }
        });
        leftBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(imageIndex==2){
                    image1.setVisibility(View.INVISIBLE);
                    image2.setVisibility(View.INVISIBLE);
                    image3.setVisibility(View.VISIBLE);
                    imageIndex=1;
                } else if(imageIndex==1){
                    image1.setVisibility(View.INVISIBLE);
                    image2.setVisibility(View.VISIBLE);
                    image3.setVisibility(View.INVISIBLE);
                    imageIndex = 0;
                } else if(imageIndex==0) {
                    image1.setVisibility(View.VISIBLE);
                    image2.setVisibility(View.INVISIBLE);
                    image3.setVisibility(View.INVISIBLE);
                    imageIndex=2;
                }
            }
        });
    }
    /*한번만 쓸거면 구현객체 만들어서 사용하고, 여러번 사용할 거면 메소드 만들어서 이용*/
    public void onRyanBtnClicked(View v){
        ImageView image = findViewById(R.id.image1);
        image.setImageResource(R.drawable.lion);
    }
    public void onApeachBtnClicked(View v){
        ImageView image = findViewById(R.id.image1);
        image.setImageResource(R.drawable.apeach);
    }
    public void onMuziBtnClicked(View v){
        ImageView image = findViewById(R.id.image1);
        image.setImageResource(R.drawable.muzi);
    }



}
