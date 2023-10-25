package uz.turgunboyevjurabek.mvvmcoroutinesexemple.madels


import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity
data class Post_Client(
    @SerializedName("fam")
    val fam: String,
    @SerializedName("ism")
    val ism: String,
    @SerializedName("manzil")
    val manzil: String,
    @SerializedName("tel")
    val tel: String,
    @SerializedName("umumiy_summa")
    val umumiySumma: Int


)