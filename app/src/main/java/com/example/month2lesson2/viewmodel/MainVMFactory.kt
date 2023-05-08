package com.example.month2lesson2.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.month2lesson2.repository.PhotosRepository

class MainVMFactory(private val repository: PhotosRepository,val text:String):ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)){


            return  MainViewModel(repository, text = text) as T


        }

        throw IllegalArgumentException("Unknown viewmodel class")




    }

}