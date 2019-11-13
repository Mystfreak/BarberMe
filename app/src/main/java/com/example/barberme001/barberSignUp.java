package com.example.barberme001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class barberSignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barber_sign_up);
        Intent intent = getIntent();
        String message = intent.getStringExtra(SignUp_Login.EXTRA_MESSAGE);

        TextView textView = findViewById(R.id.textField);
        textView.setText(message);
    }
}
