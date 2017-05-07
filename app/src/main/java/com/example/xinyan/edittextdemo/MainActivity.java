package com.example.xinyan.edittextdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends Activity {
    MyEditText edit_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit_text = (MyEditText) findViewById(R.id.edit_text);
        edit_text.setFixedText("开头文字");
    }
}
