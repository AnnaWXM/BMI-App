package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void BMICalculator(View view){
        EditText height = findViewById(R.id.height);
        EditText weight = findViewById(R.id.weight);
        String hString,wString;
        hString = height.getText().toString();
        wString = weight.getText().toString();
        float h,w,BMI;
        h = Float.valueOf(hString);
        w = Float.valueOf(wString);
        BMI = w / (h*h);

        TextView bmi = findViewById(R.id.bmi);
        bmi.setText(""+BMI);

        TextView infor = findViewById(R.id.infor);
        if(BMI<10) infor.setText("Please check the unit of your input values.");
        else if(BMI<18.5) infor.setText("According to your BMI, you're underweight.");
        else if(BMI<24.9) infor.setText("According to your BMI, you're normal weight.");
        else if(BMI<29.9) infor.setText("According to your BMI, you're overweight.");
        else if(BMI<40) infor.setText("According to your BMI, you are obese.");
        else infor.setText("Please check the unit of your input values.");

    }
}