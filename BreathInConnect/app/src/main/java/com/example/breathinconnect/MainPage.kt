package com.example.breathinconnect

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_page)

        val MapButton = findViewById(R.id.MapButton) as ImageButton //Cherche l'id Button

        MapButton.setOnClickListener() {
            //Fonction afin de passer à la deuxiéme activité
            val intent = Intent(this, MapsActivity::class.java);
            intent.putExtra("data", "testdata")
            startActivity(intent)
        }

    }
}