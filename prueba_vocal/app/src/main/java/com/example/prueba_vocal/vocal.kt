package com.example.prueba_vocal

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.prueba_vocal.databinding.ActivityVocalBinding

class vocal : AppCompatActivity() {
    companion object{
        const val NOMBRE_USUARIO_KEY ="nombre_usuario"
    }
    override fun onCreate(savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
        var binding:ActivityVocalBinding= ActivityVocalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var bundle:Bundle=intent.extras!!
        var nombre_usuario=bundle.getString(NOMBRE_USUARIO_KEY)?:""
        binding.name.text="Hi "+nombre_usuario

        //Mover entre entre pantallas


     
    }
    //Funciones privadas para cambiar pantallas
       private fun openvolver() {
        var intent=Intent(this,Menu::class.java)
        startActivity(intent)
    }
    private fun siguiente_e() {
        var intent=Intent(this,vocal2::class.java)
        startActivity(intent)
    }
    //funcion privada para pestaña de salir
    private fun showExitConfirmationDialog(){
        // Crea un AlertDialog.Builder y configura el mensaje y los botones
        AlertDialog.Builder(this).apply {
            setTitle("Confirmación de salida")
            setMessage("¿Estás seguro de que quieres salir de la aplicación?")
            setPositiveButton("Aceptar") { dialog, which ->
                // Acción al hacer clic en "Aceptar"
                finishAffinity() // Cierra la aplicación
            }
            setNegativeButton("Cancelar") { dialog, which ->
                // Acción al hacer clic en "Cancelar"
                dialog.dismiss() // Cierra el diálogo
            }
            create()
            show()
        }
    }
}