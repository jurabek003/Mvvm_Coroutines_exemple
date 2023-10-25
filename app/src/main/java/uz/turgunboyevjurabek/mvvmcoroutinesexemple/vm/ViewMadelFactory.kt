package uz.turgunboyevjurabek.mvvmcoroutinesexemple.vm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import uz.turgunboyevjurabek.mvvmcoroutinesexemple.repozitory.Repozitory

class ViewMadelFactory(val repozitory: Repozitory):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(uz.turgunboyevjurabek.mvvmcoroutinesexemple.vm.ViewModel::class.java)){
            return uz.turgunboyevjurabek.mvvmcoroutinesexemple.vm.ViewModel(repozitory) as T
        }
        throw IllegalArgumentException("error")
    }

}