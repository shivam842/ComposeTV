package com.lgdev.composetv

import android.app.Application
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions

class App: Application() {

    override fun onCreate() {
        super.onCreate()

        val requestOptions = RequestOptions()
            .diskCacheStrategy(DiskCacheStrategy.ALL)

        Glide.with(this)
            .setDefaultRequestOptions(requestOptions)
    }
}