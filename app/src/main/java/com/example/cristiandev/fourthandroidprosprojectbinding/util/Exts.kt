package com.example.cristiandev.fourthandroidprosprojectbinding.util

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity

/**
 * Created by CristianDev on 12/12/2017.
 */
inline fun <reified T:ViewModel>AppCompatActivity.getViewModel():T =
        ViewModelProviders.of(this).get(T::class.java)