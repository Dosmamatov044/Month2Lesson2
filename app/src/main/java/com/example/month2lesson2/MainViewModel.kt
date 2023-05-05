package com.example.month2lesson2

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainViewModel:ViewModel() {
   val apiLiveData=MutableLiveData<MyModel>()


   init {

      getImage()
   }


  private fun getImage(){


      viewModelScope.launch {

          val api=MyApp.api






          api?.let {

              val images=it.getImages(Constants.KEY)

              if (images.isSuccessful){

                  apiLiveData.value=images.body()


              } else{
                  Log.d("ololo",images.message())
                  Log.d("ololo",images.errorBody().toString())

              }



          }



      }







   }





}