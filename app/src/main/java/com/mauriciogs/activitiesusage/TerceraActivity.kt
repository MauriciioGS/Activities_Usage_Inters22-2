package com.mauriciogs.activitiesusage

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mauriciogs.activitiesusage.databinding.Activity3Binding

class TerceraActivity : AppCompatActivity() {

    private lateinit var binding: Activity3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity3Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        intent.extras?.let { bundle ->
            binding.lastActivity.text = bundle.getString("lastActivity")
        }

        binding.btn3.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
        }
    }
}