package com.example.minitarea1_dashboard

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class RiegoActivity : BaseMenuActivity() {

    private lateinit var btnOn: Button
    private lateinit var btnOff: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_riego)
        title = "Riego"

        // Referencias a los botones
        btnOn = findViewById(R.id.btnOn)
        btnOff = findViewById(R.id.btnOff)

        // Botón "Encender riego"
        btnOn.setOnClickListener {
            Toast.makeText(this, "Riego activado", Toast.LENGTH_SHORT).show()
        }

        // Botón "Apagar riego"
        btnOff.setOnClickListener {
            val rootView: View = findViewById(android.R.id.content)
            Snackbar.make(rootView, "Riego detenido", Snackbar.LENGTH_LONG)
                .setAction("Deshacer") {
                    Toast.makeText(this, "Riego activado", Toast.LENGTH_SHORT).show()
                }
                .show()
        }
    }
}
