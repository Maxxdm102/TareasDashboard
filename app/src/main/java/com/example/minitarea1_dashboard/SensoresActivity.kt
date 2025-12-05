package com.example.minitarea1_dashboard

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class SensoresActivity : BaseMenuActivity() {

    private lateinit var tvHumedad: TextView
    private lateinit var tvTemp: TextView
    private lateinit var btnActualizar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sensores)
        title = "Sensores"

        tvHumedad = findViewById(R.id.tvHumedad)
        tvTemp = findViewById(R.id.tvTemp)
        btnActualizar = findViewById(R.id.btnActualizar)

        fun refrescar() {
            val hum = Random.nextInt(40, 91)
            val tmp = Random.nextInt(10, 36)
            tvHumedad.text = "Humedad: $hum %"
            tvTemp.text = "Temperatura: $tmp ºC"
        }

        refrescar()
        btnActualizar.setOnClickListener { refrescar() }
    }
}
