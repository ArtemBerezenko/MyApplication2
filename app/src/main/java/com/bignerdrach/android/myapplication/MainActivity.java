package com.bignerdrach.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button enter, reset, hide;
    private TextView textLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enter = (Button) findViewById(R.id.enter);
        textLabel = (TextView) findViewById(R.id.text);
        enter.setOnClickListener(this);
        reset = (Button) findViewById(R.id.reset);
        reset.setOnClickListener(this);
        hide = (Button) findViewById(R.id.hide);
        hide.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        textLabel.getText().toString();

    }
}
