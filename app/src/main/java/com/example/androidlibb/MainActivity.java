package com.example.androidlibb;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dalcapture.Calculate;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println(""+ new Calculate().addValues(10, 20));
    }
}