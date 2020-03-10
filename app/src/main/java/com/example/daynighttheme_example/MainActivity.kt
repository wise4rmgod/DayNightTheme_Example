package com.example.daynighttheme_example

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        test.setOnClickListener { AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES) }

        test1.setOnClickListener {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            val snack = Snackbar.make(it, "This is a simple Snackbar", Snackbar.LENGTH_LONG)
            snack.show()
        }

        test2.setOnClickListener {
            val ty = startActivity(Intent(this, SettingsActivity::class.java))
        }
    }
}
