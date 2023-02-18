package its.my.fitness.ru.data

import its.my.fitness.ru.domain.SessionRepository
import its.my.fitness.ru.domain.model.User
import its.my.fitness.ru.domain.utils.ValidationResult

class SessionRepositoryImpl: SessionRepository {

    override suspend fun registration(user: User): ValidationResult {
        TODO("Not yet implemented")
    }

    override suspend fun signIn(user: User): ValidationResult {
        TODO("Not yet implemented")
    }

    override suspend fun signIn(): ValidationResult {
        TODO("Not yet implemented")
    }

}