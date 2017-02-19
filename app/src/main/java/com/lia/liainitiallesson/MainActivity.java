package com.lia.liainitiallesson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int pressedNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View button = findViewById(R.id.intriguing_button);
        final TextView text = (TextView) findViewById(R.id.text);
g
        button.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                text.setText("Hello Lia from Ilya [" + pressedNumber + "]!");
                pressedNumber++;
            }
        });
    }
}