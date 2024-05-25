package com.example.prueba_vocal

import android.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.prueba_vocal.databinding.ActivityCuentosBinding

class cuentos : AppCompatActivity() {
    companion object {
        //Asegurarse que si a variable no esta bien escrita de igual forma la identificara
        const val NOMBRE_USUARIO_KEY = "nombre_usuario"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding: ActivityCuentosBinding = ActivityCuentosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var bundle:Bundle= intent.extras!!
        var nombre_usuario=bundle.getString(NOMBRE_USUARIO_KEY) ?: ""
        binding.name.text="Hi "+ nombre_usuario

        //agg los binding para moverse

        //salir
        binding.btnSalir.setOnClickListener {
            showExitConfirmationDialog()
        }
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