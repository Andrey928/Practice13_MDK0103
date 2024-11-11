package com.example.practic13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btn1(view: View) {
        val editText1 = findViewById<EditText>(R.id.editTextText)
        val editText2 = findViewById<EditText>(R.id.editTextText2)
        val TextViewResult = findViewById<TextView>(R.id.textView4)

        if (editText1.text.toString() == "") {
            Toast.makeText(this, "Первый катет не введен", Toast.LENGTH_SHORT).show()
        } else if (editText2.text.toString() == "") {
            Toast.makeText(this, "Второй катет не введен", Toast.LENGTH_SHORT).show()
        }
        val katetA = editText1.text.toString().toDoubleOrNull()
        val katetB = editText2.text.toString().toDoubleOrNull()
        if (katetA != null && katetB != null && katetA > 0 && katetB > 0) {
            val hypotenuse: Double = sqrt(katetA * katetA + katetB * katetB)
            val perimeter = katetA + katetB + hypotenuse
            val area = 0.5 * katetA * katetB

            TextViewResult.text = "Гипотенуза:$hypotenuse\nПериметр: $perimeter\nПлощадь: $area"
        } else {
            TextViewResult.text = "Ошибка: введите положительные числа."
        }
    }



    }
