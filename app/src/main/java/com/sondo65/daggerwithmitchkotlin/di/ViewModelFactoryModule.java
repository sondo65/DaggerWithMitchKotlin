package com.sondo65.daggerwithmitchkotlin.di;

import androidx.lifecycle.ViewModelProvider;

import com.sondo65.daggerwithmitchkotlin.viewmodels.ViewModelProviderFactory;

import dagger.Binds;
import dagger.Module;


@Module
public abstract class ViewModelFactoryModule {

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory viewModelFactory);

}
