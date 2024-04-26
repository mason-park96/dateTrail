package com.example.datetrail.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "커플의 공유사항(공지사항)을 확인하는 게시판입니다."
    }
    val text: LiveData<String> = _text
}