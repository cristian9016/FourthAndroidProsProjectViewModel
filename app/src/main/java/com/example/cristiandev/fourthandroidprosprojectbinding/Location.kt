package com.example.cristiandev.fourthandroidprosprojectbinding

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.LifecycleOwner
import android.arch.lifecycle.OnLifecycleEvent
import android.util.Log

/**
 * Created by CristianDev on 12/12/2017.
 */
class Location(owner:LifecycleOwner):LifecycleObserver{
    init {
        owner.lifecycle.addObserver(this)
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun initLocation(){
        Log.i("location","Inicio de GPS")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun stopLocation(){
        Log.i("location","fin de GPS")
    }
}