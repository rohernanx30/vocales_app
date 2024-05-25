package com.example.prueba_vocal

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.prueba_vocal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnInicio.setOnClickListener {
            openBienvenida()
        }
    }
    private fun openBienvenida(){
        var intent = Intent(this,Bienvenida::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
    }
}