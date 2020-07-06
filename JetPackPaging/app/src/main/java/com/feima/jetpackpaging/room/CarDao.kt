package com.feima.jetpackpaging.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface CarDao {


    @Query("SELECT * FROM car")
    fun getAll(): List<Car>

    /**
     * Insert a user in the database. If the user already exists, replace it.
     *
     * @param car the user to be inserted.
     */
    @Insert
    fun insertCar(car: Car)

    /**
     * Delete all users.
     */
    @Query("DELETE FROM car")
    fun deleteAllCars()
}