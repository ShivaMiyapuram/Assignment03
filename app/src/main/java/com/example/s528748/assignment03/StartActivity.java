package com.example.s528748.assignment03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void onClick(View v){
        ImageButton b1 = (ImageButton) findViewById(R.id.button1);
        ImageButton b2 = (ImageButton) findViewById(R.id.button2);
        Intent intent;
        if(v.getId() == R.id.button1){
          intent = new Intent(this, GallonEntryActivity.class);
          startActivity(intent);
        }
        else if(v.getId() == R.id.button2){
            intent  = new Intent(this, PriceDisplayActivity.class);
            intent.putExtra("pricePerGal", 2.45);
            startActivity(intent);
        }
        else if(v.getId() == R.id.button4){
            intent  = new Intent(this, ComputeGallonsRequiredActivity.class);
            startActivity(intent);
        }
    }


}
