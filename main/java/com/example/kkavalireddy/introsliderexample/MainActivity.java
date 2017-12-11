package com.example.kkavalireddy.introsliderexample;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout constraintLayout = (ConstraintLayout)findViewById(R.id.cons);

        TextView textView = new TextView(this);
        textView.setText(Html.fromHtml("<html><body ><h1>Hello man</h1></body></html>"));
        constraintLayout.addView(textView);
    }
}
