package com.maimoona.contactus

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

lateinit var emailImageButton: ImageButton
lateinit var locationImageButton: ImageButton
lateinit var callImageButton: ImageButton
lateinit var facebookImageButton: ImageButton
lateinit var githubImageButton: ImageButton
lateinit var whatsAppImageButton: ImageButton


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        emailImageButton=findViewById(R.id.email_img_btn);
        locationImageButton=findViewById(R.id.location_img_btn);
        callImageButton=findViewById(R.id.call_img_btn);
        githubImageButton=findViewById(R.id.gitHub_img_btn);
        facebookImageButton=findViewById(R.id.facebook_img_btn);
        whatsAppImageButton=findViewById(R.id.whatsApp_img_btn);


        //***********************Email***************************//

        emailImageButton.setOnClickListener {
            val emailIntent = Intent().apply {
                Intent.ACTION_SEND
                type = "text/plain"
                putExtra(Intent.EXTRA_EMAIL, arrayOf("memo38605@gmail.com"))
                putExtra(Intent.EXTRA_TEXT,"Challeng " )
                putExtra(Intent.EXTRA_SUBJECT, "Maimoona")
            }

            if(emailIntent.resolveActivity(packageManager) != null ){
                startActivity(emailIntent)
            }
        }

        //***********************Location***************************//


        locationImageButton.setOnClickListener {
            val mapIntent = Intent().apply {
                action =Intent.ACTION_VIEW
                data = Uri.parse("geo:33.2,44.8")
            }
            if (mapIntent.resolveActivity(packageManager) != null) {
                startActivity(mapIntent)
            }
        }


        //***********************GitHub***************************//

        githubImageButton.setOnClickListener {
            val githubIntent = Intent().apply {
                action =Intent.ACTION_VIEW
                data = Uri.parse("https://github.com/MaimoonaAlrozmi")
            }
            if (githubIntent.resolveActivity(packageManager) != null) {
                startActivity(githubIntent)
            }
        }

        //***********************FaceBook***************************//

        facebookImageButton.setOnClickListener {
            val instaIntent = Intent().apply {
                action =Intent.ACTION_VIEW
                data = Uri.parse("https://www.instagram.com/somiahaldouis/")
            }
            if (instaIntent.resolveActivity(packageManager) != null) {
                startActivity(instaIntent)
            }
        }

        //***********************Call me***************************//

        callImageButton.setOnClickListener {
            val pickContactIntent = Intent( ).apply {
                action = Intent.ACTION_PICK
                data = Uri.parse("tel:777777777")
            }
            if (pickContactIntent.resolveActivity(packageManager) != null) {
                startActivity(pickContactIntent)
            }
        }

    }
}