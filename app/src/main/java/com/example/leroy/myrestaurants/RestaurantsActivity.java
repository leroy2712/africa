package com.example.leroy.myrestaurants;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {
    private TextView locationText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        //Display location
        locationText = (TextView) findViewById(R.id.locationTextView);

        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        locationText.setText(location);
        //Display location

        //Display ArrayList in ListView
        ListView listView = (ListView) findViewById(R.id.listView);

        final ArrayList <String> restaurants = new ArrayList<String>();
        restaurants.add("About Thyme");
        restaurants.add("Adega Lavington");
        restaurants.add("Anghiti");
        restaurants.add("Arbor");
        restaurants.add("Argenti");
        restaurants.add("Asmara");
        restaurants.add("Atrium Brasserie");
        restaurants.add("Bamboo");
        restaurants.add("Big Elephant");
        restaurants.add("Black Gold Cafe");
        restaurants.add("Bon Homie");
        restaurants.add("Cafe Haze");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, restaurants);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Log.i("Restaurant clicked:", restaurants.get(i));
            }
        });


        //Display ArrayList in ListView
    }
}
