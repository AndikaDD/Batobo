package com.example.batobo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.batobo.databinding.ActivityMainBinding
import com.example.batobo.ui.login.LoginPetaniActivity

class MainActivity : AppCompatActivity() , View.OnClickListener{
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()
        binding.btnSolo.setOnClickListener ( this )
    }
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnSolo -> {
                val moveIntent = Intent(this@MainActivity, LoginPetaniActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}