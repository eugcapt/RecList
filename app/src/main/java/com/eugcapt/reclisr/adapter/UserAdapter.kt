package com.eugcapt.reclisr.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.eugcapt.reclisr.R
import com.eugcapt.reclisr.model.UserModel
import kotlinx.android.synthetic.main.item_user_layout.view.*

class UserAdapter: RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    private var userList = emptyList<UserModel>()

    class UserViewHolder(view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        //указываем лэйаут и разворачиваем его
         val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user_layout,parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        //привязываем данные к полям ресайклера
        holder.itemView.tvSurname.text = userList[position].lastName
        holder.itemView.tvFirstName.text = userList[position].firstName
    }

    override fun getItemCount(): Int {
        //количество элементов
        return userList.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<UserModel>) {
        //передаём данные для заполнения
        userList = list
        //оповещаем адаптер об изменении данных
        notifyDataSetChanged()
    }

}