package com.example.test.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int count = 0;
    private TextView showCountTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showCountTextView = (TextView) findViewById(R.id.show_count_textView);
    }

    public void showToast(View view) {
        Toast tost =Toast.makeText(this,R.string.toast_message,Toast.LENGTH_SHORT);
        tost.show();
    }

    public void showCount(View view) {
        ++count;

        if (showCountTextView!=null)
            showCountTextView.setText(Integer.toString(count));
    }
}