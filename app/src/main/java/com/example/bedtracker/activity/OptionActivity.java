package com.example.bedtracker.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.bedtracker.R;
import com.google.firebase.auth.FirebaseAuth;

public class OptionActivity extends AppCompatActivity {
    private TextView settings;
    private  TextView logout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);
        settings = findViewById(R.id.settings);
        logout = findViewById(R.id.logout);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Options");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(OptionActivity.this,Welcome.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK));
                finish();
            }
        });
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(OptionActivity.this, "Data is not updated yet", Toast.LENGTH_SHORT).show();
            }
        });

    }
}