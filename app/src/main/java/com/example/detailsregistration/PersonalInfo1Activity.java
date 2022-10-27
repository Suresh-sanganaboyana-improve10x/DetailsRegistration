package com.example.detailsregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PersonalInfo1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info1);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
       // String emailAddress = intent.getStringExtra("emailAddress");
       // String passwordTxt = intent.getStringExtra("password");
       // String confirmPassword = intent.getStringExtra("confirmPassword");
       // Toast.makeText(this, emailAddress +" "+ passwordTxt +" "+ confirmPassword, Toast.LENGTH_SHORT).show();
        Button personalInfoNextBtn = findViewById(R.id.personalinfo_next_btn);
        personalInfoNextBtn.setOnClickListener(view -> {
            EditText userNameTxt = findViewById(R.id.username_txt);
            String userNameInString =userNameTxt.getText().toString();
            EditText firstNameTxt = findViewById(R.id.firstname_txt);
            String nameInString = firstNameTxt.getText().toString();
            EditText lastNameTxt = findViewById(R.id.lastname_txt);
            String lastNameInString =lastNameTxt.getText().toString();
            Intent personalInfoIntent = new Intent(this, AddressActivity.class);
            personalInfoIntent.putExtras(bundle);
          //  personalInfoIntent.putExtra("emailAddress", emailAddress);
          //  personalInfoIntent.putExtra("password", passwordTxt);
          //  personalInfoIntent.putExtra("confirmPassword", confirmPassword);
            personalInfoIntent.putExtra("userName", userNameInString);
            personalInfoIntent.putExtra("firstName", nameInString);
            personalInfoIntent.putExtra("lastName", lastNameInString);
            startActivity(personalInfoIntent);
        });
        Button personalBackBtn = findViewById(R.id.personalinfo_back_btn);
        personalBackBtn.setOnClickListener(view -> {
            finish();
        });
    }
}