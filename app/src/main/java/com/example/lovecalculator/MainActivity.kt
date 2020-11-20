package com.example.lovecalculator

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val btnCalculator = null
        btnCalculator.setOnClickListener {
            fun onClick(
                v: View?,
                FirstName: Any,
                LastName: Any,
                textViewResult: Any
            ) {
                val str1: String = FirstName.getText().toString().toLowerCase()
                val str2: String = LastName.getText().toString().toLowerCase()

            }
        }


    }
    }

private fun Nothing?.setOnClickListener(function: () -> Unit) {
    TODO("Not yet implemented")
}

private fun Any.setText(calculation: String?) {

}

private fun Any.getText() {

}



