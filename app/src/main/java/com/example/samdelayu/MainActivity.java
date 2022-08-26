package com.example.samdelayu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText a, b, c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        a = findViewById(R.id.numA);
        b = findViewById(R.id.numB);
        c = findViewById(R.id.numC);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double num1, num2, num3;
                    num1 = Double.parseDouble(a.getText().toString());
                    num2 = Double.parseDouble(b.getText().toString());
                    num3 = Double.parseDouble(c.getText().toString());

                    Intent intent = new Intent(MainActivity.this, secondActivity.class);
                    intent.putExtra("qq", "РЕЗУЛЬТАТ " + (num1 + (num2 * num3) + ""));
                    startActivity(intent);
                }catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "ошибка" + e.getMessage(), Toast.LENGTH_LONG).show();

                }
            }
        });
    }
}