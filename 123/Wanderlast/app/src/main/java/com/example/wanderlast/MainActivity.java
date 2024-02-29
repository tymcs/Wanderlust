package com.example.wanderlast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.wanderlast.adapter.RecentsAdapter;
import com.example.wanderlast.adapter.TopPlacesAdapter;
import com.example.wanderlast.model.RecentsData;
import com.example.wanderlast.model.TopPlacesData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recentRecycler, topPlacesRecycler;
    RecentsAdapter recentsAdapter;
    TopPlacesAdapter topPlacesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<RecentsData> recentsDataList = new ArrayList<>();
        recentsDataList.add(new RecentsData("Rangamati","IBangladesh","From $200",R.drawable.rangamati));
        recentsDataList.add(new RecentsData("Cox's Bazar","Bangladesh","From $300",R.drawable.coxsbazar));
        recentsDataList.add(new RecentsData("Sylhet","Bangladesh","From $200",R.drawable.teagarden));
        recentsDataList.add(new RecentsData("Sundarban","Bangladesh","From $300",R.drawable.sundarbanss));
        recentsDataList.add(new RecentsData("Lalabagh","Bangladesh","From $200",R.drawable.lalbag));
        recentsDataList.add(new RecentsData("Ratargul","Ratargul","From $300",R.drawable.ratargul));
        recentsDataList.add(new RecentsData("Jaflong","Bangladesh","$100 - $300", R.drawable.jaflong));
        recentsDataList.add(new RecentsData("Sajek","Bangladesh","from $300", R.drawable.sajek));
        recentsDataList.add(new RecentsData("Savar","Bangladesh","from $100", R.drawable.savar));
        recentsDataList.add(new RecentsData("Pabna","Bangladesh","$From $200", R.drawable.pabna));

        recentsDataList.add(new RecentsData("Mymensigh","Bangladesh","From $100", R.drawable.mymesngingh));


        setRecentRecycler(recentsDataList);

        List<TopPlacesData> topPlacesDataList = new ArrayList<>();
        topPlacesDataList.add(new TopPlacesData("Sunamganj","Bangladesh","$200 - $500",R.drawable.sungamganj));
        topPlacesDataList.add(new TopPlacesData("Jaflong","Bangladesh","$200 - $500",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Dhaka","Bangladesh","$200 - $500",R.drawable.dhaka));
        topPlacesDataList.add(new TopPlacesData("Bhola","Bangladesh","$200 - $500",R.drawable.bola));
        topPlacesDataList.add(new TopPlacesData("Drugapur","Bangladesh","$200 - $500",R.drawable.drugapur));
        topPlacesDataList.add(new TopPlacesData("Sylhet","Bangladesh","$100 - $300", R.drawable.jaflong));
        topPlacesDataList.add(new TopPlacesData("Modhupur","Bangladesh","$100 - $200", R.drawable.modhupur));
        topPlacesDataList.add(new TopPlacesData("Khagrachari","Bangladesh","$200 - $300", R.drawable.khagrachari));
        topPlacesDataList.add(new TopPlacesData("Sundarban","Bangladesh","$100 - $400", R.drawable.deer));
        topPlacesDataList.add(new TopPlacesData("Netrokona","Bangladesh","$100 - $150", R.drawable.netrokona));
        topPlacesDataList.add(new TopPlacesData("Tanguar Haour","Bangladesh","$100 - $400", R.drawable.tanguar));



        setTopPlacesRecycler(topPlacesDataList);
    }

    private  void setRecentRecycler(List<RecentsData> recentsDataList){

        recentRecycler = findViewById(R.id.recent_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recentRecycler.setLayoutManager(layoutManager);
        recentsAdapter = new RecentsAdapter(this, recentsDataList);
        recentRecycler.setAdapter(recentsAdapter);

    }

    private  void setTopPlacesRecycler(List<TopPlacesData> topPlacesDataList){

        topPlacesRecycler = findViewById(R.id.top_places_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        topPlacesRecycler.setLayoutManager(layoutManager);
        topPlacesAdapter = new TopPlacesAdapter(this, topPlacesDataList);
        topPlacesRecycler.setAdapter(topPlacesAdapter);


    }
}
