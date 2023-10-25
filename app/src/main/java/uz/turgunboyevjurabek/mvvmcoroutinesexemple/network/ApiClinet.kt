package uz.turgunboyevjurabek.mvvmcoroutinesexemple.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClinet {
    const val BASE_URL="https://api111.pythonanywhere.com"
    fun getRetrofit(): Retrofit{
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
    }

    fun getApiService():ApiService{
        return getRetrofit().create(ApiService::class.java)
    }
}