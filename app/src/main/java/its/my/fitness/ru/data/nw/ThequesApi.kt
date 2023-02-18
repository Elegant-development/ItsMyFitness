package its.my.fitness.ru.data.nw

import its.my.fitness.ru.data.nw.model.LoginNW
import retrofit2.http.POST
import retrofit2.http.Path

interface ThequesApi {

    @POST("auth/{\"login\": \"{login}\", \"password\": \"{password}\"}")
    suspend fun getRepositories(
        @Path("login") login: Int,
        @Path("password") password: Int
    ) : LoginNW

}