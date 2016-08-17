package com.ouyang.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.btn);
        TextView tv = (TextView) findViewById(R.id.tv);

        Log.e("print", "onCreate: " + 22222);
        Log.e("print", "onCreate: " + 22222);
        Log.e("print", "onCreate: " + 22222);
        Log.e("print", "onCreate: " + 22222);
    }
}
