package com.example.dogbreeds

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatDelegate

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.night -> {
                if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES)
                else {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                }
            }
            R.id.day-> {
                if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES)
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
            R.id.aboutProgram -> {
                val intent: Intent = Intent(this@HomeActivity,AboutProgram::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    fun mops(view: View) {
        val intent=Intent(this@HomeActivity,MainActivity2::class.java)
        startActivity(intent)
    }

    fun siba(view: View) {
        val intent=Intent(this@HomeActivity,MainActivity3::class.java)
        startActivity(intent)
    }

    fun maltipy(view: View) {
        val intent=Intent(this@HomeActivity,MainActivity4::class.java)
        startActivity(intent)
    }

    fun bulli(view: View) {
        val intent=Intent(this@HomeActivity,MainActivity5::class.java)
        startActivity(intent)
    }

    fun rotveler(view: View) {
        val intent=Intent(this@HomeActivity,MainActivity6::class.java)
        startActivity(intent)
    }
    fun corgi(view: View) {
        val intent= Intent(this@HomeActivity,MainActivity8::class.java)
        startActivity(intent)
    }

    fun doberman(view: View) {
        val intent= Intent(this@HomeActivity,MainActivity9::class.java)
        startActivity(intent)
    }
}