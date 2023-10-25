package uz.turgunboyevjurabek.mvvmcoroutinesexemple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import uz.turgunboyevjurabek.mvvmcoroutinesexemple.adapter.RvAdapter
import uz.turgunboyevjurabek.mvvmcoroutinesexemple.databinding.ActivityMainBinding
import uz.turgunboyevjurabek.mvvmcoroutinesexemple.network.ApiClinet
import uz.turgunboyevjurabek.mvvmcoroutinesexemple.repozitory.Repozitory
import uz.turgunboyevjurabek.mvvmcoroutinesexemple.utils.Status
import uz.turgunboyevjurabek.mvvmcoroutinesexemple.vm.ViewMadelFactory
import uz.turgunboyevjurabek.mvvmcoroutinesexemple.vm.ViewModel

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private lateinit var viewModel: ViewModel
    lateinit var repozitory: Repozitory
    lateinit var rvAdapter: RvAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        viewModelWorking()



    }

    private fun viewModelWorking() {

        // Repozitory abeyektni olosh
        repozitory= Repozitory(ApiClinet.getApiService())

        // VeiwModel abeyektni olosh
        viewModel= ViewModelProvider(this,ViewMadelFactory(repozitory))[ViewModel::class.java]


        // api dan kelayotgan malumotlarni qanday ahvollarga tushganini  eshitish uchun
        viewModel.getAllCLinet().observe(this){
            when(it.status){
                Status.LOADING->{
                    Toast.makeText(this, "loading", Toast.LENGTH_SHORT).show()
                }
                Status.ERROR->{
                    Toast.makeText(this, "error 🤢${it.massage}", Toast.LENGTH_SHORT).show()
                }
                Status.SUCCESSFUL->{
                    Toast.makeText(this, "Uraaa 😉👨‍💻", Toast.LENGTH_SHORT).show()
                    rvAdapter= RvAdapter(it.date!!)
                    binding.rvAdapter.adapter=rvAdapter

                }
            }
        }


    }
}