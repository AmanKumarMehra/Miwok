package com.example.miwak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // create arrayList
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Where are you going?", "minto wuksus"));
        words.add(new Word("What is your name?", "tinnÓ™ oyaase'nÓ™"));
        words.add(new Word("My name is...", "oyaaset..."));
        words.add(new Word("How are you feeling?", "michÓ™ksÓ™s?"));
        words.add(new Word("Iâ€™m feeling good.", "kuchi achit"));
        words.add(new Word("Are you coming?", "Ó™Ó™nÓ™s'aa?"));
        words.add(new Word("Yes, Iâ€™m coming.", "hÓ™Ó™â€™ Ó™Ó™nÓ™m"));
        words.add(new Word("Iâ€™m coming.", "Ó™Ó™nÓ™m"));
        words.add(new Word("Letâ€™s go.", "yoowutis"));
        words.add(new Word("Come here.", "Ó™nni'nem"));


       /* LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        for(int i=0; i<words.size(); i++){
            // create a new textView
            TextView wordView = new TextView(this);

            // set the text to be word at current text
            wordView.setText(words.get(i));

            //add this textView as another child to rootView Layout
            rootView.addView(wordView);
        }*/


        // create an ArrayAdapter whose data source is list of arrays
       /* ArrayAdapter<String> itemsAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,words);

        // creates a grid view --> go to word_list.xmlhange ListView to TextView
        GridView listView = (GridView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);*/


        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);
        // creates a list view
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
