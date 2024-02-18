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

        convert()
    }

    private fun convert() {
        binding.buttonConverter.setOnClickListener {
            val euros = binding.editValue.text.toString().trim()

            if(euros.isNotEmpty()) {
                val dollar = euros.toDouble() * 0.8
                binding.textResult.text = "$dollar $"
            } else {
                Toast.makeText(applicationContext, "Invalid Number", Toast.LENGTH_SHORT)
            }
        }
    }
}