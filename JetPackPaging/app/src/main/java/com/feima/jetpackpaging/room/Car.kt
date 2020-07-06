package com.feima.jetpackpaging.room

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "car")
class Car {
    @PrimaryKey
    @NonNull
    var id: String? = null

    @ColumnInfo(name = "carName")
    var carName: String? = null

    @ColumnInfo(name = "carDriveNum")
    var carDriveNum: Int = 2

    @ColumnInfo(name = "carFactory")
    var carFactory: String? = null

    override fun toString(): String {
        return "Car(id=$id, carName=$carName, carDriveNum=$carDriveNum, carFactory=$carFactory)"
    }

}