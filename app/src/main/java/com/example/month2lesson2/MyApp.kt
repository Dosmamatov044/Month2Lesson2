package com.example.month2lesson2

import android.app.Application
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class MyApp:Application() {
 private lateinit var retrofit: Retrofit
        override fun onCreate() {
        super.onCreate()

        val logger=HttpLoggingInterceptor()

        logger.level=HttpLoggingInterceptor.Level.BODY

        val okHttpClient=OkHttpClient.Builder().connectTimeout(30,TimeUnit.SECONDS).
        writeTimeout(40,TimeUnit.SECONDS).
        readTimeout(40,TimeUnit.SECONDS).addInterceptor(logger).build()




        retrofit=Retrofit.Builder().baseUrl(Constants.BASE_URL).client(okHttpClient).addConverterFactory(GsonConverterFactory.create()).build()

        api=retrofit.create(UnsplashApi::class.java)
    }companion object{
        var api:UnsplashApi?=null
        private set
    }



}