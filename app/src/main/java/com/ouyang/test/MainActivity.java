package com.ouyang.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

        Log.e("print", "onCreate: branch");
        Log.e("print", "onCreate: branch");
        Log.e("print", "onCreate: branch");
//
        Log.e("print", "onCreate: branches");
        Log.e("print", "onCreate: branches");
        Log.e("print", "onCreate: branches");

    }
}
