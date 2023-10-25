package uz.turgunboyevjurabek.mvvmcoroutinesexemple.utils

data class Resourse<out T>(val status: Status,val date:T?,val massage:String?){
    companion object{
        fun <T>success(data:T):Resourse<T>{
            return Resourse(Status.SUCCESSFUL,data,null)
        }
        fun <T>error(massage: String?):Resourse<T>{
            return Resourse(Status.ERROR,null,massage)
        }
        fun <T>loading(massage: String?):Resourse<T>{
            return Resourse(Status.LOADING,null,null)
        }

    }
}
