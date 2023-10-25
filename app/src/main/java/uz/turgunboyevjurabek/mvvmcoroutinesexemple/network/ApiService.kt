package uz.turgunboyevjurabek.mvvmcoroutinesexemple.network

import retrofit2.http.GET
import uz.turgunboyevjurabek.mvvmcoroutinesexemple.madels.Get_AllClients

interface ApiService {

    @GET("clientlar/")
    suspend fun getAllClients():ArrayList<Get_AllClients>


}
