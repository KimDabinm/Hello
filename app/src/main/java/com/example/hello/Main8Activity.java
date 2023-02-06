package com.example.hello;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main8Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        // 체크박스
        CheckBox cbJava = findViewById(R.id.java);
        CheckBox cbPython = findViewById(R.id.python);
        CheckBox cbC = findViewById(R.id.C);

        TextView select = findViewById(R.id.select);
        Button submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result="";
                // isChecked() : 해당 체크박스가 체크된 상태인지를 반환
                //               true : 체크된 상태 // false : 체크 안 된 상태
                if(cbJava.isChecked()) {
                    result += cbJava.getText().toString() + " ";
                }
                if(cbPython.isChecked()) {
                    result += cbPython.getText().toString() + " ";
                }
                if(cbC.isChecked()) {
                    result += cbC.getText().toString() + " ";
                }
                select.setText("선택한 언어 : \n" + result);
            }
        });

    }
}