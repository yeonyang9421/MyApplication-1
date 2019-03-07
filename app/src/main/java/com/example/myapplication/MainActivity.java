package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText mCommandEditText;
    private EditText mNumberEditText;

    private Computer mComputer;

    private String mTitle = "Hello World";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 화면 레이아웃
        setContentView(R.layout.activity_main);

        mCommandEditText = findViewById(R.id.commandEditText);
        mNumberEditText = findViewById(R.id.numberEditText);

        mComputer = new Computer();

        mComputer.set(1, 30);

        getSupportActionBar().setTitle(mTitle);
    }

    public void calculate(View view) {
        int number = Integer.valueOf(mNumberEditText.getText().toString());
        switch (mCommandEditText.getText().toString()) {
            case "ADD":
                mComputer.add(number);
                break;
            case "SUB":
                mComputer.sub(number);
                break;
        }

        Toast.makeText(this, mComputer.var2 + "", Toast.LENGTH_SHORT).show();
    }

    public void changeTitle(View view) {
        getSupportActionBar().setTitle("헬로 월드");
    }
}
