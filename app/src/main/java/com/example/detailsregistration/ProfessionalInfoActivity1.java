package com.example.detailsregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ProfessionalInfoActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professional_info1);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
       // String emailAddress = intent.getStringExtra("emailAddress");
        // String passwordTxt = intent.getStringExtra("password");
        // String confirmPassword = intent.getStringExtra("confirmPassword");
        //  String userNameInString = intent.getStringExtra("userName");
        //  String nameInString = intent.getStringExtra("firstName");
        //  String lastNameInString = intent.getStringExtra("lastName");
        //   Toast.makeText(this, emailAddress +" \t"+ passwordTxt +" "+confirmPassword , Toast.LENGTH_SHORT).show();
        //  Toast.makeText(this, userNameInString +"\t"+nameInString +" "+ lastNameInString, Toast.LENGTH_SHORT).show();
        Button professionalNextBtn = findViewById(R.id.professional_next_btn);
        professionalNextBtn.setOnClickListener(view -> {
            EditText companyNameTxt = findViewById(R.id.company_name_txt);
            String companyNameInString = companyNameTxt.getText().toString();
            EditText experienceTxt = findViewById(R.id.experience_txt);
            String experienceTxtInString = experienceTxt.getText().toString();
            EditText designationTxt = findViewById(R.id.designation_txt);
            String designationInString = designationTxt.getText().toString();
            Intent successIntent = new Intent(this, BankAccountActivity.class);
            successIntent.putExtras(bundle);
//            successIntent.putExtra("emailAddress", emailAddress);
//            successIntent.putExtra("password", passwordTxt);
//            successIntent.putExtra("confirmPassword", confirmPassword);
//            successIntent.putExtra("userName", userNameInString);
//            successIntent.putExtra("firstName", nameInString);
//            successIntent.putExtra("lastName", lastNameInString);
            successIntent.putExtra("company", companyNameInString );
            successIntent.putExtra("experience", experienceTxtInString);
            successIntent.putExtra("designation", designationInString);
            startActivity(successIntent);
        });
        Button professionalBackBtn = findViewById(R.id.professional_back_btn);
        professionalBackBtn.setOnClickListener(view -> {
           finish();
        });
    }
}