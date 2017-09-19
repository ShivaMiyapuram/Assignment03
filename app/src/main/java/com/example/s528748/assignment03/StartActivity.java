package com.example.s528748.assignment03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void onClick(View v){
        Button b1 = (Button) findViewById(R.id.button1);
        Button b2 = (Button) findViewById(R.id.button2);
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
