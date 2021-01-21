package com.example.breathinconnect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val StartButton = findViewById(R.id.StartButton) as Button //Cherche l'id Button

        StartButton.setOnClickListener() {
            //Fonction afin de passer à la deuxiéme activité
            val intent = Intent(this, InfoUtilisateur::class.java);
            intent.putExtra("data","testdata")
            startActivity(intent)
        }
    }
}

