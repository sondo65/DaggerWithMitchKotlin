package com.sondo65.daggerwithmitchkotlin.ui.auth

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.sondo65.daggerwithmitchkotlin.databinding.AuthActivityBinding
import com.bumptech.glide.RequestManager
import com.sondo65.daggerwithmitchkotlin.R
import com.sondo65.daggerwithmitchkotlin.viewmodels.ViewModelProviderFactory
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class AuthActivity : DaggerAppCompatActivity() {

    lateinit var viewModel: AuthViewModel

    @Inject
    lateinit var providerFactory: ViewModelProviderFactory

    @Inject
    lateinit var logo: Drawable

    @Inject
    lateinit var requestManager: RequestManager

    private lateinit var binding: AuthActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        viewModel = ViewModelProviders.of(this,providerFactory).get(AuthViewModel::class.java)
        initialiseView()
        setLogo()
    }

    private fun initialiseView(){
        binding = DataBindingUtil.setContentView(this,
            R.layout.activity_auth
        )
    }

    private fun setLogo(){
        requestManager
            .load(logo)
            .into(binding.loginLogo)
    }
}
