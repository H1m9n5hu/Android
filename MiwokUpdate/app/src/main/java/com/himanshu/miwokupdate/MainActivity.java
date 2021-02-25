package com.himanshu.miwokupdate;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers,family,colors,phrases;

        numbers = findViewById(R.id.numbers1);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numbersIntent = new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });
//
//        family = findViewById(R.id.family);
//        family.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent familyIntent = new Intent(MainActivity.this,FamilyActivity.class);
//                startActivity(familyIntent);
//            }
//        });
//
//        colors = findViewById(R.id.colors);
//        colors.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent colorsIntent = new Intent(MainActivity.this,ColorsActivity.class);
//                startActivity(colorsIntent);
//            }
//        });
//
//        phrases = findViewById(R.id.phrases);
//        phrases.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent phrasesIntent = new Intent(MainActivity.this,PhrasesActivity.class);
//                startActivity(phrasesIntent);
//            }
//        });

    }

//    public void listOfNumbers(View view) {
//        Intent i = new Intent(this, NumbersActivity.class);
//        startActivity(i);
//    }

    public void listOfFamilyMembers(View view) {
        Intent i = new Intent(this, FamilyActivity.class);
        startActivity(i);
    }

    public void listOfColors(View view) {
        Intent i = new Intent(this, ColorsActivity.class);
        startActivity(i);
    }

    public void phrases(View view) {
        Intent i = new Intent(this, PhrasesActivity.class);
        startActivity(i);
    }

}