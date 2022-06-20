package com.mauriciogs.activitiesusage

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mauriciogs.activitiesusage.databinding.Activity3Binding
import com.mauriciogs.activitiesusage.databinding.Activity4Binding

class CuartaActivity : AppCompatActivity() {

    private lateinit var binding: Activity4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity4Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}