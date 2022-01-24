package com.example.tp2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ViewInfoActivity extends Activity {
    TextView ville, nom, prenom, email, dn, sexe, interet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_info);
        ville = (TextView) findViewById(R.id.ville1);
        ville.setText(getIntent().getExtras().getString("ville"));
        nom = (TextView) findViewById(R.id.nom1);
        nom.setText(getIntent().getExtras().getString("nom"));
        prenom = (TextView) findViewById(R.id.prenom1);
        prenom.setText(getIntent().getExtras().getString("prenom"));
        email = (TextView) findViewById(R.id.email1);
        email.setText(getIntent().getExtras().getString("email"));
        dn = (TextView) findViewById(R.id.dn1);
        dn.setText(getIntent().getExtras().getString("dn"));
        sexe = (TextView) findViewById(R.id.sexe1);
        sexe.setText(getIntent().getExtras().getString("sexe"));
        interet = (TextView) findViewById(R.id.interet1);
        interet.setText(getIntent().getExtras().getString("interet"));
    }
}
