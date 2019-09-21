package com.sondo65.daggerwithmitchkotlin.di

import com.sondo65.daggerwithmitchkotlin.ui.auth.AuthActivity
import com.sondo65.daggerwithmitchkotlin.ui.auth.AuthViewModelsModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule{

    @ContributesAndroidInjector(
        modules = [AuthViewModelsModule::class]
    )
    abstract fun contributeAuthActivity(): AuthActivity

}