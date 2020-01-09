package com.example.shopsrxjava;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.act_main_task_one_btn).setOnClickListener(v -> {
            startActivity(new Intent(this, TaskOneActivity.class));
        });
        findViewById(R.id.act_main_task_two_btn).setOnClickListener(v -> {
            startActivity(new Intent(this, TaskTwoActivity.class));
        });
    }
}
