package com.arpangroup.auth

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.koin.android.ext.android.inject

class AuthActivity : AppCompatActivity() {

   companion object {
       private val EXTRA_FOO = "foo"

       fun start(caller: Context) {
           val intent = Intent(caller, AuthActivity::class.java)
           intent.putExtra(EXTRA_FOO, "")
           caller.startActivity(intent)
       }
   }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
    }
}