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

        Log.e("print", "onCreate: " + 55);
        Log.e("print", "onCreate: " + 55);
        Log.e("print", "onCreate: " + 55);

        for (int i = 0; i < 10; i++) {
            Log.e("print", "onCreate: 222222");
        }

    }
}
