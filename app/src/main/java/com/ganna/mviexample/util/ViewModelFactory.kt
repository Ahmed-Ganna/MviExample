package com.ganna.mviexample.util

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ganna.mviexample.data.ApiHelper
import com.ganna.mviexample.data.MainRepository
import com.ganna.mviexample.viewModel.MainViewModel

class ViewModelFactory(private val apiHelper: ApiHelper) : ViewModelProvider.Factory
     {      
     override fun <T : ViewModel?> create(modelClass: Class<T>): T 
      {         
       if (modelClass.isAssignableFrom(MainViewModel::class.java))
        {             
           return MainViewModel(MainRepository(apiHelper)) as T
              }         
            throw IllegalArgumentException("Unknown class name")   
           }  
      }