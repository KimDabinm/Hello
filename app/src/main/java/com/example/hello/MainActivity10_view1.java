package com.example.hello;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hello.databinding.ActivityMainActivity10View3Binding;

public class MainActivity10_view1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainActivity10View3Binding binding = ActivityMainActivity10View3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),MainActivity10_view2.class);
                String id = binding.textid.getText().toString();
                String pass = binding.textpassword.getText().toString();
                String tel = binding.texttel.getText().toString();

                intent.putExtra("id", id);
                intent.putExtra("pass", pass);
                intent.putExtra("tel", tel);
                startActivity(intent);
                finish();
            }
        });
    }
}