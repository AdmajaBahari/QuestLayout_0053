package com.example.questlayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.questlayout.ui.theme.QuestLayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuestLayoutTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    ActivitasPertama()
                }
            }
        }
    }
}