package com.example.Denmasmieftahh.apkfootballclub.api

import android.net.Uri
import com.example.Denmasmieftahh.apkfootballclub.BuildConfig

object TheSportDBApi {

    fun getTeams(league: String?): String{
        return Uri.parse(BuildConfig.BASE_URL).buildUpon()
            .appendPath("api")
            .appendPath("v1")
            .appendPath("json")
            .appendPath(BuildConfig.TSDB_API_KEY)
            .appendPath("search_all_teams.php")
            .appendQueryParameter("1", league)
            .build()
            .toString()
    }
}