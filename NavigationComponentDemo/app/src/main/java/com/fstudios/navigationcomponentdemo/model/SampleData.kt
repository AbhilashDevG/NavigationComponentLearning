package com.fstudios.navigationcomponentdemo.model

import androidx.lifecycle.MutableLiveData

class SampleData {
    companion object{
        var defaultAmount = MutableLiveData<Long>(100L)
    }
}