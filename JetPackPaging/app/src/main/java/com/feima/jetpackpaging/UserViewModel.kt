package com.feima.jetpackpaging

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import com.feima.jetpackpaging.room.User
import com.feima.jetpackpaging.room.UserDao

class UserViewModel(userDao: UserDao) : ViewModel() {
    val userSet:LiveData<PagedList<User>> = userDao.dataSourceAll().toLiveData(pageSize = 50)
}