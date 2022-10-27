package com.example.detailsregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button signupInfo1Btn = findViewById(R.id.signupInfo1_btn);
        signupInfo1Btn.setOnClickListener(view -> {
            Intent intent = new Intent(this, SignupInfo1.class);
            startActivity(intent);
        });
    }
}