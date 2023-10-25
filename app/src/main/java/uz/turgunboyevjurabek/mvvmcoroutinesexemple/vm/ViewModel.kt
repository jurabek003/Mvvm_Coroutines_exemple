package uz.turgunboyevjurabek.mvvmcoroutinesexemple.vm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import uz.turgunboyevjurabek.mvvmcoroutinesexemple.madels.Get_AllClients
import uz.turgunboyevjurabek.mvvmcoroutinesexemple.repozitory.Repozitory
import uz.turgunboyevjurabek.mvvmcoroutinesexemple.utils.Resourse
import java.lang.Exception

class ViewModel(val repozitory: Repozitory):ViewModel() {

    // this is for get All clients LiveData
    private val getAllclientsLiveData=MutableLiveData<Resourse<ArrayList<Get_AllClients>>>()


    fun getAllCLinet():MutableLiveData<Resourse<ArrayList<Get_AllClients>>>{

        viewModelScope.launch {
            getAllclientsLiveData.postValue(Resourse.loading("loading"))
            try {
                coroutineScope {

                    val list=async{
                        repozitory.getAllClient()
                    }.await()
                    getAllclientsLiveData.postValue(   Resourse.success(list))
                }
            }catch (e:Exception){
                getAllclientsLiveData.postValue(Resourse.error(e.message))
            }

        }
        return getAllclientsLiveData
    }
}