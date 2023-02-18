package its.my.fitness.ru.domain

import its.my.fitness.ru.domain.model.User
import its.my.fitness.ru.domain.utils.ValidationResult

interface SessionRepository {

    suspend fun registration(user: User): ValidationResult

    suspend fun signIn(user: User): ValidationResult

    suspend fun signIn(): ValidationResult

}