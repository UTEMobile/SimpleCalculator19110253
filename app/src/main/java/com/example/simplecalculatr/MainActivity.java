package com.example.simplecalculatr;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtResult;
    EditText a;
    EditText b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResult = (TextView) findViewById(R.id.txtResult);
        a = (EditText) findViewById(R.id.a);
        b = (EditText) findViewById(R.id.b);

        if (savedInstanceState != null) {
            txtResult.setText(savedInstanceState.getString("txtResult"));
        }
    }
    Calculator calculator = new Calculator();

    public void markClick(View view) {
        double result = 0d;

        if (a.getText().toString().equals("") || b.getText().toString().equals("")) {
            txtResult.setText(R.string.lack);
            return;
        }
        double da = Double.parseDouble(a.getText().toString());
        double db = Double.parseDouble(b.getText().toString());

        Button button = (Button) view;
        String mark = button.getText().toString().trim();
        result = calculator.calculator(mark,da, db);

        String sResult = Double.toString(result);
        if (sResult.equals("Infinity")){
            ((View) findViewById(R.id.background)).setBackgroundResource(R.drawable.ic_launcher_background);
            txtResult.setText(R.string.over);
        } else {
            txtResult.setText(sResult);

        }
    }



    public void facClick(View view) {

        if (a.getText().toString().equals("")) return;
        double db = Double.parseDouble(a.getText().toString());

        double da = (int) db;
        if (da != db)
        {
            txtResult.setText(R.string.wrong);
            return;
        }

        if (da > 20) {
            txtResult.setText(R.string.over);
            ((View) findViewById(R.id.background)).setBackgroundResource(R.drawable.ic_launcher_background);
        } else {
            txtResult.setText(getResources().getString(R.string.result,  calculator.facResult(da)));
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("txtResult", txtResult.getText().toString());
    }
}