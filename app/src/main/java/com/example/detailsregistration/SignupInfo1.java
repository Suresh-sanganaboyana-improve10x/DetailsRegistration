package com.example.detailsregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignupInfo1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_info1);
        Button signInfo1NextBtn = findViewById(R.id.sinupinfo1_next_btn);
        signInfo1NextBtn.setOnClickListener(view -> {
            Intent signupIntent = new Intent(this, PersonalInfo1Activity.class);
            EditText emailAddressTxt = findViewById(R.id.email_address_txt);
            String addressInString = emailAddressTxt.getText().toString();
            EditText passwordTxt = findViewById(R.id.password_txt);
            String passwordInString = passwordTxt.getText().toString();
            EditText confirmPasswordTxt = findViewById(R.id.confirmpassword_txt);
            String confirmPassword = confirmPasswordTxt.getText().toString();
            signupIntent.putExtra("emailAddress", addressInString);
            signupIntent.putExtra("password", passwordInString);
            signupIntent.putExtra("confirmPassword", confirmPassword);
            startActivity(signupIntent);
        });
    }
}