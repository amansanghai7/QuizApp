package com.aman.quizapp.presentation.home

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.aman.quizapp.presentation.common.AppDropDownMenu
import com.aman.quizapp.presentation.common.ButtonBox
import com.aman.quizapp.presentation.nav_graph.Routes
import com.aman.quizapp.presentation.util.Constants
import com.aman.quizapp.presentation.util.Dimens


//@Preview
//@Composable
//private fun PrevHome() {
//    HomeScreen(
//        state = StateHomeScreen(),
//        event = { }
//        )
//}

@Composable
fun HomeScreen(
    state : StateHomeScreen,
    event: (EventHomeScreen) -> Unit,
    navController: NavController
){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ){
        HomeHeader()

        Spacer(modifier = Modifier.height(Dimens.MediumSpacerHeight))
        AppDropDownMenu(menuName = "Number of Questions: ", menuList = Constants.numberAsString, text = state.numberOfQuiz.toString(),
            onDropDownClick = {event(EventHomeScreen.SetNumberOfQuizzes(it.toInt()))})

        Spacer(modifier = Modifier.height(Dimens.SmallSpacerHeight))
        AppDropDownMenu(menuName = "Select Category: ", menuList = Constants.categories, text = state.category,
            onDropDownClick = {event(EventHomeScreen.SetQuizCategory(it))})

        Spacer(modifier = Modifier.height(Dimens.SmallSpacerHeight))
        AppDropDownMenu(menuName = "Select Difficulty: ", menuList = Constants.difficulty, text = state.difficulty,
            onDropDownClick = {event(EventHomeScreen.SetQuizDifficulty(it))})

        Spacer(modifier = Modifier.height(Dimens.SmallSpacerHeight))
        AppDropDownMenu(menuName = "Select Type: ", menuList = Constants.type, text = state.type,
            onDropDownClick = {event(EventHomeScreen.SetQuizType(it))})

        Spacer(modifier = Modifier.height(Dimens.MediumSpacerHeight))
        ButtonBox(text = "Generate Quiz", padding = Dimens.MediumPadding){

            navController.navigate(
                route = Routes.QuizScreen.passQuizParams(state.numberOfQuiz, state.category, state.difficulty, state.type)
            )

        }

    }
}