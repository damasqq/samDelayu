package com.example.samdelayu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        getSupportActionBar().hide();

        TextView textView = findViewById(R.id.textView);
        String str = getIntent().getStringExtra("qq");
        textView.setText(str);
    }
}