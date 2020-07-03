package com.feima.jetpackroom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.setOnClickListener {
            insertCar()
        }
        btn_show_usr.setOnClickListener {
            showCar()
        }
    }

    private fun showCar() {
        val carDao = AppDataBase.getInstance(this.applicationContext).carDao()
        val all = carDao.getAll()
        tv_user.text = all[all.size - 1].toString()
    }

    private fun insertCar() {
        val carDao = AppDataBase.getInstance(this.applicationContext).carDao()
        val car: Car = Car()
        car.carDriveNum = 4;
        car.carName = "小宝马"
        car.carFactory = "德国宝马"
        car.id = UUID.randomUUID().toString()
        carDao.insertCar(car)
    }

    private fun showUser() {
        val userDao = AppDataBase.getInstance(this.applicationContext).userDao()
        val all = userDao.getAll()
        tv_user.text = all[all.size - 1].toString()
    }

    private fun insertUser() {
        val userDao = AppDataBase.getInstance(this.applicationContext).userDao()
        val user: User = User()
        user.id = UUID.randomUUID().toString()
        user.userName = "会飞的野马"
        user.phone = "110120119"
        user.userAddress = "河南郑洲"
        user.userPhoto =
            "https://www.gstatic.cn/devrel-devsite/prod/v41c318553034f08027fad868d3efbb4f6ddb57036dd971efa1192efa8d03385a/android/images/lockup.svg"
        user.userSex = 1
        user.userSchool = "郑洲大学"
        userDao.insertUser(user)
    }
}