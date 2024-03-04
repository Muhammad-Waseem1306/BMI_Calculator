package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Information_page : AppCompatActivity() {
    // dec variables
    private lateinit var overweight : Button
    private lateinit var normalweight : Button
    private lateinit var underweight : Button
    private lateinit var obese1 : Button
    private lateinit var limitation : Button
    private lateinit var define : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information_page)
        // link UI element
        overweight = findViewById(R.id.overweight)
        normalweight = findViewById(R.id.normal_weight)
        underweight = findViewById(R.id.underweight)
        obese1 = findViewById(R.id.obese)
       limitation = findViewById(R.id.btnlimitatio)
        define = findViewById(R.id.define)

        overweight.setOnClickListener {
            define.text = getString(R.string.over_weight_details)
        }
        normalweight.setOnClickListener {
            define.text = getString(R.string.normal_weight_details)
        }
        underweight.setOnClickListener {
            define.text = getString(R.string.underweight_details)
        }
        obese1.setOnClickListener {
            define.text = getString(R.string.obese_details)
        }
        limitation.setOnClickListener {
            define.text = getString(R.string.limitations)
        }
    }
}