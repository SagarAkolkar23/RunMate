package com.example.runmate

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@SuppressLint("ResourceAsColor")
@Composable
fun Splash(){
    Box {
        Image(
            painter = painterResource(R.drawable.splash_screen_image),
            contentDescription = "Background",
            modifier = Modifier
                .fillMaxSize()
                .alpha(0.60f),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Text(
                "RunMate",
                fontSize = 40.sp,
                //fontFamily = FontFamily(Font(R.font.anton)),
                color = Color.White,
                modifier = Modifier
                    .padding(top = 530.dp)
                    .align(alignment = Alignment.CenterHorizontally)
            )
            Spacer(Modifier.padding(10.dp))
            Text(
                "Track your runs, set your \ngoals, and crush every \nmile.",
                textAlign = TextAlign.Center,
                fontSize = 24.sp,
                color = Color.White,
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)
            )
            Spacer(Modifier.padding(15.dp))
            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(R.color.Applime2),
                    contentColor = Color.Black
                ),
                modifier = Modifier
                    .height(60.dp)
                    .width(331.dp)
                    .align(alignment = Alignment.CenterHorizontally)
            ) {
                Text(
                    "Let's Start",
                    fontSize = 30.sp,
                    modifier = Modifier
                        .align(alignment = Alignment.CenterVertically)
                )
            }
        }
    }
}

@Preview
@Composable
fun h(){
    Splash()
}