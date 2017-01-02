package com.example.byonge.a1117;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void monitoring(View v){
        Intent intent = new Intent(MainActivity.this, monitoring.class);
        startActivity(intent);
        //finish();
    }
    public void control(View v){
        Intent intent = new Intent(MainActivity.this, control.class);
        startActivity(intent);
        //finish();
    }
    public void report(View v){
        Intent intent = new Intent(MainActivity.this, report.class);
        startActivity(intent);
        //finish();
    }
}
