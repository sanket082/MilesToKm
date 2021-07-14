package com.example.myapplication;

import android.app.Activity;

import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonKmToMiles = (Button) findViewById(R.id.btnkmtomiles);
        Button buttonMilesToKm = (Button) findViewById(R.id.btnmilestokm);
        final EditText editTextMiles = (EditText) findViewById(R.id.editTextmiles);
        final EditText editTextKm = (EditText) findViewById(R.id.editTextkm);

        buttonMilesToKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Double y = Double.valueOf(editTextMiles.getText().toString());
                Double x = y/ 0.62;
                DecimalFormat formatvalue = new DecimalFormat("##.##");
                editTextKm.setText(formatvalue.format(x));
            }
        });
        buttonKmToMiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Double x = Double.valueOf(editTextKm.getText().toString());
                Double y = x * 0.62;
                DecimalFormat formatvalue = new DecimalFormat("##.##");
                editTextMiles.setText(formatvalue.format(y));
            }
        });
    }
}