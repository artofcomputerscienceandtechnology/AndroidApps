package com.example.doggotrainingapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.doggotrainingapp.databinding.ActivityMainBinding;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        //NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        //NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        //NavigationUI.setupWithNavController(binding.navView, navController);


        //Test code

    }

    //Add word arra

    String[][] knownVocab = { {"One", "いち", "ichi"}
            ,{"two", "に", "ni"}};

    String[][] vocab = { {"One", "いち", "ichi"},
            {"two", "ni" , "に"},
            {"three", "san", "さん"},
            /*{"four", "", ""},
            {"five", "", ""},
            {"six", "", ""},
            {"seven", "", ""},
            {"eight", "", ""},
            {"nine", "", ""},
            {"ten", "", ""},*/
            {"dog", "inu", "いぬ"},
            {"tree", "ki", "き"},
            {"house", "ie", "いえ"},
            {"where?", "doko", "どこ"},
            {"to read", "yomu", "よむ"},
            {"color", "iro", "いろ"},
            {"year", "toshi", "とし"},
            {"language", "gengo", "げんご"},
            {"to see", "miru", "みる"},
            {"to go", "iku", "いく"},
            {"morning", "asa", "あさ"},
            {"word", "kotoba", "ことば"},
            {"tiger", "tora", "とら"},
            {"to include, add to", "kuwaeru", "くわえる"},
            {"home, house", "uchi", "うち"},
            {"interesting", "omoshiroi", "おもしろい"},
            {"difficult", "muzukashii", "むずかしい"},
            {"valley", "tani", "たに"},
            {"pond", "ike", "いけ"},
            {"sugar", "satou", "さとう"},
            {"afternoon, PM", "gogo", "ごご"},
            {"movie", "eiga", "えいが"},
            {"husband", "ooto", "おつと"},
            {"subway", "chikatetsu", "ちかてつ"},
            {"coin, money", "kouka", "こうか"},
            {"south", "minami", "みなみ"},
            {"earthquake", "jishin", "じしｎ"},
            {"town", "machi", "まち"},
            {"family", "kazoku", "かぞく"},
            {"box", "hako", "はこ"},
            {"boat, ship", "fune", "ふね"},
            {"week", "shuu", "しゅう"},
            {"to speak", "hanasu", "はなす"},
            {"rain", "ame", "あめ"},
            {"debt", "shakkin", "しゃっきｎ"},
            {"man", "otoko", "おとこ"},
            {"100", "hyaku", "ひゃく"},
            {"minute", "fun, bun", "分"},
            {"time, timeframe", "jikan", ""},
            {"map", "chizu", "ちず"},
            {"outside", "soto", "そと"}
           /* {"", "", ""},
            {"", "", ""},
            {"", "", ""},
            {"", "", ""},
            {"", "", ""},
            {"", "", ""},
            {"", "", ""},
            {"", "", ""},
            {"", "", ""},
            {"", "", ""},
            {"", "", ""},
            {"", "", ""},
            {"", "", ""},
            {"", "", ""},
            {"", "", ""},
            {"", "", ""},
            {"", "", ""},
            {"", "", ""},
            {"", "", ""}*/
    }; //list of vocab words


    int wordNum = 0; //currently displayed vocab word

    int wordNumKnown = 0; //vocanKnown array
    int wordNumAll = 0; //vocabAll array

    public void prev(View v) {
        //Show previous vocab word
        //Toast.makeText(this, "Prev Word", Toast.LENGTH_LONG).show();

        //Change text1 to "prev"
        //text1.setText("Prev");
        TextView text1 = (TextView) findViewById(R.id.text1);
        TextView text2 = (TextView) findViewById(R.id.text2);
        TextView text3 = (TextView) findViewById(R.id.text3);

        //wordNum--;
        if (wordNum > 0)
            wordNum--;
        else
            wordNum = 30; //change to array.length
        //Add If wordNum <= 0, wordNum = length - 1
        text1.setText(vocab[wordNum][0]);
        text2.setText(vocab[wordNum][1]);
        text3.setText(vocab[wordNum][2]);
    }

    public void next(View v) {
        //Show previous vocab word
        //Toast.makeText(this, "Next Word", Toast.LENGTH_LONG).show();

        //Change text2 to "next"

        //text2.setText("Next");
        TextView text1 = (TextView) findViewById(R.id.text1);
        TextView text2 = (TextView) findViewById(R.id.text2);
        TextView text3 = (TextView) findViewById(R.id.text3);

        if (wordNum <= 30) //change to array.length
            wordNum++;
        else
            wordNum = 0;
        text1.setText(vocab[wordNum][0]);
        text2.setText(vocab[wordNum][1]);
        text3.setText(vocab[wordNum][2]);
    }

}