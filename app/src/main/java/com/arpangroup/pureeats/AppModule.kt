package com.arpangroup.pureeats


import com.arpangroup.core.routing.AuthRouter
import org.koin.dsl.bind
import org.koin.dsl.module

val routerInterfaces = module {
//    factory { DemoImpl() as AuthRouter }
//    factory<AuthRouter> { AuthActivity }
    factory{ RouterImpl() } bind AuthRouter::class
}
