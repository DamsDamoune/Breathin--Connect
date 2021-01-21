package com.example.breathinconnect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AutorisationBTLoc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_autorisation_b_t_loc)

        val ButtonToTheMain = findViewById(R.id.ButtonMain) as Button //Cherche l'id Button

        ButtonToTheMain.setOnClickListener() {
            //Fonction afin de passer à la deuxiéme activité
            val intent = Intent(this, MainPage::class.java);
            intent.putExtra("data", "testdata")
            startActivity(intent)
        }
    }
}