package com.example.runmate

import androidx.compose.animation.core.VisibilityThreshold
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp




@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Login(modifier: Modifier){


    var Email by remember { mutableStateOf(" ") }
    var Password by remember { mutableStateOf(" ") }


    Column(modifier = Modifier
        .fillMaxSize()
        .background(
            brush = Brush.linearGradient(
                colorStops = arrayOf(
                    0.1f to Color.White.copy(alpha = 0.8f),       // Start with black at the beginning
                    0.6f to Color.Black.copy(alpha = 0.1f)        // Keep black for 30% of the gradient
                    ),
                start = androidx.compose.ui.geometry.Offset(0f, 0f),
                end = androidx.compose.ui.geometry.Offset.Infinite
            )
        )
    ) {





        Spacer(Modifier.padding(50.dp))
        Text("Welcome!",
            fontWeight = FontWeight.Bold,
            fontSize = 32.sp,
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally))
        Spacer(Modifier.padding(30.dp))
        Card(
            colors = CardDefaults.cardColors(containerColor = Color.Gray),
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .width(330.dp)
                .height(480.dp)
        ) {
            Spacer(Modifier.padding(25.dp))
            TextField(value = Email,
                onValueChange = {newText -> Email = newText},
                label = { Text("Email ID",
                    color = Color.Black,
                    fontSize = 15.sp)},
                leadingIcon = { Text("@",
                    fontSize = 20.sp,
                    color = Color.Black)},
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = colorResource(R.color.Applime2),
                    unfocusedBorderColor = colorResource(R.color.Applime2),     // Border color when unfocused
                    errorBorderColor = Color.Red,
                ),
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally))
            Spacer(Modifier.padding(15.dp))
            TextField(value = Password,
                onValueChange = {newText -> Password = newText},
                label = { Text("Password",
                    fontSize = 15.sp,
                    color = Color.Black)},
                leadingIcon = { Icon(
                    painter = painterResource(R.drawable.password),
                    contentDescription = null,
                    tint = Color.Black
                )},
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = colorResource(R.color.Applime2),
                    unfocusedBorderColor = colorResource(R.color.Applime2),
                    errorBorderColor = Color.Red,
                ),
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)
                    .width(297.dp))
            Spacer(Modifier.padding(5.dp))
            Text("Forget Password ?",
                modifier = Modifier.
                align(alignment = Alignment.End)
                    .padding(end = 25.dp),
                fontSize = 15.sp,
            color = colorResource(R.color.forget_password))
            Spacer(Modifier.padding(10.dp))
            Button(onClick = { },
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(R.color.Applime2)),
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)
                    .width(297.dp)
                    .height(57.dp)) {
                Text("Log in",
                    fontSize = 24.sp,
                    modifier = Modifier,
                    color = Color.Black)
            }
            Spacer(Modifier.padding(6.dp))
            Text("Or",
                fontSize = 20.sp,
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally))
            Spacer(Modifier.padding(6.dp))
            Button(onClick = { },
                colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)
                    .width(297.dp)
                    .height(57.dp)) {
                Row {
                    Icon(painter = painterResource(R.drawable.googlelogo),
                        contentDescription = "Google Logo",
                        modifier = Modifier
                            .size(35.dp))
                    Text(
                        "Continue with google",
                        fontSize = 17.sp,
                        modifier = Modifier
                            .padding(top = 5.dp),
                        color = Color.Black)
                }
            }
            Spacer(Modifier.padding(25.dp))
        }
        Spacer(Modifier.padding(15.dp))
        Text("Don't have an account ?",
            fontSize = 16.sp,
            color = Color.White,
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally))
        Spacer(Modifier.padding(5.dp))
        Text("Sign up",
            fontSize = 16.sp,
            color = colorResource(R.color.forget_password),
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally))
    }
}




@Preview
@Composable
fun b(){
    Login(modifier = Modifier)
}


