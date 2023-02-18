package its.my.fitness.ru.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import its.my.fitness.ru.data.SessionRepositoryImpl
import its.my.fitness.ru.data.nw.ThequesApi
import its.my.fitness.ru.domain.SessionRepository
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataModule {

    @Provides
    @Singleton
    fun provideSessionRepository(
        @Named("GitHubApi") gitHubApi: ThequesApi
    ) : SessionRepository {
        return SessionRepositoryImpl(gitHubApi)
    }

}