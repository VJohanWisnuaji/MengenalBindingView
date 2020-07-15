package com.studytrial.contohpenerapanbindingview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.studytrial.contohpenerapanbindingview.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var tombol: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Setting view binding
        var binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Kotlin Synthetic
        btn_kotlin_synthetic.setOnClickListener {
            Log.d("BINAR", "Tombol dengan Kotlin Synthetic")
        }

        // Find View By Id
        tombol = findViewById(R.id.btn_find_by_id)
        tombol?.setOnClickListener {
            Log.d("BINAR", "Tombol dengan Find View By Id")
        }

        // View Binding
        binding.btnViewBinding.setOnClickListener {
            Log.d("BINAR", "Tombol dengan View Binding")
        }

        // Data Binding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.handler = EventHandler()
    }
}