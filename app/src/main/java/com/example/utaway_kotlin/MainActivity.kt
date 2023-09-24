package com.example.utaway_kotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.utaway_kotlin.ui.theme.Сutaway_kotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Сutaway_kotlinTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Column(
        modifier
            .fillMaxSize()
            .background(Color(0xFFd2e8d4)),  horizontalAlignment = Alignment.CenterHorizontally) {
        Performance(
            Modifier
                .fillMaxWidth()
                .weight(0.5f))
        Contacts(
            Modifier
                .fillMaxWidth()
                .weight(0.5f))
    }
}

//verticalArrangement = Arrangement.SpaceBetween,

@Composable
fun Performance(modifier: Modifier = Modifier) {
    Column(modifier, horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Bottom) {
        Image(
            painter = painterResource(id = R.drawable.android),
            contentDescription = null,
            contentScale = ContentScale.None
        )
        Text(
            text = stringResource(R.string.name_text),
            fontSize = 32.sp,
            modifier = Modifier.padding(0.dp,0.dp,0.dp,16.dp),
            fontWeight = FontWeight.Light
        )
        Text(
            text = stringResource(R.string.desc_text),
            color = Color(0xFF107444),
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun Contacts(modifier: Modifier = Modifier) {
    Column(modifier.padding(32.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Bottom) {
        Text(
            text = "e.funikov.work@gmail.com",
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(0.dp, 8.dp)
        )
        Text(
            text = "@Zentozzz",
            fontWeight = FontWeight.SemiBold,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Сutaway_kotlinTheme {
        Greeting()
    }
}