package com.example.datetrail.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "생성한 데이트 코스 목록 화면입니다."
    }
    val text: LiveData<String> = _text
}