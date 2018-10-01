package com.example.user.p0019counter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private Button mCrowsCounterButton;
    private TextView mInfoTextView;
    private int mCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mInfoTextView = findViewById(R.id.textView);
        mCrowsCounterButton = findViewById(R.id.crows_count_button);
        mCrowsCounterButton.setOnClickListener(v -> mInfoTextView.setText("Я насчитал " + ++mCount + " ворон."));

    }

    public void onClick(View view) {
        mInfoTextView.setText("Hello Kitty");
    }
}
