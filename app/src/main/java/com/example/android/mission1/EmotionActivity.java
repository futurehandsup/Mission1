package com.example.android.mission1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class EmotionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emotion);
        // ActionBar에 타이틀 변경
        getSupportActionBar().setTitle("Emotion");
    }

    public void onClickHappyButton(View view) {
        TextView textView = (TextView) findViewById(R.id.text1);
        textView.setText("Happy");
    }

    public void onClickGloomyButton(View view) {
        TextView textView = (TextView) findViewById(R.id.text1);
        textView.setText("Gloomy");
    }
}
