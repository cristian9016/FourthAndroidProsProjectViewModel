package com.example.cristiandev.fourthandroidprosprojectbinding

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

/**
 * Created by CristianDev on 12/12/2017.
 */
class MainViewModel:ViewModel(){
    var msg:MutableLiveData<String> = MutableLiveData()
}