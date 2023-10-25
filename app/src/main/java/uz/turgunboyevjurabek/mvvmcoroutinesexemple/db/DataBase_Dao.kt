package uz.turgunboyevjurabek.mvvmcoroutinesexemple.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

import uz.turgunboyevjurabek.mvvmcoroutinesexemple.madels.Get_AllClients

@Dao
interface DataBase_Dao {

    @Query("SELECT * FROM Get_AllClients")
    fun getAll(): List<Get_AllClients>


    @Insert
    fun addList(list: ArrayList<Get_AllClients>)


}