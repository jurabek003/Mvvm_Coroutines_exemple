package uz.turgunboyevjurabek.mvvmcoroutinesexemple.madels


import com.google.gson.annotations.SerializedName

data class Get_AllClients(
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