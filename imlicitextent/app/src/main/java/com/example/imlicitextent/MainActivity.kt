package com.example.imlicitextent

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Camera
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageButton
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    @SuppressLint("CutPasteId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val CodechefButton=findViewById<CardView>(R.id.cardweb)
        val LeetcodeButton=findViewById<CardView>(R.id.cardweb)
        val cameraButton=findViewById<CardView>(R.id.cardcamera)
        val logoc=findViewById<ImageButton>(R.id.logo)

        CodechefButton.setOnClickListener{
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.codechef.com/users/shubhkumar19")
            startActivity(intent)
        }
        LeetcodeButton.setOnClickListener{
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://leetcode.com/problemset/all/")
            startActivity(intent)
        }


        cameraButton.setOnClickListener{
            val intent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }
        logoc.setOnClickListener{
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.codechef.com/users/shubhkumar19")
            startActivity(intent)
        }

    }
}