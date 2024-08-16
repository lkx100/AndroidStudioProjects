package com.example.myapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.graphics.Insets;
//import androidx.core.view.ViewCompat;
//import androidx.core.view.WindowInsetsCompat;

public class calculatorApp extends AppCompatActivity {
    private EditText n1, n2;
    private TextView showTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculator_app);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        n1 = findViewById(R.id.num1);
        n2 = findViewById(R.id.num2);
        showTxt = findViewById(R.id.result);

    }
    public void calc_to_home(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void add_nums(View view) {
        String int1 = n1.getText().toString();
        String int2 = n2.getText().toString();

        if (!int1.isEmpty() && !int2.isEmpty()) {
            int answer = Integer.parseInt(int1) + Integer.parseInt(int2);
            showTxt.setText("Result = " + answer);
        }
        else
            showTxt.setText("Enter a Valid Integer Value !");
    }
}