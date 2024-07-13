package com.aman.quizapp.presentation.main_activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.aman.quizapp.R
import com.aman.quizapp.presentation.nav_graph.SetNavGraph
import com.aman.quizapp.ui.theme.QuizAppTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent{
            QuizAppTheme {

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = colorResource(id = R.color.mid_night_blue)),
                    contentAlignment = Alignment.Center
                ) {
                   SetNavGraph()

                }
            }
        }
    }

}

