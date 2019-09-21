package com.sondo65.daggerwithmitchkolin.di

import android.app.Application
import com.sondo65.daggerwithmitchkotlin.di.ActivityBuilderModule
import com.sondo65.daggerwithmitchkotlin.di.AppModule
import com.sondo65.daggerwithmitchkotlin.BaseApplication
import com.sondo65.daggerwithmitchkotlin.di.ViewModelFactoryModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ActivityBuilderModule::class,
        AppModule::class,
        ViewModelFactoryModule::class
    ]
)
interface AppComponent : AndroidInjector<BaseApplication>{

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun inject(application:Application): Builder

        fun build(): AppComponent
    }
}