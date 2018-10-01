package com.example.user.p0020trafficlight;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    private ConstraintLayout mConstraintLayout;
    private TextView mTextView;

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.buttonGreen:
                    mTextView.setText(R.string.green);
                    mConstraintLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.green));
                    break;
                case R.id.buttonRed:
                    mTextView.setText(R.string.red);
                    mConstraintLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.red));
                    break;
                case R.id.buttonYellow:
                    mTextView.setText(R.string.yellow);
                    mConstraintLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.yellow));
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mConstraintLayout = findViewById(R.id.constraintLayout);
        mTextView = findViewById(R.id.textView);

        Button yellowButton = findViewById(R.id.buttonYellow);
        Button redButton = findViewById(R.id.buttonRed);
        Button greenButton = findViewById(R.id.buttonGreen);

        yellowButton.setOnClickListener(onClickListener);
        redButton.setOnClickListener(onClickListener);
        greenButton.setOnClickListener(onClickListener);
    }

}
