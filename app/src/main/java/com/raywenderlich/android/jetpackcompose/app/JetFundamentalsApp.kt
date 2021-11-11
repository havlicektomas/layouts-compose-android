package com.raywenderlich.android.jetpackcompose.app

import androidx.compose.animation.Crossfade
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import com.raywenderlich.android.jetpackcompose.router.JetFundamentalsRouter
import com.raywenderlich.android.jetpackcompose.router.Screen
import com.raywenderlich.android.jetpackcompose.screens.*

@Composable
fun JetFundamentalsApp() {
  Surface(color = MaterialTheme.colors.background) {
    Crossfade(targetState = JetFundamentalsRouter.currentScreen) { screenState ->
      when (screenState.value) {
        is Screen.Navigation -> NavigationScreen()
        is Screen.Row -> RowScreen()
        is Screen.Column -> ColumnScreen()
        is Screen.Box -> BoxScreen()
        is Screen.Surface -> SurfaceScreen()
        is Screen.Scaffold -> ScaffoldScreen()
      }
    }
  }
}