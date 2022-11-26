package com.eugcapt.reclisr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.eugcapt.reclisr.adapter.UserAdapter
import com.eugcapt.reclisr.databinding.ActivityMainBinding
import com.eugcapt.reclisr.model.UserModel

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var adapter: UserAdapter
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initial()
    }
    private fun initial() {
        recyclerView = binding.recyclerViewUser
        adapter = UserAdapter()
        recyclerView.adapter = adapter
        adapter.setList(myUser())
    }

    fun myUser(): ArrayList<UserModel>{
        val userList = ArrayList<UserModel>()

        val user = UserModel("Eug","Capt")
        userList.add(user)
        val user1 = UserModel("Eug","Capt")
        userList.add(user1)
        val user2 = UserModel("Eug","Capt")
        userList.add(user2)
        val user3 = UserModel("Eug","Capt")
        userList.add(user3)
        val user4 = UserModel("Eug","Capt")
        userList.add(user4)
        val user5 = UserModel("Eug","Capt")
        userList.add(user5)
        val user6 = UserModel("Eug","Capt")
        userList.add(user6)

        return userList
    }
}