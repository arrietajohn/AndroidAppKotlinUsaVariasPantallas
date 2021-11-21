package co.gov.mintic.misiontic.udea.cidlo4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import co.gov.mintic.misiontic.udea.appvariasactividadades.R

class Actividad1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_actividad1)
    }

    override fun onResume() {
        super.onResume()
        findViewById<TextView>(R.id.txtDato1).text = intent.getStringExtra("dato2")
        // FORMA ALTERNATIVA DE APLICAR CAMBIOS A UN COMPONENTE
        /*
        val txtDato1 = findViewById<TextView>(R.id.txtDato1).apply {
            text =  intent.getStringExtra("dato2")
        }
         */
    }

    fun abrirActividad2(v : View){
        var dato1 = findViewById<EditText>(R.id.campoDato1).text.toString()
        val intento = Intent(this, Actividad2::class.java)
        intento.putExtra("dato1",dato1)
        startActivity(intento)
        // FORMA ALTERNATIVA # 2
        // EXISTEN OTRAS MANERAS DE HACER LO MISMO, ¿CUALES SON?
        /*
        val intento = Intent(this, Actividad2::class.java).apply {
            putExtra("dato1", dato1)
        }
        startActivity(intento)
         */
    }
}

