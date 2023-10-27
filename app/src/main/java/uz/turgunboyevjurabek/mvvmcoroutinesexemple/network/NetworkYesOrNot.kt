package uz.turgunboyevjurabek.mvvmcoroutinesexemple.network

import android.annotation.SuppressLint
import android.content.Context
import android.net.ConnectivityManager

class NetworkYesOrNot() {
     fun isNetworkAvailable(context: Context): Boolean {
             val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
             val networkInfo = connectivityManager.activeNetworkInfo
             return networkInfo != null && networkInfo.isConnected
         }
}