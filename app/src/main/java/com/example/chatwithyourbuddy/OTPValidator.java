package com.example.chatwithyourbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class OTPValidator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otpvalidator);
        Button okButton = findViewById(R.id.ok);
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText numberPassword = findViewById(R.id.editTextNumberPassword);
                String password = numberPassword.getText().toString();
                // Get the selected country code from the spinner


                if (password.length() == 6) {

                    Intent intent = new Intent(OTPValidator.this, HomePage.class);
                    startActivity(intent);
                }

                else{

                    Toast.makeText(getApplicationContext(),"Please provide valid OTP" ,
                            Toast.LENGTH_SHORT).show();

                }
            }
        });


    }
}