package com.example.journal;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
public int position;
public String[] arrJournals = {"26 Dec", "2 Feb"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, arrJournals);

        ListView journalList = (ListView) findViewById(R.id.lvJournal);

        journalList.setAdapter(itemsAdapter);

        journalList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
                String strPos = arrJournals[pos];
                startActivity(new Intent(MainActivity.this, JournlEntry.class).putExtra("Main", strPos));
                position = pos;
            }
        });
    }
}
