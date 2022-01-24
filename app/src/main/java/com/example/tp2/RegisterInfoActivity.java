package com.example.tp2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterInfoActivity extends AppCompatActivity {
    AutoCompleteTextView ACV;
    String[] ville = {"Oujda", "Rabat", "Casa", "Marrakech"};
    EditText nom, prenom, email;
    Spinner jour, mois, annee;
    RadioButton homme, femme;
    CheckBox android_studio, jee, java;
    Button enrg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_info);
        ACV = findViewById(R.id.ville);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, ville);
        ACV.setThreshold(2);
        ACV.setAdapter(adapter);

        nom = (EditText) findViewById(R.id.nom);
        prenom = (EditText) findViewById(R.id.prenom);
        email = (EditText) findViewById(R.id.email);
        jour = (Spinner) findViewById(R.id.jour);
        mois = (Spinner) findViewById(R.id.mois);
        annee = (Spinner) findViewById(R.id.annee);
        homme = (RadioButton) findViewById(R.id.homme);
        femme = (RadioButton) findViewById(R.id.femme);
        android_studio = (CheckBox) findViewById(R.id.android);
        jee = (CheckBox) findViewById(R.id.jee);
        java = (CheckBox) findViewById(R.id.java);
        enrg = (Button) findViewById(R.id.enrg);


        enrg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent secondActivity = new Intent(RegisterInfoActivity.this, ViewInfoActivity.class);
                secondActivity.putExtra("ville", ACV.getText().toString());
                secondActivity.putExtra("nom", nom.getText().toString());
                secondActivity.putExtra("prenom", prenom.getText().toString());
                secondActivity.putExtra("email", email.getText().toString());
                if (homme.isChecked()){
                    secondActivity.putExtra("sexe", homme.getText().toString());
                }
                else if (femme.isChecked()){
                    secondActivity.putExtra("sexe", femme.getText().toString());
                }
                if (java.isChecked()){
                    secondActivity.putExtra("interet", java.getText().toString());
                }
                else if (jee.isChecked()){
                    secondActivity.putExtra("interet", jee.getText().toString());
                }
                else if (android_studio.isChecked()){
                    secondActivity.putExtra("interet", android_studio.getText().toString());
                }

                secondActivity.putExtra("dn", jour.getSelectedItem().toString()+" "+mois.getSelectedItem().toString()+
                        " "+annee.getSelectedItem().toString());

                startActivity(secondActivity);
            }
        });

    }
}
