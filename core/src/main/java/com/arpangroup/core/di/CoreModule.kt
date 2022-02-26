package com.arpangroup.core.di


import android.content.Context
import com.arpangroup.core.routing.AuthRouter
import org.koin.dsl.module
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.bind

/*
import com.mindorks.framework.mvvm.BuildConfig
import com.mindorks.framework.mvvm.data.api.ApiHelper
import com.mindorks.framework.mvvm.data.api.ApiHelperImpl
import com.mindorks.framework.mvvm.data.api.ApiService
import com.mindorks.framework.mvvm.utils.NetworkHelper
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
*/


val appModule = module {
//    single { provideOkHttpClient() }
//    single { provideRetrofit(get(), BuildConfig.BASE_URL) }
//    single { provideApiService(get()) }
//    single { provideNetworkHelper(androidContext()) }

//    single<ApiHelper> {
//        return@single ApiHelperImpl(get())
//    }

//    factory { DemoImpl() as AuthRouter }
//    factory<AuthRouter> { DemoImpl() }
//    factory{ DemoImpl() } bind AuthRouter.class;
}


//private fun provideNetworkHelper(context: Context) = NetworkHelper(context)

/*private fun provideOkHttpClient() = if (BuildConfig.DEBUG) {
    val loggingInterceptor = HttpLoggingInterceptor()
    loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
    OkHttpClient.Builder()
        .addInterceptor(loggingInterceptor)
        .build()
} else OkHttpClient
    .Builder()
    .build()*/

/*private fun provideRetrofit(
    okHttpClient: OkHttpClient,
    BASE_URL: String
): Retrofit =
    Retrofit.Builder()
        .addConverterFactory(MoshiConverterFactory.create())
        .baseUrl(BASE_URL)
        .client(okHttpClient)
        .build()*/

//private fun provideApiService(retrofit: Retrofit): ApiService = retrofit.create(ApiService::class.java)