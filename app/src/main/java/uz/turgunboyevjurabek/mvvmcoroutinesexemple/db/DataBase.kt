package uz.turgunboyevjurabek.mvvmcoroutinesexemple.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import uz.turgunboyevjurabek.mvvmcoroutinesexemple.madels.Get_AllClients

@Database(entities = [Get_AllClients::class], version = 3)
abstract class DataBase:RoomDatabase() {
    abstract fun abstrakDao():DataBase_Dao

    companion object{
        fun newInstens(context: Context):DataBase{
            return Room.databaseBuilder(context,DataBase::class.java,"Hello")
                .allowMainThreadQueries()
              .fallbackToDestructiveMigration()
                .build()
        }

    }
}