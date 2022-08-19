package com.jayasuryat.dowel.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.jayasuryat.dowel.sample.ui.home.HomeScreen
import com.jayasuryat.dowel.sample.ui.theme.DowelTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            DowelTheme {
                HomeScreen(
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }
}