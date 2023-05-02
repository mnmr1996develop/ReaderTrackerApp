package com.michaelrichards.readertracker.featureReader.domain.util.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.michaelrichards.readertracker.featureReader.presentation.details.BookDetailsScreen
import com.michaelrichards.readertracker.featureReader.presentation.home.Home
import com.michaelrichards.readertracker.featureReader.presentation.login.ReaderLoginScreen
import com.michaelrichards.readertracker.featureReader.presentation.search.ReaderBookSearchScreen
import com.michaelrichards.readertracker.featureReader.presentation.splash.SplashScreen
import com.michaelrichards.readertracker.featureReader.presentation.stats.ReaderStatsScreen
import com.michaelrichards.readertracker.featureReader.presentation.update.ReaderUpdateScreen

@Composable
fun ReaderNavigation () {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.SplashScreen.route){

        composable(route = Screen.SplashScreen.route){
            SplashScreen(navController = navController)
        }

        composable(route = Screen.LoginScreen.route){
            ReaderLoginScreen(navController = navController)
        }

        composable(route = Screen.RegistrationScreen.route){

        }

        composable(route = Screen.HomeScreen.route){
            Home(navController = navController)
        }

        composable(route = Screen.SearchScreen.route){
            ReaderBookSearchScreen(navController = navController)
        }

        composable(route = Screen.DetailScreen.route){
            BookDetailsScreen(navController = navController)
        }

        composable(route = Screen.UpdateScreen.route){
            ReaderUpdateScreen(navController = navController)
        }

        composable(route = Screen.StatScreen.route){
            ReaderStatsScreen(navController = navController)
        }
    }
}