package its.my.fitness.ru.data.nw.model


import com.google.gson.annotations.SerializedName

data class LoginNW(
    @SerializedName("auth_key")
    val authKey: String?,
    @SerializedName("ok")
    val ok: Int?,
    @SerializedName("user_id")
    val userId: Int?
)