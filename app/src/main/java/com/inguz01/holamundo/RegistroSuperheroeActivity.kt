package com.inguz01.holamundo

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class RegistroSuperheroeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_superheroe)

        val registrarButton: Button = findViewById(R.id.registrar_button)
        val nombreEditText: EditText = findViewById(R.id.nombre_edit_text)
        val infoTextView: TextView =  findViewById(R.id.info_text_view)
        val estaturaEditText: TextInputEditText = findViewById(R.id.estaturaEditText)
        val masculinoradioButton: RadioButton = findViewById(R.id.masculino_radio_Button)
        val fuerzaCheckBox: CheckBox = findViewById(R.id.Super_Fuerza_Check_Box)
        val velocidadCheckBox: CheckBox = findViewById(R.id.velocidad_check_box)
        val telepatiaCheckBox:CheckBox = findViewById(R.id.Telepatia_check_box)


        registrarButton.setOnClickListener {
           val nombre : String = nombreEditText.text.toString()
            val estatura : Float = estaturaEditText.text.toString().toFloat()
            val genero : String
            var poderes = ""

            if (masculinoradioButton.isChecked)
                genero = getString(R.string.masculino)
            else
                genero = getString(R.string.femenino)


            if (fuerzaCheckBox.isChecked) poderes = getString(R.string.superfuerza)
            if (velocidadCheckBox.isChecked) poderes = poderes + " " + getString(R.string.velocidad)
            if (telepatiaCheckBox.isChecked) poderes = poderes + " " + getString(R.string.telepatia)

            infoTextView.text = getString(R.string.info, nombre, estatura, genero, poderes)

        }

    }
}