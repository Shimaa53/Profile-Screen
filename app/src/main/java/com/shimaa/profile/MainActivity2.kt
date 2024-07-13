package com.shimaa.profile

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.net.toUri
import com.shimaa.profile.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding=ActivityMain2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
       binding.statusBarView.setBackgroundColor(resources.getColor(R.color.blue))
        window.statusBarColor=ContextCompat.getColor(this,R.color.blue)

        binding.backIcon.setOnClickListener{
            onBackPressed()
        }
        binding.myLinkedin.setOnClickListener{
            val link="https://www.linkedin.com/in/shimaa-ragab-986b08243".toUri()
            val y= Intent(Intent.ACTION_VIEW,link)
            startActivity(y)
        }
        binding.myGithub.setOnClickListener{
            val link="https://github.com/Shimaa53".toUri()
            val y= Intent(Intent.ACTION_VIEW,link)
            startActivity(y)
        }
        binding.myFacebook.setOnClickListener{
            val link="https://www.facebook.com/profile.php?id=100009706004010&mibextid=LQQJ4d".toUri()
            val y= Intent(Intent.ACTION_VIEW,link)
            startActivity(y)
        }

    }

}