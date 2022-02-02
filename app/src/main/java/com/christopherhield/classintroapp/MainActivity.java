package com.christopherhield.classintroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText numberOne;
    private EditText numberTwo;
    private TextView results;


    private static final String TAG = "MainActivityTag";
    private int count = 1;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: " + count++ + " ************");
        setContentView(R.layout.activity_main);

        numberOne = findViewById(R.id.number1);
        numberTwo = findViewById(R.id.number2);
        results = findViewById(R.id.resultText);


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: " + count++ + " ************");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: " + count++ + " ************");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: " + count++ + " ************");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: " + count++ + " ************");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: " + count++ + " ************");
    }

    public void doAdd(View v){
        String n1 = numberOne.getText().toString();// we get input as a string though we gave it as a number in the layout
        if(n1.trim().isEmpty()){
            return;
        }
        String n2 = numberTwo.getText().toString();
        if(n2.trim().isEmpty()){
            return;
        }

        double dn1 = Double.parseDouble(n1);
        double dn2 = Double.parseDouble(n2);

        double sum = dn1 + dn2;



        Log.d(TAG, "doAdd: " + n1 + " & " + n2 + " = " + sum);
        results.setText(String.format("%.2f", sum));
    }

}