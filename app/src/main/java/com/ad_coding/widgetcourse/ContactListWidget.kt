package com.ad_coding.widgetcourse

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.glance.GlanceId
import androidx.glance.GlanceModifier
import androidx.glance.GlanceTheme
import androidx.glance.Image
import androidx.glance.ImageProvider
import androidx.glance.action.actionStartActivity
import androidx.glance.action.clickable
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.GlanceAppWidgetReceiver
import androidx.glance.appwidget.appWidgetBackground
import androidx.glance.appwidget.cornerRadius
import androidx.glance.appwidget.lazy.LazyColumn
import androidx.glance.appwidget.provideContent
import androidx.glance.background
import androidx.glance.layout.Alignment
import androidx.glance.layout.Box
import androidx.glance.layout.Row
import androidx.glance.layout.Spacer
import androidx.glance.layout.height
import androidx.glance.layout.padding
import androidx.glance.layout.width
import androidx.glance.material3.ColorProviders
import androidx.glance.text.Text
import com.ad_coding.widgetcourse.ui.theme.DarkColorScheme
import com.ad_coding.widgetcourse.ui.theme.LightColorScheme

object ContactListWidget : GlanceAppWidget() {

    override suspend fun provideGlance(context: Context, id: GlanceId) {
        provideContent {
            GlanceTheme(colors = colorScheme) {
                Widget()
            }
        }
    }

    @Composable
    private fun Widget() {
        Box(
            modifier = GlanceModifier
                .background(GlanceTheme.colors.background)
                .padding(15.dp)
                .cornerRadius(20.dp)
        ) {
            LazyColumn {
                items(10) {
                    Row(
                        modifier = GlanceModifier
                            .padding(
                                vertical = 10.dp,
                                horizontal = 5.dp
                            )
                            .clickable {
                                // Call the person
                            },
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            provider = ImageProvider(R.drawable.person),
                            contentDescription = null
                        )
                        Spacer(modifier = GlanceModifier.width(10.dp))
                        Text(text = "John Doe")
                    }
                }
            }
        }
    }
}

private val colorScheme = ColorProviders(
    light = LightColorScheme,
    dark = DarkColorScheme
)

class ContactListWidgetReceiver : GlanceAppWidgetReceiver() {
    override val glanceAppWidget: GlanceAppWidget
        get() = ContactListWidget
}