package com.example.lovecalculator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import com.example.lovecalculator.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val sharedPreferences= PreferenceManager.getDefaultSharedPreferences(baseContext)
        val accessToken=sharedPreferences.getString("ACCESS_TOKEN_KEY"," ")

        if (accessToken.isNullOrEmpty()){
            val intent= Intent(baseContext, MainActivity::class.java)
            startActivity(intent)
        }

    }
}