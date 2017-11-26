package com.example.rizqiaryansa.latihaniak2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SummaryActivity extends AppCompatActivity {

    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        Intent intent = getIntent();
        int pointA = intent.getIntExtra("scoreA", 0);
        int pointB = intent.getIntExtra("scoreB", 0);

        tvHasil = (TextView) findViewById(R.id.tvHasil);

        String pesan = "Skor tim A = " + pointA + "\nSkor tim B = " + pointB;

        tvHasil.setText(pesan);
    }
}
