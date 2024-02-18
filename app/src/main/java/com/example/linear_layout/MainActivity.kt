package com.example.linear_layout

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.linear_layout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonEuro.setOnClickListener {
            convert(0.8)
        }

        binding.buttonReal.setOnClickListener {
            convert(5.0)
        }

        binding.buttonPeso.setOnClickListener {
            convert(10.2)
        }
    }

    private fun convert(tax: Double) {
            val value = binding.editValue.text.toString().trim()

            if(value.isNotEmpty()) {
                val result = value.toDouble() * tax
                val formatResult = String.format("%.2f", result)
                binding.textResult.text = "$formatResult $"
            } else {
                Toast.makeText(applicationContext, "Invalid Number", Toast.LENGTH_SHORT)
            }
    }
}