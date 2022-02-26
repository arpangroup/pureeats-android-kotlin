package com.arpangroup.core.routing

import android.content.Context

interface AuthRouter {
    fun showAuthModule(context: Context, text: String)
}

interface Feature1Router {
    fun showFeature1(context: Context, value: Double)
}

interface Feature2Router {
    fun showFeature2(context: Context)
}