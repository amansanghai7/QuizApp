package com.aman.quizapp.presentation.home

import android.graphics.drawable.Icon
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.aman.quizapp.presentation.util.Dimens
import com.aman.quizapp.R



@Composable
fun HomeHeader(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .height(Dimens.HomeTopBoxHeight)
        .background(
            color = colorResource(id = R.color.dark_slate_blue),
            shape = RoundedCornerShape(
                bottomStart = Dimens.ExtraLargeCornerRadius,
                bottomEnd = Dimens.ExtraLargeCornerRadius
            ),
        )
    ){
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = Dimens.LargePadding),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
           androidx.compose.material3.Icon(
               painterResource(id = R.drawable.menu_open_24px),
               contentDescription = "",
               modifier = Modifier
                   .weight(1f)
                   .size(Dimens.MediumIconSize),
               tint = colorResource(id = R.color.blue_grey)
           )

            Text(
                text = "Quiz App",
                color = colorResource(id = R.color.blue_grey),
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.weight(3.5f),
                textAlign = TextAlign.Center,
                fontSize = Dimens.LargeTextSize
            )

            androidx.compose.material3.Icon(
                painterResource(id = R.drawable.account_box_24px),
                contentDescription = "",
                modifier = Modifier
                    .weight(1f)
                    .size(Dimens.MediumIconSize),
                tint = colorResource(id = R.color.blue_grey)
            )
        }
    }
}