package com.samsung.myitschool.december;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Two plus two is four = quick math
        System.out.print("DASIP WAS HERE!");

    }


    @Override
    public void onClick(View view) {

    }
}
