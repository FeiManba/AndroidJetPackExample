package com.feima.jetpackpaging.room

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
class User {
    @PrimaryKey
    @NonNull
    var id: String? = null

    @ColumnInfo(name = "userName")
    var userName: String? = null

    @ColumnInfo(name = "userAddress")
    var userAddress: String? = null

    @ColumnInfo(name = "userSex")
    var userSex = 0

    @ColumnInfo(name = "phone")
    var phone: String? = null

    @ColumnInfo(name = "userPhoto")
    var userPhoto: String? = null

    @ColumnInfo(name = "userSchool")
    var userSchool: String? = null

    override fun toString(): String {
        return "User(id=$id, userName=$userName, userAddress=$userAddress, userSex=$userSex, phone=$phone, userPhoto=$userPhoto, userSchool=$userSchool)"
    }

}