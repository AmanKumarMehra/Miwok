package com.example.miwak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void numbers(View View){
        Intent intent = new Intent(this, NumberActivity.class);
        startActivity(intent);
    }

    public void family(View View){
        Intent intent = new Intent(this, FamilyActivity.class);
        startActivity(intent);
    }

    public void colors(View View){
        Intent intent = new Intent(this, ColorsActivity.class);
        startActivity(intent);
    }

    public void phrase(View View){
        Intent intent = new Intent(this, PhrasesActivity.class);
        startActivity(intent);
    }
}
