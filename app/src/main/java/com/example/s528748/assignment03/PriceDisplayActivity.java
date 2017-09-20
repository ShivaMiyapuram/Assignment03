package com.example.s528748.assignment03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

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
        String cos = "";
        if(numgallons != -1){
            price = calculatePrice(numgallons);
            cos = String.format("%.2f", price);
            tv.setText("Price: " + cos + "$");
        }
        else if(reqGallons != 0.00){
            price = calculatePrice(reqGallons);
            cos =  String.format("%.2f", price);
            tv.setText("Price for " + String.format("%.2f",reqGallons) + " Gallons is: " + cos + "$");
        }
            else if(pricePerGal != -2.45)
                tv.setText("Price for a gallon: " + pricePerGal  + "$");

        RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb;
                TextView tv = (TextView) findViewById(R.id.textView99);
                String cost;
                switch (checkedId) {
                    case R.id.radioButton1:
                        // TODO Something
                        rb = (RadioButton) findViewById(R.id.radioButton1);
                        Toast.makeText(PriceDisplayActivity.this,
                                rb.getText()+ "@" + UNLEADED_GALLON_PRICE, Toast.LENGTH_SHORT).show();
                        if(numgallons != -1){
                            price =  numgallons * UNLEADED_GALLON_PRICE;
                            cost = String.format("%.2f", price);
                            tv.setText("Price: " + cost + "$");
                        }
                        else if(reqGallons != 0.00){
                            price = reqGallons * UNLEADED_GALLON_PRICE;
                            cost = String.format("%.2f", price);
                            tv.setText("Price for " + String.format("%.2f",reqGallons) + " Gallons is: " + cost + "$");
                        }
                        else if(pricePerGal != -2.45) {
                         //   price = reqGallons * UNLEADED_GALLON_PRICE;
                            tv.setText("Price for a gallon: " + UNLEADED_GALLON_PRICE + "$");
                        }
                        break;
                    case R.id.radioButton3:
                        // TODO Something
                        rb = (RadioButton) findViewById(R.id.radioButton2);
                        Toast.makeText(PriceDisplayActivity.this,
                                rb.getText() + "@" + PREMIUM_GALLON_PRICE, Toast.LENGTH_SHORT).show();
                        if(numgallons != -1){
                            price =  numgallons * PREMIUM_GALLON_PRICE;
                            cost = String.format("%.2f", price);
                            tv.setText("Price: " + cost + "$");
                        }
                        else if(reqGallons != 0.00){
                            price = reqGallons * PREMIUM_GALLON_PRICE;
                            cost = String.format("%.2f", price);
                            tv.setText("Price for " + String.format("%.2f",reqGallons) + " Gallons is: " + cost + "$");
                        }
                        else if(pricePerGal != -2.45) {
                           // price = reqGallons * PREMIUM_GALLON_PRICE;
                            tv.setText("Price for a gallon: " + PREMIUM_GALLON_PRICE + "$");
                        }
                        break;
                    case R.id.radioButton2:
                        // TODO Something
                        rb = (RadioButton) findViewById(R.id.radioButton3);
                        Toast.makeText(PriceDisplayActivity.this,
                                rb.getText() + "@" + PLUS_GALLON_PRICE, Toast.LENGTH_SHORT).show();
                        if(numgallons != -1){
                            price =  numgallons * PLUS_GALLON_PRICE;
                            cost = String.format("%.2f", price);
                            tv.setText("Price: " + cost + "$");
                        }
                        else if(reqGallons != 0.00){
                            price = reqGallons * PLUS_GALLON_PRICE;
                            cost = String.format("%.2f", price);
                            tv.setText("Price for " + String.format("%.2f",reqGallons) + " Gallons is: " + cost + "$");
                        }
                        else if(pricePerGal != -2.45) {
                        //    price = reqGallons * PLUS_GALLON_PRICE;
                            tv.setText("Price for a gallon: " + PLUS_GALLON_PRICE + "$");
                        }
                        break;
                }
            }
        });




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
