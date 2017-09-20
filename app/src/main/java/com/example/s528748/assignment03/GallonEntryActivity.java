package com.example.s528748.assignment03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class GallonEntryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallon_entry);
    }

    public void calculatePrice(View v){
        EditText editText = (EditText) findViewById(R.id.editText);
        String value = editText.getText().toString();

        if(value.length()>0) {
            double gallons = Double.parseDouble(value);
            Intent intent;
            intent = new Intent(this, PriceDisplayActivity.class);
            intent.putExtra("gallons", gallons);
            startActivity(intent);
        }
        else
            Toast.makeText(this, "invalid input", Toast.LENGTH_SHORT).show();

    }
}
