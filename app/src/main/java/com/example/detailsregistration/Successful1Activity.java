package com.example.detailsregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Successful1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_successful1);
        Intent intent = getIntent();
        String emailAddress = intent.getStringExtra("emailAddress");
        String passwordTxt = intent.getStringExtra("password");
        String confirmPassword = intent.getStringExtra("confirmPassword");
        String userNameInString = intent.getStringExtra("userName");
        String nameInString = intent.getStringExtra("firstName");
        String lastNameInString = intent.getStringExtra("lastName");
        String currentCompany = intent.getStringExtra("company");
        String experience = intent.getStringExtra("experience");
        String designation = intent.getStringExtra("designation");
        String bankName = intent.getStringExtra("bankName");
        String accountHolderName = intent.getStringExtra("accountHolderName");
        String accountNumber = intent.getStringExtra("accountNumber");
        String ifscCode = intent.getStringExtra("ifscCode");
        String dateOfBirth = intent.getStringExtra("dateOfBirth");
        String placeOfBirth = intent.getStringExtra("placeOfBirth");
        String panNumber = intent.getStringExtra("panNumber");
        String aadharNumber = intent.getStringExtra("aadharNumber");
        String houseNoApartment = intent.getStringExtra("houseNoApartment");
        String street = intent.getStringExtra("street");
        String city = intent.getStringExtra("city");
        String state = intent.getStringExtra("state");
        String country = intent.getStringExtra("country");
        String cardNumber = intent.getStringExtra("cardNumber");
        String cardHolder = intent.getStringExtra("cardHolder");
        String expiry = intent.getStringExtra("expiry");
        String cvv = intent.getStringExtra("cvv");
        Toast.makeText(this, emailAddress +" "+ passwordTxt +" "+ confirmPassword, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, userNameInString +" "+ nameInString +" "+ lastNameInString, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, currentCompany +" "+ experience +" "+ designation, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, bankName +" "+ accountHolderName +" "+ accountNumber +" "+ ifscCode, Toast.LENGTH_SHORT).show();
        TextView emailTxt = findViewById(R.id.email_txt);
        emailTxt.setText(emailAddress);
        TextView usernameTextTxt = findViewById(R.id.username_text_txt);
        usernameTextTxt.setText(userNameInString);
        TextView firstNameTxt = findViewById(R.id.first_name_txt);
        firstNameTxt.setText(nameInString);
        TextView lastNameTxt = findViewById(R.id.last_name_txt);
        lastNameTxt.setText(lastNameInString);
        TextView currentCompanyTxt =findViewById(R.id.current_company_txt);
        currentCompanyTxt.setText(currentCompany);
        TextView totalExperience = findViewById(R.id.total_experience_txt);
        totalExperience.setText(experience);
        TextView designationTxt = findViewById(R.id.designation_text_txt);
        designationTxt.setText(designation);
        TextView bankNameTxt = findViewById(R.id.bank_name_txt);
        bankNameTxt.setText(bankName);
        TextView accountHolderNameTxt = findViewById(R.id.account_holder_txt);
        accountHolderNameTxt.setText(accountHolderName);
        TextView accountNumberTxt = findViewById(R.id.account_number_txt);
        accountNumberTxt.setText(accountNumber);
        TextView ifscCodeTxt = findViewById(R.id.ifsc_code_txt);
        ifscCodeTxt.setText(ifscCode);
        TextView successDateOfBirthTxt = findViewById(R.id.success_date_of_birth_txt);
        successDateOfBirthTxt.setText(dateOfBirth);
        TextView successPlaceOfBirthTxt = findViewById(R.id.success_place_of_birth_txt);
        successPlaceOfBirthTxt.setText(placeOfBirth);
        TextView successPanNumberTxt = findViewById(R.id.success_pan_number_txt);
        successPanNumberTxt.setText(panNumber);
        TextView successAadharNumberTxt = findViewById(R.id.success_aadhar_number_txt);
        successAadharNumberTxt.setText(aadharNumber);
        TextView hNoApartment = findViewById(R.id.h_no_apartment_txt);
        hNoApartment.setText(houseNoApartment);
        TextView successStreetTxt = findViewById(R.id.success_street_txt);
        successStreetTxt.setText(street);
        TextView successCityTxt = findViewById(R.id.success_city_txt);
        successCityTxt.setText(city);
        TextView successStateTxt = findViewById(R.id.success_state_txt);
        successStateTxt.setText(state);
        TextView successCountryTxt = findViewById(R.id.success_country_txt);
        successCountryTxt.setText(country);
        TextView successCardNumberTxt = findViewById(R.id.success_card_number_txt);
        successCardNumberTxt.setText(cardNumber);
        TextView successCardholderTxt = findViewById(R.id.success_cardholder_txt);
        successCardholderTxt.setText(cardHolder);
        TextView successExpiryTxt = findViewById(R.id.success_expiry_txt);
        successExpiryTxt.setText(expiry);
        TextView successCvvTxt = findViewById(R.id.success_cvv_txt);
        successCvvTxt.setText(cvv);
    }
}