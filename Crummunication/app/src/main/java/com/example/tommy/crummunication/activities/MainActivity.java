package com.example.tommy.crummunication.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.tommy.crummunication.R;

public class MainActivity extends AppCompatActivity {

    private TextView helloWorld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloWorld = (TextView)(findViewById(R.id.tv_hello_world));

        helloWorld.setText("hi");
    }
}
