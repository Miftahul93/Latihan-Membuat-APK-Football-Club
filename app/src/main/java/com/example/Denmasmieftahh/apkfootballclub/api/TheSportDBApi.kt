package com.example.Denmasmieftahh.apkfootballclub.api

import android.net.Uri
import com.example.Denmasmieftahh.apkfootballclub.BuildConfig
import com.example.Denmasmieftahh.apkfootballclub.main.MainPresenter
import java.util.logging.Logger

object TheSportDBApi {

    fun getTeams(league: String?): String{
        var uri = Uri.parse(BuildConfig.BASE_URL).buildUpon()
            .appendPath("api")
            .appendPath("v1")
            .appendPath("json")
            .appendPath(BuildConfig.TSDB_API_KEY)
            .appendPath("search_all_teams.php")
            .appendQueryParameter("l", league)
            .build()
            .toString();
        Logger.getLogger(TheSportDBApi::class.java.name).warning(uri)
        return uri
    }
}