package com.michaelrichards.readertracker.featureReader.domain.util.navigation

sealed class Screen(val route: String) {
    object SplashScreen: Screen("splash_screen")
    object RegistrationScreen: Screen("registration_screen")
    object LoginScreen: Screen("login_screen")
    object HomeScreen: Screen("home_screen")
    object SearchScreen: Screen("search_screen")
    object DetailScreen: Screen("detail_screen")
    object UpdateScreen: Screen("update_screen")
    object StatScreen: Screen("stat_screen")
}