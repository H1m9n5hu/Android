package com.himanshu.miwokupdate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word(R.drawable.color_red,"Red", "weṭeṭṭi"));
        words.add(new Word(R.drawable.color_green,"Green", "chokokki"));
        words.add(new Word(R.drawable.color_brown,"Brown", "ṭakaakki"));
        words.add(new Word(R.drawable.color_gray,"Gray", "ṭopoppi"));
        words.add(new Word(R.drawable.color_black,"Black", "kululli"));
        words.add(new Word(R.drawable.color_white,"White", "kelelli"));
        words.add(new Word(R.drawable.color_dusty_yellow,"Dusty Yellow", "ṭopiisә"));
        words.add(new Word(R.drawable.color_mustard_yellow,"Mustard Yellow", "chiwiiṭә"));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}