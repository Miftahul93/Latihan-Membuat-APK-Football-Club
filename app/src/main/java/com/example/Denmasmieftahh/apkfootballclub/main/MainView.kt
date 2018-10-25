package com.example.Denmasmieftahh.apkfootballclub.main

import com.example.Denmasmieftahh.apkfootballclub.model.Team

interface MainView {
    fun showLoading()
    fun hideLoading()
    fun showTeamList(data: List<Team>)
}