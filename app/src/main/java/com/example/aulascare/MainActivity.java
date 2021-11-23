package com.example.aulascare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<VaccineCard> card = new ArrayList<>();
    RecyclerView recyclerView;
    RecyclerView.Adapter cardAdapter;
    RecyclerView.LayoutManager cardLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createCard();
        buildRecyclerView();

    }

    public void createCard(){
        card =new ArrayList<>();
        card.add(new VaccineCard("Covishield","Serum Institute of India", R.drawable.seruminstitute));
        card.add(new VaccineCard("Covaxin","Bharat Biotech",R.drawable.covaxin));
        card.add(new VaccineCard("Sputnik V","Gamaleya",R.drawable.sputnik));
        card.add(new VaccineCard("mRNA-1273","Moderna",R.drawable.moderna));
        card.add(new VaccineCard("ZyCoV-D","Zydus Cadila",R.drawable.zycovid));
        card.add(new VaccineCard("Ad26.COV2.S","Jhonson & Jonson's Janssen",R.drawable.janssen));
        card.add(new VaccineCard("AZD1222","Oxford/AstraZeneca",R.drawable.astrazeneca));

    }

    public void buildRecyclerView(){
        recyclerView = findViewById(R.id.cardRecyclerView);
        recyclerView.setHasFixedSize(true);

        cardLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(cardLayoutManager);

        cardAdapter = new CardAdapter(card);

        recyclerView.setAdapter(cardAdapter);


    }
}