package com.example.oauth2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import kotlinx.android.synthetic.main.activity_main_screen.*

class MainScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)
        val account = intent.getSerializableExtra("loggedInAccount") as GoogleSignInAccount
        user_photo_image.setImageURI(account.photoUrl)
        val sb: StringBuilder = java.lang.StringBuilder()
        sb.append(account.displayName)
        sb.append(" ")
        sb.append(account.familyName)
        userName_TW.text = sb.toString()
        dob_text.text = "${account.idToken}\n${account.serverAuthCode}"

    }
}
