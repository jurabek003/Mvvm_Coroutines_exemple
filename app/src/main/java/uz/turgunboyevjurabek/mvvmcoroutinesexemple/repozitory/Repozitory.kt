package uz.turgunboyevjurabek.mvvmcoroutinesexemple.repozitory

import uz.turgunboyevjurabek.mvvmcoroutinesexemple.network.ApiService

class Repozitory(val apiService: ApiService) {

    suspend fun getAllClient()=apiService.getAllClients()

}