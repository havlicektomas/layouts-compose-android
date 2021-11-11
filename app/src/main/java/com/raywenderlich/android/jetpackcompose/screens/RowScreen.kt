package com.raywenderlich.android.jetpackcompose.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import com.raywenderlich.android.jetpackcompose.R
import com.raywenderlich.android.jetpackcompose.router.BackButtonHandler
import com.raywenderlich.android.jetpackcompose.router.JetFundamentalsRouter
import com.raywenderlich.android.jetpackcompose.router.Screen

val THREE_ELEMENT_LIST = listOf(R.string.first, R.string.second, R.string.third)

@Composable
fun RowScreen() {
  MyRow()

  BackButtonHandler {
    JetFundamentalsRouter.navigateTo(Screen.Navigation)
  }
}

@Composable
fun MyRow() {
  Row(verticalAlignment = Alignment.CenterVertically,
    horizontalArrangement = Arrangement.SpaceEvenly,
    //horizontalArrangement = Arrangement.SpaceBetween,
    //horizontalArrangement = Arrangement.SpaceAround,
    modifier = Modifier.fillMaxSize()) {

    THREE_ELEMENT_LIST.forEach { textResId ->
      Text(
        text = stringResource(id = textResId),
        fontSize = 18.sp
      )
    }
  }
}