package com.example.tsdmh_prac2_7s5_kevincastaneda

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.principal)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, InicioActivity::class.java)
            startActivity(intent)
            finish()
        }, 5000)
    }
}