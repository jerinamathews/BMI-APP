package com.rectfy.bmiapp;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView title;
    EditText height,weight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        setContentView(R.layout.activity_main);

        title = (TextView)findViewById(R.id.app_title);
        height = (EditText)findViewById(R.id.editText);
        weight = (EditText)findViewById(R.id.editText2);

        Typeface thin = Typeface.createFromAsset(getAssets(),"fonts/Roboto-Thin.ttf");
        title.setTypeface(thin);
        height.setTypeface(thin);
        weight.setTypeface(thin);
    }
}
