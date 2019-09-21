package com.sondo65.daggerwithmitchkotlin.ui.auth

import androidx.lifecycle.ViewModel
import com.sondo65.daggerwithmitchkotlin.di.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class AuthViewModelsModule{
    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel::class)
    abstract fun bindAuthViewModel(viewModel: AuthViewModel):ViewModel
}