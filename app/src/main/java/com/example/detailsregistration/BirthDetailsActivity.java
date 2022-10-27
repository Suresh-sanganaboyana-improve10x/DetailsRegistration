package com.example.detailsregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class BirthDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birth_details);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        Button birthNextBtn = findViewById(R.id.birth_next_btn);
        birthNextBtn.setOnClickListener(view -> {
            EditText dateOfBirthTxt = findViewById(R.id.date_of_birth_txt);
            String dateOfBirth = dateOfBirthTxt.getText().toString();
            EditText placeOfBirthTxt = findViewById(R.id.place_of_birth);
            String placeOfBirth = placeOfBirthTxt.getText().toString();
            Intent professionalIntent = new Intent(this, ProfessionalInfoActivity1.class);
            professionalIntent.putExtras(bundle);
            professionalIntent.putExtra("dateOfBirth", dateOfBirth);
            professionalIntent.putExtra("placeOfBirth", placeOfBirth);
            startActivity(professionalIntent);
        });
        Button birthBackBtn = findViewById(R.id.birth_back_btn);
        birthBackBtn.setOnClickListener(view -> {
            finish();
        });
    }
}