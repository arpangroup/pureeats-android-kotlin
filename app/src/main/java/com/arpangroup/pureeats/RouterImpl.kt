package com.arpangroup.pureeats

import android.content.Context
import android.widget.Toast
import com.arpangroup.auth.AuthActivity
import com.arpangroup.core.routing.AuthRouter
import com.arpangroup.core.routing.Feature1Router
import org.koin.dsl.bind
import org.koin.dsl.module

class RouterImpl: AuthRouter, Feature1Router{
    override fun showAuthModule(context: Context, text: String) {
        //Toast.makeText(context, text, Toast.LENGTH_LONG).show();
        AuthActivity.start(context);
    }

    override fun showFeature1(context: Context, value: Double) {
        TODO("Not yet implemented")
    }

}
