package com.example.s528748.assignment03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.TextView;

public class PriceDisplayActivity extends AppCompatActivity {


    public static double GALLON_PRICE = 2.45;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_price_display);
        Double numgallons;
        Intent intent = getIntent();
        numgallons = intent.getDoubleExtra("gallons", 0.00);
        Double price = GALLON_PRICE * numgallons;
        String displayPrice = "" + price;
        TextView tv =  (TextView) findViewById(R.id.textView99);
        tv.append(displayPrice);
    }

    public void goToStartActivity(View v){
        Intent goToStart = new Intent(this, StartActivity.class);
        goToStart.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP
                | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(goToStart);
    }





}
