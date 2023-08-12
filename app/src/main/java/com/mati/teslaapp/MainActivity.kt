package com.mati.teslaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AccelerateInterpolator
import android.view.animation.Animation
import android.view.animation.DecelerateInterpolator
import android.view.animation.TranslateAnimation
import com.mati.teslaapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        translateAnimation()

        binding.btnGotoActivity.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

    }
    private fun translateAnimation() {

        val anim = TranslateAnimation(
            500f, 0f,
            0f, 0f,
        )
        anim.fillAfter = true
        anim.setInterpolator(DecelerateInterpolator())
        anim.duration = 5000

        binding.imgTesla1.startAnimation(anim)

    }


}