package com.example.minitarea1_dashboard

import android.os.Bundle

class DashboardActivity : BaseMenuActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        title = "SmartGarden — Dashboard"
    }
}
