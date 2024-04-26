package com.example.datetrail.util

import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


public object RetrofitApi {
    private val okHttpClient: OkHttpClient by lazy {
        OkHttpClient.Builder()
            .connectTimeout(2, TimeUnit.MINUTES)
            .readTimeout(1, TimeUnit.MINUTES)
            .writeTimeout(30 , TimeUnit.SECONDS)
            .addInterceptor(HttpLoggingInterceptor().apply{
            })
            .build()
    }

    val url: String = "168.192.0.32:8013"

    val retrofit = Retrofit.Builder()
        .baseUrl(url)
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttpClient)
        .build()

    // 이하에 비즈니스 레이어랑 레트로핏 API 랑 연동시켜야하고
    // 다른 디렉토리에서 비즈니스 로직도 작성해야하고

}