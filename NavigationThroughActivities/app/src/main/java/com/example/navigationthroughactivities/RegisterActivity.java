package com.example.navigationthroughactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    public static final String EXTRA_NAME = "com.example.navigationthroughactivities.EXTRA_NAME";
    public static final String EXTRA_LOCATION = "com.example.navigationthroughactivities.EXTRA_LOCATION";
    public static final String EXTRA_Email = "com.example.navigationthroughactivities.EXTRA_EMAIL";
    public static final String EXTRA_PHONE = "com.example.navigationthroughactivities.EXTRA_Phone";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        TextView login_label = findViewById(R.id.have_account_login_label);
        login_label.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLoginActivity();
            }
        });

        TextView register_btn = findViewById(R.id.register_button);
        register_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openProfileActivity();
            }
        });


    }


    public void openLoginActivity() {
        Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    public void openProfileActivity() {
        TextView username = (TextView) findViewById(R.id.name_input);
        String name = username.getText().toString();

        TextView location = (TextView) findViewById(R.id.city_country);
        String residency = location.getText().toString();

        TextView email = (TextView) findViewById(R.id.email_input);
        String mail = email.getText().toString();

        TextView phone = (TextView) findViewById(R.id.phone);
        String mobile =  phone.getText().toString();

        Intent intent = new Intent(RegisterActivity.this, ProfileActivity.class);
        intent.putExtra(EXTRA_NAME, name);
        intent.putExtra(EXTRA_LOCATION, residency);
        intent.putExtra(EXTRA_Email,mail);
        intent.putExtra(EXTRA_PHONE, mobile);
        startActivity(intent);
    }


}