package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.bmicalculator.databinding.ActivityInformationPageBinding

class InformationPage : AppCompatActivity() {

    private lateinit var binding: ActivityInformationPageBinding

    // dec variables
    private lateinit var overweight: Button
    private lateinit var normalweight: Button
    private lateinit var underweight: Button
    private lateinit var obese1: Button
    private lateinit var limitation: Button
    private lateinit var define: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_information_page)
        // link UI element
//        By using the binding we don't have use the extra variable
        /*overweight = findViewById(R.id.overweight)
        normalweight = findViewById(R.id.normal_weight)
        underweight = findViewById(R.id.underweight)
        obese1 = findViewById(R.id.obese)
        limitation = findViewById(R.id.btnlimitatio)
        define = findViewById(R.id.define)*/

        binding.overweight.setOnClickListener {
            binding.define.text = getString(R.string.over_weight_details)
        }
        binding.normalWeight.setOnClickListener {
            binding.define.text = getString(R.string.normal_weight_details)
        }
        binding.underweight.setOnClickListener {
            binding.define.text = getString(R.string.underweight_details)
        }
        binding.obese.setOnClickListener {
            binding.define.text = getString(R.string.obese_details)
        }
        binding.btnlimitatio.setOnClickListener {
            binding.define.text = getString(R.string.limitations)
        }
    }
}