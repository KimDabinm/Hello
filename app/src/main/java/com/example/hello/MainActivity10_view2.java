package com.example.hello;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hello.databinding.ActivityMainActivity10View2Binding;

public class MainActivity10_view2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainActivity10View2Binding binding = ActivityMainActivity10View2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        String id = intent.getStringExtra("id");
        String pass = intent.getStringExtra("pass");
        String tel = intent.getStringExtra("tel");

        binding.textView5.setText(id);
        binding.textView6.setText(pass);
        binding.textView7.setText(tel);

        binding.button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext(), MainActivity10_view1.class);
                startActivity(intent1);
            }
        });
    }
}