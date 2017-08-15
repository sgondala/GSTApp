package com.example.sgondala.gstapp;

import android.app.Activity;
import android.app.IntentService;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sgondala on 8/14/2017.
 */

public class AddBillActivity extends ListActivity {

    ArrayList<String> listItems = new ArrayList<String>();
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addbill);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listItems);
        setListAdapter(adapter);

        Button addBillButton = (Button) findViewById(R.id.AddItemButton);
        addBillButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(AddBillActivity.this, AddSingleItem.class);
                startActivityForResult(myIntent, 1);
            }

        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1){
            if(resultCode == RESULT_OK){
//                TextView textView = (TextView) findViewById(R.id.DisplayDescription);
//                textView.setText(data.getStringExtra("DESCRIPTION"));
                listItems.add(data.getStringExtra("DESCRIPTION"));
                adapter.notifyDataSetChanged();
            }
        }
    }
}
