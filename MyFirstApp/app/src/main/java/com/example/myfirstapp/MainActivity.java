package com.example.myfirstapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }
    @SuppressLint("SetTextI18n")
    public void onBtnClick(View view) {
        EditText name_txt = findViewById(R.id.editText);  // get text from widget of type EditText
        TextView hello_txt = findViewById(R.id.viewText);
        String user_name = name_txt.getText().toString();
        hello_txt.setText("Hello, " + user_name);
    }
}