package com.sondo65.daggerwithmitchkotlin.ui.auth

import android.util.Log

import androidx.lifecycle.ViewModel

import javax.inject.Inject

class AuthViewModel @Inject
constructor() : ViewModel() {
    init {
        Log.d(TAG, "AuthViewModel: is working !")
    }

    companion object {
        private val TAG = "AuthViewModel"
    }
}
