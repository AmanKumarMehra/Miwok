package com.example.miwak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // create arrayList
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Papa", "Padre", R.drawable.family_father));
        words.add(new Word("Mummy", "Madre", R.drawable.family_mother));
        words.add(new Word("GrandFather", "Abuelo", R.drawable.family_grandfather));
        words.add(new Word("GrandMother", "Abuela", R.drawable.family_grandmother));
        words.add(new Word("Brother", "Hermano", R.drawable.family_older_brother));
        words.add(new Word("Sister", "Hermana", R.drawable.family_older_sister));
        words.add(new Word("Nephew", "Sobrino", R.drawable.family_younger_brother));
        words.add(new Word("Niece", "Sobrina", R.drawable.family_younger_sister));

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



        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);
        // creates a list view
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
