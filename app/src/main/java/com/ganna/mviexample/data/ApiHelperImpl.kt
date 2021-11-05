package com.ganna.mviexample.data

class ApiHelperImpl(private val apiService: ApiService) : ApiHelper {
         override suspend fun getUsers(): List<User> {  
               return apiService.getUsers()     
          } 
}