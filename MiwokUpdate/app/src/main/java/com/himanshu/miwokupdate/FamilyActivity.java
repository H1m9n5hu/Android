package com.himanshu.miwokupdate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word(R.drawable.family_grandfather,"GrandFather", "paapa"));
        words.add(new Word(R.drawable.family_grandmother,"GrandMother", "ama"));
        words.add(new Word(R.drawable.family_father,"Father", "әpә"));
        words.add(new Word(R.drawable.family_mother,"Mother", "әṭa"));
        words.add(new Word(R.drawable.family_son,"Son", "angsi"));
        words.add(new Word(R.drawable.family_daughter,"Daughter", "tune"));
        words.add(new Word(R.drawable.family_older_brother,"Older Brother", "taachi"));
        words.add(new Word(R.drawable.family_younger_brother,"Younger Brother", "chalitti"));
        words.add(new Word(R.drawable.family_older_sister,"Older Sister", "teṭe"));
        words.add(new Word(R.drawable.family_younger_sister,"Younger Sister", "kolliti"));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}