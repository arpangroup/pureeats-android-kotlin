package com.arpangroup.pureeats

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arpangroup.core.routing.AuthRouter
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val authRouter : AuthRouter by inject()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        authRouter.showAuthModule(this@MainActivity, "hello")
    }
}