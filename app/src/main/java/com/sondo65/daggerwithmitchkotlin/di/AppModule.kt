package com.sondo65.daggerwithmitchkotlin.di

import android.app.Application
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.request.RequestOptions
import com.sondo65.daggerwithmitchkotlin.R
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule{

    @Singleton
    @Provides
    internal fun provideRequestOptions():RequestOptions{
        return RequestOptions
            .placeholderOf(R.drawable.white_background)
            .error(R.drawable.white_background)
    }

    @Singleton
    @Provides
    internal fun provideGlideInstance(application: Application, requestOptions: RequestOptions): RequestManager{
        return Glide.with(application)
                    .setDefaultRequestOptions(requestOptions)
    }

    @Singleton
    @Provides
    internal fun provideDrawable(application: Application):Drawable{
        return ContextCompat.getDrawable(application,R.drawable.logo)!!
    }
}