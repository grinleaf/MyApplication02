package com.example.myapplication02

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.myapplication02.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnTest.setOnClickListener {
            val intent = Intent(this@MainActivity, WebViewActivity::class.java)
            startActivity(Intent(intent))
        }
    }
}