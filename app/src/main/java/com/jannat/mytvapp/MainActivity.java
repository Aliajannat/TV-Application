package com.jannat.mytvapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button somoytv, jamunatv, akatturtv, atntv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        somoytv = findViewById(R.id.hum);
        jamunatv = findViewById(R.id.any);
        akatturtv = findViewById(R.id.samma);
        atntv = findViewById(R.id.express);
        
        somoytv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                somoytvmethod();
            }
        });
        jamunatv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jamunatvmethod();
            }
        });

        akatturtv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                akkaturtvmethod();
            }
        });

        atntv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               atntvmethod();
            }
        });
    }

    private void atntvmethod() {


        Intent intent = new Intent(MainActivity.this,Webview.class);
        intent.putExtra("links"," https://ekattor.tv/");

        startActivity(intent);
    }

    private void akkaturtvmethod() {


        Intent intent = new Intent(MainActivity.this,Webview.class);
        intent.putExtra("links","https://www.channel24bd.tv/");
        startActivity(intent);
    }

    private void jamunatvmethod() {


        Intent intent = new Intent(MainActivity.this,Webview.class);
        intent.putExtra("links","https://www.jamuna.tv/");
        startActivity(intent);
    }

    private void somoytvmethod() {

        Intent intent = new Intent(MainActivity.this,Webview.class);
        intent.putExtra("links","https://www.somoynews.tv/");
        startActivity(intent);
    }
}