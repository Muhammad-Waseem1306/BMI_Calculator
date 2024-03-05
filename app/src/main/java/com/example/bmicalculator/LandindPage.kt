package com.example.bmicalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.example.bmicalculator.databinding.ActivityLandindPageBinding

class LandindPage : AppCompatActivity() {
    private lateinit var binding: ActivityLandindPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_landind_page)
        /*val btnlanding: Button = findViewById(R.id.landingbtncalculate)*/

        binding.landingbtncalculate.setOnClickListener {
//            Another way to do the Intent using the Kotlin function
            /*Intent(this@LandindPage, MainActivity::class.java).also {
                startActivity(it)
                finish()
            }*/
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}