package com.ganna.mviexample.data

class MainRepository(private val apiHelper: ApiHelper)
 {      
     suspend fun getUsers() = apiHelper.getUsers()  
  }