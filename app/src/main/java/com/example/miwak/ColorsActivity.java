package com.example.miwak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // create arrayList
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Red", "Rojo", R.drawable.color_red));

        words.add(new Word("Green", "Verde", R.drawable.color_green));

        words.add(new Word("Yellow", "Amarillo", R.drawable.color_mustard_yellow));
        words.add(new Word("Grey", "Gris", R.drawable.color_gray));
        words.add(new Word("Brown", "Marron", R.drawable.color_brown));
        words.add(new Word("Black", "Negro", R.drawable.color_black));
        words.add(new Word("White", "Blanco", R.drawable.color_white));

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



        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);
        // creates a list view
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }

}
