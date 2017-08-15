package com.example.sgondala.gstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);

        Button showBillsButton = (Button) findViewById(R.id.ShowBillsButton);
        showBillsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, ShowBillsActivity.class);
                startActivity(myIntent);
            }
        });

        Button addBillButton = (Button) findViewById(R.id.AddBillButton);
        addBillButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, AddBillActivity.class);
                startActivity(myIntent);
            }
        });
    }
}
