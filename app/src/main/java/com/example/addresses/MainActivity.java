package com.example.addresses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> address;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();
        recyclerView = findViewById(R.id.recycler_address);
        AddressAdapter adapter = new AddressAdapter(address);
        recyclerView.setAdapter(adapter);

    }

    private void loadData(){
        address = new ArrayList<>();
        address.add("Sovetskya, 2");
        address.add("4-34-23");
        address.add("Yunusalieva, 34");
        address.add("Moskovskaya, 7");
        address.add("Fuchika, 99");
        address.add("Ibraimova, 33");
        address.add("Skryabina, 1");
        address.add("Kalyk Akieva, 54");
        address.add("Suerkulova, 90");
        address.add("Kievskaya, 83");
        address.add("Orozbekova, 45");
        address.add("Chuy, 145");
        address.add("Panfilova, 125");
    }
}