package com.example.s528748.assignment03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.TextView;

public class PriceDisplayActivity extends AppCompatActivity {


    public static double GALLON_PRICE = 2.45;
    public static double UNLEADED_GALLON_PRICE = 2.45;
    public static double PLUS_GALLON_PRICE = 2.65;
    public static double PREMIUM_GALLON_PRICE = 2.95;
    double numgallons = 1.0;
    double reqGallons;
    double pricePerGal;
    double price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_price_display);
        TextView tv = (TextView) findViewById(R.id.textView99);

        Intent intent = getIntent();
        numgallons = intent.getDoubleExtra("gallons", -1);
        reqGallons = intent.getDoubleExtra("gallonsrequired", 0.00);
        pricePerGal = intent.getDoubleExtra("pricePerGal", -2.45 );
        if(numgallons != -1){
            price = calculatePrice(numgallons);
            tv.setText("Price: " + price);
        }
        else if(reqGallons != 0.00){
            price = calculatePrice(reqGallons);
            tv.setText("Price for " + reqGallons + " Gallons is: " + price + "$");
        }
            else if(pricePerGal != -2.45)
                tv.setText("Price for a gallon: " + pricePerGal);

    }


    public double calculatePrice(double num){
        Double price = GALLON_PRICE * num;
        return  price;
    }




    public void goToStartActivity(View v){
        Intent goToStart = new Intent(this, StartActivity.class);
        goToStart.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP
                | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(goToStart);
    }





}
