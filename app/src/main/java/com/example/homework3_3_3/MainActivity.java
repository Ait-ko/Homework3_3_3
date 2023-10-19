package com.example.homework3_3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> contactName = new ArrayList<>();
    private RecyclerView rv_contact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        loadData();
    }

    private void loadData() {
        contactName.add("509 357 680");
        contactName.add("789 688 646");
        contactName.add("786 354 326");
        contactName.add("644 273 937 ");
        contactName.add("948 753 657");
        contactName.add("095 374 735");
        contactName.add("087 974 251");
        contactName.add("643 284 374");
        contactName.add("098 521 235");
        contactName.add("077 856 373");
        contactName.add("086 535 367");
        contactName.add("968 746 857");
        initAdapter();
    }
    private void initAdapter(){
        contactAdapter adapter = new contactAdapter(contactName);
        rv_contact.setAdapter(adapter);
    }

    private void initView() {
        rv_contact = findViewById(R.id.rv_activityMain);
    }

}