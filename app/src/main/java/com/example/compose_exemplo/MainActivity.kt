package com.example.compose_exemplo

import android.R
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.compose_exemplo.ui.theme.Compose_exemploTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Compose_exemploTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ComponenteEstadoScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun BasicComponentsScreen(modifier: Modifier = Modifier){
    Column(
        modifier.fillMaxSize()
            .background(Color(239, 247, 207))
    ) {
        Text(text = "Aulas android",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF3DDC84),
            fontFamily = FontFamily.Serif,
            modifier = Modifier.background(Color.Magenta)
        )
        Text(text = "com Jetpack Compose",
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color(66, 133, 244))
    }
}

@Composable
fun ComponenteEstadoScreen(modifier: Modifier = Modifier){
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val nome = remember {
            mutableStateOf("")
        }
        val idade = remember {
            mutableStateOf("")
        }
        TextField(
            value = nome.value,
            onValueChange = {
                novoValor ->
                nome.value = novoValor
            },
            keyboardOptions = KeyboardOptions(
                capitalization = KeyboardCapitalization.Words
            ),
            label = {
                Text(text = "Nome e Sobrenome")
            },
            placeholder = {
                Text(text = "Digite Seu Nome")
            },
            leadingIcon = {
                Icon(imageVector = Icons.Default.Person, contentDescription = "icone de pessoa", tint = Color(8, 68, 166, 255))
            }
        )
        TextField(
            value = idade.value,
            onValueChange = {
                novoValor ->
                idade.value = novoValor
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            label = {
                Text(text = "Idade")
            },
            trailingIcon = {
                Icon(imageVector = Icons.Default.Face, contentDescription = "icone de pessoa", tint = Color(8, 68, 166, 255))
            }
        )
    }
}