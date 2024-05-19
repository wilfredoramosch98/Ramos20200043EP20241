package com.example.ramos20200043ep20241

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ActivityPrizes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_prizes)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val etTotalAmount: EditText = findViewById(R.id.etTotalAmount)
        val etPrimerPlace: EditText = findViewById(R.id.etPrimerPlace)
        val etSegundoPlace: EditText = findViewById(R.id.etSegundoPlace)
        val etTercerPlace: EditText = findViewById(R.id.etTercerPlace)
        val etCuartoPlace: EditText = findViewById(R.id.etCuartoPlace)
        val btCalcular: Button = findViewById(R.id.btCalcular)

        val btGoMenuPriz : Button = findViewById(R.id.btGoMenuPriz)




        btCalcular.setOnClickListener{



        }

        btGoMenuPriz.setOnClickListener{
            val intent = Intent(this,MenuActivity::class.java)
            startActivity(intent)
        }

    }
}