package com.example.lab04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    ListView lstView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstView = findViewById(R.id.listView);
        List<MonHoc> lstMonHoc = new ArrayList<>();
        MonHocAdapter adapter = new MonHocAdapter(lstMonHoc);
        lstView.setAdapter(adapter);
        lstMonHoc.add(new MonHoc("di dong", "CMP364", "lAP TRINH DI DONG", "Nguyen Huy Cuong"));
        lstMonHoc.add(new MonHoc("di dong","CMP354","Lap trinh windows","Nguyen Huy Cuong"));


        lstView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MonHoc dataModel = lstMonHoc.get(position);
                Snackbar.make(view, String.format("%s - %s \n %s", dataModel.MaHP,dataModel.TenHP,dataModel.TenGV), Snackbar.LENGTH_LONG)
                        .setAction("No action",null).show();
            }
        });
    }
    
}