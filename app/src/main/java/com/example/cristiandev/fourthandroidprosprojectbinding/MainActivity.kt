package com.example.cristiandev.fourthandroidprosprojectbinding

import android.arch.lifecycle.Observer
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.cristiandev.fourthandroidprosprojectbinding.util.getViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val viewModel : MainViewModel by lazy { getViewModel<MainViewModel>() }

    val location:Location = Location(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_change.setOnClickListener{
            viewModel.msg.value = "hola"
        }
        viewModel.msg.observe(this, Observer {
            txt.text = it
        })
    }
}
