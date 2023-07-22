package com.ad_coding.widgetcourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.glance.appwidget.lazy.LazyColumn
import androidx.glance.appwidget.lazy.itemsIndexed
import com.ad_coding.widgetcourse.ui.theme.WidgetCourseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WidgetCourseTheme {

            }
        }
    }
}

@Composable
fun MyScreen() {
    val nameList = listOf(
        "Daniel Atitienei",
        "John Doe"
    )
    LazyColumn {
        itemsIndexed(nameList) { index, item ->
            Text(text = item)
        }
    }
}