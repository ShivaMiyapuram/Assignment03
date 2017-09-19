package com.example.s528748.assignment03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ComputeGallonsRequiredActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compute_gallons_required);
    }

    public void gallonsRequired(View v){
        double gallonsReq;
        EditText distance = (EditText) findViewById(R.id.editText3);
        EditText mileage = (EditText) findViewById(R.id.editText2);
        double dist =Double.parseDouble(distance.getText().toString());
        double mil =Double.parseDouble(mileage.getText().toString());
        gallonsReq = (dist / mil);
        Intent intent = new Intent(this, PriceDisplayActivity.class);
        intent.putExtra("gallonsrequired", gallonsReq);
        startActivity(intent);
    }


}
