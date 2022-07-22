package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    TextView Pediatrician,Dermatologist,Psychiatrist,Cardiologist,Orthopedic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pediatrician = findViewById(R.id.pediatrician);
        Dermatologist = findViewById(R.id.dermatologist);
        Psychiatrist = findViewById(R.id.psychiatrist);
        Cardiologist = findViewById(R.id.cardiologist);
        Orthopedic = findViewById(R.id.orthopedic);

        Pediatrician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, Pediatrician.class);
                startActivity(intent);
            }
        });
        Dermatologist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, Dermatologist.class);
                startActivity(intent);
            }
        });
        Psychiatrist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, Psychiatrist.class);
                startActivity(intent);
            }
        });
        Cardiologist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, Cardiologist.class);
                startActivity(intent);
            }
        });
        Orthopedic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, Orthopedic.class);
                startActivity(intent);
            }
        });
    }

    public void logout(View view) {
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(),Login.class));
        finish();
    }
}