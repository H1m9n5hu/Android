package com.himanshu.miwokupdate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word(R.drawable.number_one,"One", "Lutti"));
        words.add(new Word(R.drawable.number_two,"Two", "Otiiko"));
        words.add(new Word(R.drawable.number_three,"Three", "Tolookosu"));
        words.add(new Word(R.drawable.number_four,"Four", "Oyyisa"));
        words.add(new Word(R.drawable.number_five,"Five", "Massokka"));
        words.add(new Word(R.drawable.number_six,"Six", "Temmokka"));
        words.add(new Word(R.drawable.number_seven,"Seven", "Kenekaku"));
        words.add(new Word(R.drawable.number_eight,"Eight", "Kawinta"));
        words.add(new Word(R.drawable.number_nine,"Nine", "Wo'e"));
        words.add(new Word(R.drawable.number_ten,"Ten", "Na'aacha"));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}