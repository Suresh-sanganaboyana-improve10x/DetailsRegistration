package com.example.detailsregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BankAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_account);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
 //       String emailAddress = intent.getStringExtra("emailAddress");
 //       String passwordTxt = intent.getStringExtra("password");
   //     String confirmPassword = intent.getStringExtra("confirmPassword");
   //     String userNameInString = intent.getStringExtra("userName");
     //   String nameInString = intent.getStringExtra("firstName");
       // String lastNameInString = intent.getStringExtra("lastName");
       // String companyNameInString = intent.getStringExtra("company");
      //  String experienceTxtInString = intent.getStringExtra("experience");
     //   String designationInString = intent.getStringExtra("designation");
     //   Toast.makeText(this, emailAddress +" "+ passwordTxt +" "+ confirmPassword, Toast.LENGTH_SHORT).show();
     //   Toast.makeText(this, userNameInString +" "+ nameInString +" "+ lastNameInString, Toast.LENGTH_SHORT).show();
     //   Toast.makeText(this, companyNameInString +" "+ experienceTxtInString +" "+ designationInString, Toast.LENGTH_SHORT).show();
        Button bankNextBtn = findViewById(R.id.bank_next_btn);
        bankNextBtn.setOnClickListener(view -> {
            EditText bankNameHereTxt = findViewById(R.id.bank_name_here_txt);
            String bankNameInString = bankNameHereTxt.getText().toString();
            EditText accountHolderNameTxt = findViewById(R.id.account_holder_name_txt);
            String holderNameInString = accountHolderNameTxt.getText().toString();
            EditText accountNumberTxt = findViewById(R.id.account_number_txt);
            String accountNumber = accountNumberTxt.getText().toString();
            EditText ifscCodeTxt = findViewById(R.id.ifsccode_txt);
            String ifscCodeInString = ifscCodeTxt.getText().toString();
            Intent bankIntent = new Intent(this, CreditCardDetailsActivity.class);
            bankIntent.putExtras(bundle);
 //           bankIntent.putExtra("emailAddress", emailAddress);
   //         bankIntent.putExtra("password", passwordTxt);
     //       bankIntent.putExtra("confirmPassword", confirmPassword);
     //       bankIntent.putExtra("userName", userNameInString);
     //       bankIntent.putExtra("firstName", nameInString);
     //       bankIntent.putExtra("lastName", lastNameInString);
     //       bankIntent.putExtra("company", companyNameInString);
     //       bankIntent.putExtra("experience", experienceTxtInString);
      //      bankIntent.putExtra("designation", designationInString);
            bankIntent.putExtra("bankName", bankNameInString);
            bankIntent.putExtra("accountHolderName", holderNameInString);
            bankIntent.putExtra("accountNumber", accountNumber);
            bankIntent.putExtra("ifscCode", ifscCodeInString);
            startActivity(bankIntent);
        });
        Button bankBackBtn = findViewById(R.id.bank_back_btn);
        bankBackBtn.setOnClickListener(view -> {
            finish();
        });
    }
}