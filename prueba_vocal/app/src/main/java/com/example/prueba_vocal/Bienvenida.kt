package com.example.prueba_vocal

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.prueba_vocal.databinding.ActivityBienvenidaBinding

class Bienvenida : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenida)

        var usuario:EditText=findViewById<EditText>(R.id.nombre_usuario)
        var btnComenzar: Button = findViewById<Button>(R.id.btn_comenzar)

        btnComenzar.setOnClickListener {
            if (usuario.text.isEmpty()){
                Toast.makeText(this,"Debes de ingresar tu nombre", Toast.LENGTH_LONG).show()
            }
            else{
            openmenu(nombreUsuario = String())
        }
    }
}
    private fun openmenu(nombreUsuario:String){
        var intent = Intent(this,Menu::class.java)
        intent.putExtra("nombre_usuario",nombreUsuario)
        startActivity(intent)
    }
}