package com.example.quizzerrr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {
    private TextView total,scored;
    private Button donebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        total = findViewById(R.id.total);
        scored = findViewById(R.id.scored);
        donebtn = findViewById(R.id.done_btn);
        scored.setText(String.valueOf(getIntent().getIntExtra("score",0)));
        total.setText("OUT OF "+String.valueOf(getIntent().getIntExtra("total",0)));
        donebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}