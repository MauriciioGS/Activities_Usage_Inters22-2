package com.mauriciogs.activitiesusage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mauriciogs.activitiesusage.databinding.ActivityMainBinding
import com.mauriciogs.activitiesusage.fragments.FragmentA

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btn1.setOnClickListener {
            startActivity(Intent(this,SegundaActivity::class.java))
        }

        binding.btnFrag.setOnClickListener {
            startActivity(Intent(this,CuartaActivity::class.java))
        }
    }
}