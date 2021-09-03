package com.example.navigationthroughactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Intent intent = getIntent();
        String name = intent.getStringExtra(RegisterActivity.EXTRA_NAME);
        String location = intent.getStringExtra(RegisterActivity.EXTRA_LOCATION);
        String email = intent.getStringExtra(RegisterActivity.EXTRA_Email);
        String mobile = intent.getStringExtra(RegisterActivity.EXTRA_PHONE);

        TextView username = (TextView) findViewById(R.id.username);
        TextView residency = (TextView) findViewById(R.id.location);
        TextView mail = (TextView) findViewById(R.id.email_edit);
        TextView phone = (TextView) findViewById(R.id.editTextPhone);

        username.setText(name);
        residency.setText(location);
        mail.setText(email);
        phone.setText(mobile);


    }
}