package com.example.rizqiaryansa.latihaniak2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int skorA, skorB = 0;
    TextView scoreATextView, scoreBTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreATextView = (TextView) findViewById(R.id.skorA_text_view);
        scoreBTextView = (TextView) findViewById(R.id.skorB_text_view);
    }


    public void threepointB(View view) {
        skorB = skorB + 3;
        displayB(skorB);
    }

    public void twopointB(View view) {
        skorB = skorB + 2;
        displayB(skorB);
    }

    public void freepointB(View view) {
        skorB = skorB + 1;
        displayB(skorB);
    }

    public void threepointA(View view) {
        skorA = skorA + 3;
        displayA(skorA);
    }

    public void twopointA(View view) {
        skorA = skorA + 2;
        displayA(skorA);
    }

    public void freepointA(View view) {
        skorA = skorA + 1;
        displayA(skorA);
    }

    public void resetAll(View view) {
        Intent intent = new Intent(this, SummaryActivity.class)
                .putExtra("scoreA", skorA)
                .putExtra("scoreB", skorB);
        startActivity(intent);

//        Intent intent = new Intent(this, Main2Activity.class);
//        intent.putExtra("nama", "Skornya adalah " + skorA);
//        startActivity(intent);

        skorA = 0;
        skorB = 0;
        displayA(skorA);
        displayB(skorB);
    }

    private void displayA(int number) {

        scoreATextView.setText("" + number);
    }

    private void displayB(int number) {

        scoreBTextView.setText("" + number);
    }


}
