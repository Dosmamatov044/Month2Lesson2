package com.example.month2lesson2.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.month2lesson2.MyModel
import com.example.month2lesson2.repository.PhotosRepository
import kotlinx.coroutines.launch

class MainViewModel(val repository:PhotosRepository,val text:String):ViewModel() {
   val apiLiveData=MutableLiveData<MyModel>()


   init {

      getImage()
   }


  private fun getImage(){




      viewModelScope.launch {

        val api= repository.getPhotos(5)

          api?.let {

              if (api.isSuccessful){
                  apiLiveData.value=api.body()
              } else{
                  Log.d("ololo",api.message())
                  Log.d("ololo",api.errorBody().toString())

              }



          }



      }







   }





}