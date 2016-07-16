package com.example.android.mission1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickEmotionButton(View view) {
        Intent intent = new Intent(
                getApplicationContext(), // 현재 화면의 제어권자
                EmotionActivity.class); // 다음 넘어갈 클래스 지정
        startActivity(intent); // 다음 화면으로 넘어간다
    }

    public void onClickEditViewButton(View view) {
        Intent intent = new Intent(
                getApplicationContext(), // 현재 화면의 제어권자
                EditViewActivity.class); // 다음 넘어갈 클래스 지정
        startActivity(intent); // 다음 화면으로 넘어간다
    }

    public void onClickImageButton(View view) {
        Intent intent = new Intent(
                getApplicationContext(), // 현재 화면의 제어권자
                ImageActivity.class); // 다음 넘어갈 클래스 지정
        startActivity(intent); // 다음 화면으로 넘어간다
    }
    public void onClickListViewButton(View view) {
        Intent intent = new Intent(
                getApplicationContext(), // 현재 화면의 제어권자
                ListViewActivity.class); // 다음 넘어갈 클래스 지정
        startActivity(intent); // 다음 화면으로 넘어간다
    }

}
