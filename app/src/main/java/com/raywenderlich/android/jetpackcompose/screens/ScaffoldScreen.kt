
package com.raywenderlich.android.jetpackcompose.screens

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.LifecycleCoroutineScope
import com.raywenderlich.android.jetpackcompose.R
import com.raywenderlich.android.jetpackcompose.router.BackButtonHandler
import com.raywenderlich.android.jetpackcompose.router.JetFundamentalsRouter
import com.raywenderlich.android.jetpackcompose.router.Screen
import kotlinx.coroutines.withContext

@Composable
fun ScaffoldScreen() {
  MyScaffold()

  BackButtonHandler {
    JetFundamentalsRouter.navigateTo(Screen.Navigation)
  }
}

@Composable
fun MyScaffold() {
  val scaffoldState: ScaffoldState = rememberScaffoldState()

  Scaffold(
    scaffoldState = scaffoldState,
    contentColor = colorResource(id = R.color.colorPrimary),
    topBar = { MyTopAppBar(scaffoldState) },
    bottomBar = { MyBottomAppBar() },
    drawerContent = { MyColumn() }
  ) {
    MyRow()
  }
}

@Composable
fun MyTopAppBar(scaffoldState: ScaffoldState) {
  TopAppBar(
    navigationIcon = {
      IconButton(
        content = {
          Icon(
            imageVector = Icons.Default.Menu,
            contentDescription = "menu button",
            tint = Color.White
          )
        },
        onClick = {
          //scaffoldState.drawerState.open()
        }
      )
    },
    title = {
      Text(
        text = stringResource(id = R.string.app_name),
        color = Color.White
      )
    },
    backgroundColor = colorResource(id = R.color.colorPrimary)
  )
}

@Composable
fun MyBottomAppBar() {
  BottomAppBar(
    content = {},
    backgroundColor = colorResource(id = R.color.colorPrimary)
  )
}

