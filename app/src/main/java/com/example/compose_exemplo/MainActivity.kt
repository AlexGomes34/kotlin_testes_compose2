package com.example.compose_exemplo

import android.R
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
    var corFunda by remember {
        mutableStateOf(Color.Green)
    }
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(corFunda)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(30.dp)
    ) {
        var favoDeMel by remember {
            mutableStateOf(false)
        }
        var nome by remember {
            mutableStateOf("")
        }
        var idade by remember {
            mutableStateOf("")
        }
        var email by remember {
            mutableStateOf("")
        }
        var jetpack by remember {
            mutableStateOf(false)
        }

        var temple by remember {
            mutableStateOf(false)
        }
//        var ios by remember {
//            mutableStateOf(false)
//        }
//        var android by remember {
//            mutableStateOf(false)
//        }
//        var xiomi by remember {
//            mutableStateOf(false)
//        }
//        var wPhone by remember {
//            mutableStateOf(false)
//        }

        var sOperacional by remember{
            mutableStateOf("ios")
        }
//
//        Spacer(modifier = Modifier.height(20.dp))
//        TextField(
//            value = nome,
//            onValueChange = {
//                novoValor ->
//                nome = novoValor
//            },
//            keyboardOptions = KeyboardOptions(
//                capitalization = KeyboardCapitalization.Words
//            ),
//            label = {
//                Text(text = "Nome e Sobrenome")
//            },
//            placeholder = {
//                Text(text = "Digite Seu Nome")
//            },
//            leadingIcon = {
//                Icon(imageVector = Icons.Default.Person, contentDescription = "icone de pessoa", tint = Color(8, 68, 166, 255))
//            },
//            colors = TextFieldDefaults.colors(
//                focusedTextColor = Color.Magenta,
//                unfocusedTextColor = Color.Blue,
//                focusedPlaceholderColor = Color.Red
//            )
//        )
//
//        TextField(
//            value = idade,
//            onValueChange = {
//                novoValor ->
//                idade = novoValor
//            },
//            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
//            label = {
//                Text(text = "Idade")
//            },
//            trailingIcon = {
//                Icon(imageVector = Icons.Default.Face, contentDescription = "icone de pessoa", tint = Color(8, 68, 166, 255))
//            },
//            colors = TextFieldDefaults.colors(
//                focusedTextColor = Color.Magenta,
//                unfocusedTextColor = Color.Blue,
//                focusedPlaceholderColor = Color.Red
//            )
//
//        )
//
//        OutlinedTextField(
//            value = email,
//            onValueChange = {
//                email = it
//            },
//            singleLine = true,
//            placeholder = {
//                Text(text = "digite seu email")
//            },
//            shape = RoundedCornerShape(
//                topStart = 20.dp,
//                bottomEnd = 20.dp
//            ),
//            label = {
//                Text(text = "email")
//            },
//            colors = OutlinedTextFieldDefaults.colors(
//                focusedTextColor = Color.Magenta,
//                unfocusedTextColor = Color.Blue,
//                focusedPlaceholderColor = Color.Red,
//                focusedBorderColor = Color.Magenta,
//                unfocusedBorderColor = Color.LightGray
//            )
//        )

//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(horizontal = 10.dp),
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            Checkbox(
//            jetpack,
//            onCheckedChange = {
//                jetpack = it
//            },
//                colors = CheckboxDefaults.colors(
//                    checkedColor = Color.Green,
//                    uncheckedColor = Color.Red
//                )
//        )
//            Text(text = "Jetpack JOYRIDE")
//        }
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(horizontal = 10.dp),
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            Checkbox(
//                temple,
//                onCheckedChange = {
//                    temple = it
//                },
//                colors = CheckboxDefaults.colors(
//                    checkedColor = Color.Green,
//                    uncheckedColor = Color.Red
//                )
//            )
//            Text(text = "Temple Run")
//        }
        Text(text = "Qual o telefone mais tchola?")
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp)
        ) {
            RadioButton(
                selected = sOperacional == "wPhone",
                onClick = {
                    sOperacional = "wPhone"

                }
            )
            Text(text = "wPhone")
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp)
        ) {
            RadioButton(
                selected = sOperacional == "android",
                onClick = {
                    sOperacional = "android"

                }
            )
            Text(text = "android")
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp)
        ) {
            RadioButton(
                selected = sOperacional == "ios",
                onClick = {
                    sOperacional = "ios"

                }
            )
            Text(text = "ios")
        }
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Button(
                onClick = {
                     corFunda = Color.Cyan
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Red,
                    contentColor = Color.Black
                ),
                border = BorderStroke(width = 4.dp, Color.Cyan),
                shape = RoundedCornerShape(topEnd = 20.dp, bottomStart = 20.dp)
            ) {
                Text(text = "Clique Aqui")
                Icon(
                    imageVector = Icons.Default.Build,
                    contentDescription = "Maçaneta"
                )
            }

            OutlinedButton(
                onClick = {
                    corFunda = Color.Black
                }
            ) {
                Text(text = "Não, se mate")
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            if(favoDeMel){
                Icon(
                    modifier = Modifier
                        .size(40.dp)
                        .clickable{
                            favoDeMel = false
                        },
                    imageVector = Icons.Default.Favorite,
                    contentDescription = "corazao"
                )
            }else{
                Icon(
                    modifier = Modifier
                        .size(40.dp)
                        .clickable{
                            favoDeMel = true
                        },
                    imageVector = Icons.Default.FavoriteBorder,
                    contentDescription = "corazao triste"
                )
            }
        }

    }
}