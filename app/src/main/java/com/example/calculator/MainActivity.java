package com.example.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.calculator.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Integer firstValue = 0;
    private Integer secondValue = 0;
    private Integer result = 0;
    private TextView tvResult;
    private Button btnOne, btnTwo, btnPlus, btnEqual, btnClear, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero, btnMinus, btnSlash, btnMultiplication;
    private boolean onCheckFirstValue = true;
    private boolean operation = false;
    private boolean plusClick, minusClick, slashClick, multClick = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult = findViewById(R.id.tv_result);
        btnOne = findViewById(R.id.btn_one);
        btnTwo = findViewById(R.id.btn_two);
        btnPlus = findViewById(R.id.btn_plus);
        btnEqual = findViewById(R.id.btn_equal);
        btnClear = findViewById(R.id.btn_clear);
        btnThree = findViewById(R.id.btn_three);
        btnFour = findViewById(R.id.btn_four);
        btnFive = findViewById(R.id.btn_five);
        btnSix = findViewById(R.id.btn_six);
        btnSeven = findViewById(R.id.btn_seven);
        btnEight = findViewById(R.id.btn_eight);
        btnNine = findViewById(R.id.btn_nine);
        btnZero = findViewById(R.id.btn_zero);
        btnMinus = findViewById(R.id.btn_minus);
        btnSlash = findViewById(R.id.btn_slash);
        btnMultiplication = findViewById(R.id.btn_multiplication);

        calculatedNew();
    }

    @SuppressLint("SetTextI18n")
    public void calculatedNew() {
        btnOne.setOnClickListener(v -> {
            if (onCheckFirstValue) {
                if (firstValue.equals(0)) firstValue = 1;
                else firstValue = Integer.valueOf(firstValue + "1");
                tvResult.setText(firstValue.toString());
            } else {
                if (secondValue.equals(0)) secondValue = 1;
                else secondValue = Integer.valueOf(secondValue + "1");
                tvResult.setText(secondValue.toString());
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onCheckFirstValue) {
                    if (firstValue.equals(0)) firstValue = 2;
                    else firstValue = Integer.valueOf(firstValue + "2");
                    tvResult.setText(firstValue.toString());
                } else {
                    if (secondValue.equals(0)) secondValue = 2;
                    else secondValue = Integer.valueOf(secondValue + "2");
                    tvResult.setText(secondValue.toString());
                }
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onCheckFirstValue) {
                    if (firstValue.equals(0)) firstValue = 3;
                    else firstValue = Integer.valueOf(firstValue + "3");
                    tvResult.setText(firstValue.toString());
                } else {
                    if (secondValue.equals(0)) secondValue = 3;
                    else secondValue = Integer.valueOf(secondValue + "3");
                    tvResult.setText(secondValue.toString());
                }
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onCheckFirstValue) {
                    if (firstValue.equals(0)) firstValue = 4;
                    else firstValue = Integer.valueOf(firstValue + "4");
                    tvResult.setText(firstValue.toString());
                } else {
                    if (secondValue.equals(0)) secondValue = 4;
                    else secondValue = Integer.valueOf(secondValue + "4");
                    tvResult.setText(secondValue.toString());
                }
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onCheckFirstValue) {
                    if (firstValue.equals(0)) firstValue = 5;
                    else firstValue = Integer.valueOf(firstValue + "5");
                    tvResult.setText(firstValue.toString());
                } else {
                    if (secondValue.equals(0)) secondValue = 5;
                    else secondValue = Integer.valueOf(secondValue + "5");
                    tvResult.setText(secondValue.toString());
                }
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onCheckFirstValue) {
                    if (firstValue.equals(0)) firstValue = 6;
                    else firstValue = Integer.valueOf(firstValue + "6");
                    tvResult.setText(firstValue.toString());
                } else {
                    if (secondValue.equals(0)) secondValue = 6;
                    else secondValue = Integer.valueOf(secondValue + "6");
                    tvResult.setText(secondValue.toString());
                }
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onCheckFirstValue) {
                    if (firstValue.equals(0)) firstValue = 7;
                    else firstValue = Integer.valueOf(firstValue + "7");
                    tvResult.setText(firstValue.toString());
                } else {
                    if (secondValue.equals(0)) secondValue = 7;
                    else secondValue = Integer.valueOf(secondValue + "7");
                    tvResult.setText(secondValue.toString());
                }
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onCheckFirstValue) {
                    if (firstValue.equals(0)) firstValue = 8;
                    else firstValue = Integer.valueOf(firstValue + "8");
                    tvResult.setText(firstValue.toString());
                } else {
                    if (secondValue.equals(0)) secondValue = 8;
                    else secondValue = Integer.valueOf(secondValue + "8");
                    tvResult.setText(secondValue.toString());
                }
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onCheckFirstValue) {
                    if (firstValue.equals(0)) firstValue = 9;
                    else firstValue = Integer.valueOf(firstValue + "9");
                    tvResult.setText(firstValue.toString());
                } else {
                    if (secondValue.equals(0)) secondValue = 9;
                    else secondValue = Integer.valueOf(secondValue + "9");
                    tvResult.setText(secondValue.toString());
                }
            }
        });
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onCheckFirstValue) {
                    if (firstValue.equals(0)) firstValue = 0;
                    else firstValue = Integer.valueOf(firstValue + "0");
                    tvResult.setText(firstValue.toString());
                } else {
                    if (secondValue.equals(0)) secondValue = 0;
                    else secondValue = Integer.valueOf(secondValue + "0");
                    tvResult.setText(secondValue.toString());
                }
            }
        });

        btnPlus.setOnClickListener(v -> {
            operation = true;
            onCheckFirstValue = false;
            plusClick = true;


        });
        btnMinus.setOnClickListener(v -> {
            operation = true;
            onCheckFirstValue = false;
            minusClick = true;


        });
        btnSlash.setOnClickListener(v -> {
            operation = true;
            onCheckFirstValue = false;
            slashClick = true;


        });
        btnMultiplication.setOnClickListener(v -> {
            operation = true;
            onCheckFirstValue = false;
            multClick = true;


        });


        btnClear.setOnClickListener(v -> {
            firstValue = 0;
            secondValue = 0;
            tvResult.setText("0");
            result = 0;
        });

        btnEqual.setOnClickListener(v -> {
            if (operation && plusClick) {
                result = firstValue + secondValue;
                operation = false;
                plusClick = false;
                tvResult.setText(result.toString());
                firstValue = 0;
                secondValue = 0;
                result = 0;
                onCheckFirstValue = true;
            } else if (operation && minusClick) {
                result = firstValue - secondValue;
                operation = false;
                minusClick = false;
                tvResult.setText(result.toString());
                firstValue = 0;
                secondValue = 0;
                result = 0;
                onCheckFirstValue = true;
            } else if (operation && slashClick) {
                result = firstValue / secondValue;
                operation = false;
                slashClick = false;
                tvResult.setText(result.toString());
                firstValue = 0;
                secondValue = 0;
                result = 0;
                onCheckFirstValue = true;
            } else if (operation && multClick) {
                result = firstValue * secondValue;
                operation = false;
                multClick = false;
                tvResult.setText(result.toString());
                firstValue = 0;
                secondValue = 0;
                result = 0;
                onCheckFirstValue = true;
            }
        });
    }
}