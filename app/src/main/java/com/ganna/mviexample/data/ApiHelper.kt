package com.ganna.mviexample.data

interface ApiHelper {
                 suspend fun getUsers(): List<User>  
                 }