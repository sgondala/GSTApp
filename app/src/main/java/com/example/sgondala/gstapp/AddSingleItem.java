package com.example.sgondala.gstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by sgondala on 8/14/2017.
 */

public class AddSingleItem extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleitem);

        Button button = (Button) findViewById(R.id.SubmitItemButton);
        final EditText editText = (EditText) findViewById(R.id.ItemDescription);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent();
                String description = editText.getText().toString();
                myIntent.putExtra("DESCRIPTION", description);
                setResult(RESULT_OK, myIntent);
                finish();
            }
        });
    }
}
