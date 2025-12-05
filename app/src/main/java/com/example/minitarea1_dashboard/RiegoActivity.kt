package com.example.minitarea1_dashboard

import android.os.Bundle

class RiegoActivity : BaseMenuActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_riego)
        title = "Riego"
    }
}
