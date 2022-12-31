package com.example.chatwithyourbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner countryCodeSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countryCodeSpinner = findViewById(R.id.country_code_spinner);
        Button continueButton = findViewById(R.id.Continue);
        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText phoneNumberField = findViewById(R.id.phone_Number);
                String phoneNumber = phoneNumberField.getText().toString();
                // Get the selected country code from the spinner
                String countryCode = countryCodeSpinner.getSelectedItem().toString();

                if (phoneNumber.length() == 10) {

                    Intent intent = new Intent(MainActivity.this, OTPValidator.class);
                    startActivity(intent);
                }

                else{

                    Toast.makeText(getApplicationContext(),"Please provide valid phone number with country code" ,
                            Toast.LENGTH_SHORT).show();

                }

            }
        });
    }
}