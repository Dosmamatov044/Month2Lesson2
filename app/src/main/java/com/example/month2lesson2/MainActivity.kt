package com.example.month2lesson2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.example.month2lesson2.repository.PhotosRepository
import com.example.month2lesson2.viewmodel.MainVMFactory
import com.example.month2lesson2.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

     val viewModel: MainViewModel by viewModels{MainVMFactory(PhotosRepository(),"")}




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


viewModel.apiLiveData.observe(this){

    Log.d("ololo",it[0].id)



}




    }
}