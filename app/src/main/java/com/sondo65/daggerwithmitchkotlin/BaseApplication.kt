package com.sondo65.daggerwithmitchkotlin

import com.sondo65.daggerwithmitchkolin.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class BaseApplication:DaggerApplication(){

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
       return DaggerAppComponent
           .builder()
           .inject(this)
           .build()
    }

}