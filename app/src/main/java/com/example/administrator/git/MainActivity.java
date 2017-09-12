package com.example.administrator.git;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initDta();


    }

    private void initDta() {

    }

    private void initView() {
        ArrayList<String> ar = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            ar.add("石星星");

        }
    }
}
