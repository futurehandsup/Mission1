package com.example.android.mission1;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.NetworkOnMainThreadException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Console;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        // ActionBar에 타이틀 변경
        getSupportActionBar().setTitle("Read Write a String");
        // ActionBar의 배경색 변경
        //getSupportActionBar().setBackgroundDrawable(new ColorDrawable(0xFF339999));
    }

    public void onClickImageSaveButton(View view) {
        EditText titleText = (EditText) findViewById(R.id.editText3);

        TextView textView = (TextView) findViewById(R.id.textView);


        textView.setText(titleText.getText());

        EditText urlText = (EditText) findViewById(R.id.editText2);
        String myUrl = urlText.getText().toString();

        LoadBitmap load = new LoadBitmap();
        load.execute(myUrl);
    }


    public class LoadBitmap extends AsyncTask<String, Void, Bitmap> {
        ProgressDialog pd = new ProgressDialog(ImageActivity.this);

        @Override
        protected void onPreExecute() {

            super.onPreExecute();
            pd.setMessage("로딩중입니다...");
            pd.show();
        }

        @Override
        protected Bitmap doInBackground(String... params) {
            Bitmap b;
            try {
                URL url = new URL(params[0]);
                InputStream inputStream = (InputStream) url.getContent();
                b = BitmapFactory.decodeStream(inputStream);
                return b;
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;

        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            if (bitmap != null) {
                ImageView imageView = (ImageView) findViewById(R.id.imageView);
                imageView.setImageBitmap(bitmap);

            } else {

            }
            pd.dismiss();
        }

    }

}
