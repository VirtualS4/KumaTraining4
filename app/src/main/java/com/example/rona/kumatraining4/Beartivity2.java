package com.example.rona.kumatraining4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList; import java.util.List;


public class Beartivity2 extends AppCompatActivity {
    List<Bear> bearList;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beartivity2);
        bearList = new ArrayList<>();
        listView = (ListView) findViewById(R.id.list);
        bearList.add(new Bear(R.drawable.spiderman, "Spiderman", "Avengers"));
        bearList.add(new Bear(R.drawable.joker, "Joker", "Injustice Gang"));
        bearList.add(new Bear(R.drawable.ironman, "Iron Man", "Avengers"));
        bearList.add(new Bear(R.drawable.doctorstrange, "Doctor Strange", "Avengers"));
        bearList.add(new Bear(R.drawable.captainamerica, "Captain America", "Avengers"));
        bearList.add(new Bear(R.drawable.batman, "Batman", "Justice League"));
        BearHands adapter = new BearHands(this, R.layout.bearlayout, bearList);
        listView.setAdapter(adapter);


    }
}
