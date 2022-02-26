package com.arpangroup.core.di

//import com.mindorks.framework.mvvm.data.repository.MainRepository
import org.koin.dsl.module

val repoModule = module {
    single {
//        MainRepository(get())
    }
}