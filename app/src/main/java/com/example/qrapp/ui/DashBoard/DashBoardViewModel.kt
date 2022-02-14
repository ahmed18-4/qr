package com.example.qrapp.ui.DashBoard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashBoardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is dash board Fragment"
    }
    val text: LiveData<String> = _text
}