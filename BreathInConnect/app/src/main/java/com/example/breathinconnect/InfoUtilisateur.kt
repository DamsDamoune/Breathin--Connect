package com.example.breathinconnect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class InfoUtilisateur : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_utilisateur)

        val InfoSuivant = findViewById(R.id.InfoSuivant) as Button //Cherche l'id Button

        InfoSuivant.setOnClickListener() {
            //Fonction afin de passer à la deuxiéme activité
            val intent = Intent(this, InfoMaladieUtilisateur::class.java);
            intent.putExtra("data", "testdata")
            startActivity(intent)
        }
    }
}