package uz.turgunboyevjurabek.mvvmcoroutinesexemple.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import uz.turgunboyevjurabek.mvvmcoroutinesexemple.databinding.ItemRvBinding
import uz.turgunboyevjurabek.mvvmcoroutinesexemple.madels.Get_AllClients

class RvAdapter(val list:ArrayList<Get_AllClients>):RecyclerView.Adapter<RvAdapter.Vh>() {
    inner class Vh(val itemRvBinding: ItemRvBinding):ViewHolder(itemRvBinding.root){
        fun  onBind(getAllclients: Get_AllClients,position: Int){
            itemRvBinding.itemName.text=getAllclients.ism
            itemRvBinding.itemDate.text=getAllclients.tel
            itemRvBinding.itemAddress.text=getAllclients.manzil
            itemRvBinding.itemPay.text=getAllclients.umumiySumma.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemRvBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position],position)
    }

}