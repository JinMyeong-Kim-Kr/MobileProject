package com.example.project;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class BoardPlatformXboxActivity extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.board_platform_xbox);
        //상단 바 제거
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        // 스피너
        String[] array = {"제목","작성자","게임명"};
        Spinner SPN_xbox = (Spinner) findViewById(R.id.spn_xbox);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, array);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        SPN_xbox.setAdapter(adapter);
    }
}