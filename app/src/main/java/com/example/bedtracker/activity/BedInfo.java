package com.example.bedtracker.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.bedtracker.R;
import com.google.android.material.textfield.TextInputEditText;

public class BedInfo extends AppCompatActivity {

    TextInputEditText mTotalBeds, mAvailableBeds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bed_info);

        mTotalBeds = findViewById(R.id.et_number);
        mAvailableBeds = findViewById(R.id.et_model);




    }
}