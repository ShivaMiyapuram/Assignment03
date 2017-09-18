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
        else{
            intent  = new Intent(this, PriceDisplayActivity.class);
            startActivity(intent);
        }
    }


}
