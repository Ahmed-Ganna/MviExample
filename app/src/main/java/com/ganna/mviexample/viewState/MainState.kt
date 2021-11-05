package com.ganna.mviexample.viewState

import com.ganna.mviexample.data.User

sealed class MainState {
    object Idle : MainState()     
    object Loading : MainState()     
    data class Users(val user: List<User>) : MainState()
    data class Error(val error: String?) : MainState()  
}