package com.michaelrichards.readertracker.featureReader.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.michaelrichards.readertracker.ReaderApplication
import com.michaelrichards.readertracker.featureReader.domain.util.navigation.ReaderNavigation
import com.michaelrichards.readertracker.featureReader.domain.util.navigation.Screen
import com.michaelrichards.readertracker.featureReader.presentation.details.BookDetailsScreen
import com.michaelrichards.readertracker.featureReader.presentation.home.Home
import com.michaelrichards.readertracker.featureReader.presentation.login.ReaderLoginScreen
import com.michaelrichards.readertracker.featureReader.presentation.search.ReaderBookSearchScreen
import com.michaelrichards.readertracker.featureReader.presentation.splash.SplashScreen
import com.michaelrichards.readertracker.featureReader.presentation.stats.ReaderStatsScreen
import com.michaelrichards.readertracker.featureReader.presentation.update.ReaderUpdateScreen
import com.michaelrichards.readertracker.ui.theme.ReaderTrackerTheme
import dagger.hilt.android.AndroidEntryPoint

private const val TAG = "MainActivity"

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ReaderTrackerTheme {
                ReaderApp()
            }
        }
    }
}

@Composable
fun ReaderApp(){
    Surface(
        color = MaterialTheme.colorScheme.background,
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 46.dp)
    ) {
        Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                ReaderNavigation()
        }
    }
}