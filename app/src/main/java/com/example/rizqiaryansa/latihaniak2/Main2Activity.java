package com.example.rizqiaryansa.latihaniak2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        result = (TextView) findViewById(R.id.tv_result);
        String getResult = getIntent().getStringExtra("nama");
        result.setText(getResult);
    }
}
