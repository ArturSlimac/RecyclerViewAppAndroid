package com.example.recyclerviewappandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView list = findViewById(R.id.recycler_view_projects);


        Project[] ourProjects = {
                new Project("Getting Started App", "My first one", R.drawable.getting_started),
                new Project("Vin", "My second one", R.drawable.quote),
                new Project("BMI", "My third one", R.drawable.calculator),
                new Project("Inches", "My forth one", R.drawable.getting_started),
                new Project("Hungry", "My fifth one", R.drawable.hungry_developer)
        };

        ProjectsAdapter projectsAdapter = new ProjectsAdapter(ourProjects);
        list.setAdapter(projectsAdapter);


    }
}