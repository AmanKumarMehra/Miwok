package com.example.miwak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // create arrayList
        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("One", "Uno", R.drawable.number_one));
        words.add(new Word("Two", "Dos",R.drawable.number_two));
        words.add(new Word("Three", "Tres", R.drawable.number_three));
        words.add(new Word("Four", "Cuatro", R.drawable.number_four));
        words.add(new Word("Five", "Cinco", R.drawable.number_five));
        words.add(new Word("Six", "Seis", R.drawable.number_six));
        words.add(new Word("Seven", "Siete", R.drawable.number_seven));
        words.add(new Word("Eight", "Ocho", R.drawable.number_eight));
        words.add(new Word("Nine", "Nueve", R.drawable.number_nine));
        words.add(new Word("Ten", "Diez", R.drawable.number_ten));

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



        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);
        // creates a list view
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
