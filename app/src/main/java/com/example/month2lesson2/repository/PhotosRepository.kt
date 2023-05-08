package com.example.month2lesson2.repository

import com.example.month2lesson2.Constants
import com.example.month2lesson2.MyApp
import com.example.month2lesson2.MyModel
import retrofit2.Response

class PhotosRepository{

    suspend fun getPhotos(page:Int):Response<MyModel>?{
        return MyApp.api?.getImages(Constants.KEY,page)
    }



}