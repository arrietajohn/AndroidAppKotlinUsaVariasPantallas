package co.gov.mintic.misiontic.udea.cidlo4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import co.gov.mintic.misiontic.udea.appvariasactividadades.R

class Actividad2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_actividad2)
    }

    override fun onResume() {
        super.onResume()
        findViewById<TextView>(R.id.txtDato2).text = intent.getStringExtra("dato1")
    }
    fun abrirActividad1(v : View){

        var dato2 = findViewById<EditText>(R.id.campoDato2).text.toString()
        val intento = Intent(this, Actividad1::class.java)
        intento.putExtra("dato2",dato2)
        startActivity(intento)


    }


}

