package com.example.breathinconnect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class InfoMaladieUtilisateur : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_maladie_utilisateur)

        //Lien avec page suivante: AutorisationBTLoc
        val ValidateButton = findViewById(R.id.ValidateButton) as Button //Cherche l'id Button

        ValidateButton.setOnClickListener() {
            //Fonction afin de passer à la deuxiéme activité
            val intent = Intent(this, AutorisationBTLoc::class.java);
            intent.putExtra("data", "testdata")
            startActivity(intent)
        }

        //Création d'une liste d'option (Spinner)
        val spinner: Spinner = findViewById(R.id.medicament)
        ArrayAdapter.createFromResource(
            this,
            R.array.medicament,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }

        val spinner1: Spinner = findViewById(R.id.dosage)
        ArrayAdapter.createFromResource(
                this,
                R.array.dosage,
                android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner1.adapter = adapter
        }


        class SpinnerActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

            override fun onItemSelected(parent: AdapterView<*>, view: View, pos: Int, id: Long) {
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
            }
        }
    }
}