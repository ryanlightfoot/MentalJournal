package com.example.journal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class JournlEntry extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journl_entry);

        TextView main = (TextView) findViewById(R.id.txtJournal);

        String newString;

        Bundle extras = getIntent().getExtras();
        newString = extras.getString("Main");

        main.setText(newString);
    }
}