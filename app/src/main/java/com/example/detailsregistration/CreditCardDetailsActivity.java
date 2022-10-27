package com.example.detailsregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class CreditCardDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit_card_details);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        Button creditCardDetailsNextBtn = findViewById(R.id.credit_card_details_next_btn);
        creditCardDetailsNextBtn.setOnClickListener(view -> {
            EditText cardNumberTxt = findViewById(R.id.card_number_txt);
            String cardNumber = cardNumberTxt.getText().toString();
            EditText cardHolderTxt = findViewById(R.id.card_holder_txt);
            String cardHolder = cardHolderTxt.getText().toString();
            EditText expiryTxt = findViewById(R.id.expiry_txt);
            String expiry = expiryTxt.getText().toString();
            EditText cvvTxt = findViewById(R.id.cvv_txt);
            String cvv = cvvTxt.getText().toString();
            Intent successIntent = new Intent(this, IdentityActivity.class);
            successIntent.putExtras(bundle);
            successIntent.putExtra("cardNumber", cardNumber);
            successIntent.putExtra("cardHolder", cardHolder);
            successIntent.putExtra("expiry", expiry);
            successIntent.putExtra("cvv", cvv);
            startActivity(successIntent);
        });
        Button creditCardDetailsBackBtn = findViewById(R.id.credit_card_details_back_Btn);
        creditCardDetailsBackBtn.setOnClickListener(view -> {
            finish();
        });
    }
}