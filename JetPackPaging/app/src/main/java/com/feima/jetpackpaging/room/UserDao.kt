package com.feima.jetpackpaging.room

import androidx.paging.DataSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao {

    @Query("SELECT * FROM user")
    fun getAll(): List<User>

    @Query("SELECT * FROM user WHERE id IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<User>

    /**
     * Insert a user in the database. If the user already exists, replace it.
     *
     * @param user the user to be inserted.
     */
    @Insert
    fun insertUser(user: User)

    /**
     * Delete all users.
     */
    @Query("DELETE FROM user")
    fun deleteAllUsers()

    @Query("SELECT * FROM user")
    fun dataSourceAll(): DataSource.Factory<Int, User>
}