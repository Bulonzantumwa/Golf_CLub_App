package com.example.golf_club;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Success extends AppCompatActivity {

    // Declare a RecyclerView object reference
    RecyclerView recyclerView;

    // Declare an adapter
    RecyclerView.Adapter programAdapter;
    RecyclerView.LayoutManager layoutmanager;

    // Next, prepare your data set. Create two string arrays for program name and program description respectively.
    String[] programNameList = {"Kenya", "Egypt", "China", "Canada", "France", "South Africa"};
    String[] programDescriptionList = {"Our golf Team has been the best over the past 2 years.", "We are recruiting Golf players for our national Team.",
            "Strive to excel. Do you think you got the skills? Join one of our main golf clubs",
            "Our National Team is currently full.", "Nous sommes en plein recruitement de joueurs agés de 18 à 24 ans.",
            "Interested in participating to the world championship? Join one of our teams"};

    // Define an integer array to hold the image recourse ids
    int[] programImages = {R.drawable.ic_golf, R.drawable.ic_golf,
            R.drawable.ic_golf, R.drawable.ic_golf, R.drawable.ic_golf,
            R.drawable.ic_golf};


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.success);
        // Obtain a handle for the RecyclerView
        recyclerView = findViewById(R.id.rvProgram);
        // You may use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);
        // Use a linear layout manager
        layoutmanager = new LinearLayoutManager (this);
        recyclerView.setLayoutManager(layoutmanager);
        // Create an instance of ProgramAdapter. Pass context and all the array elements to the constructor
        programAdapter = new ProgramAdapter(this, programNameList, programDescriptionList, programImages);
        // Finally, attach the adapter with the RecyclerView
        recyclerView.setAdapter(programAdapter);
      }
    }
