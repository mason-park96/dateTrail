package com.example.datetrail.ui.notifications

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NotificationsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "데이트 코스 작성 화면입니다."
    }
    val text: LiveData<String> = _text
}