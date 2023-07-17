package com.eduardo.appmobile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.eduardo.appmobile.ui.theme.AppMobileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppMobileTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    LoginContent()
                }
            }
        }
    }
}

@Composable
fun LoginContent(){
    Box(modifier = Modifier.fillMaxSize()){
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.logo_golosinas),
            contentDescription = "Imagen de fondo",
            contentScale = ContentScale.Crop,
            colorFilter = ColorFilter.colorMatrix(ColorMatrix().apply {
                setToScale( redScale = 0.5f, greenScale = 0.5f, blueScale = 0.5f, alphaScale = 0.85f)
            })
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 70.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier
                    .height(170.dp)
                    .width(170.dp),
                painter = painterResource(id = R.drawable.golosinas),
                contentDescription = "Logo"
            )
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 7.dp),
                text = "Bienvenidos a                                      EL MUNDO AZUCARADO",
                fontWeight = FontWeight.Bold,
                color = Color.White,
                fontSize = 22.sp,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.weight(1f))
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(330.dp),
                shape = RoundedCornerShape(
                    topEnd = 40.dp,
                    topStart = 40.dp
                ),
                backgroundColor = Color.White.copy(alpha = 0.7f)
            ) {
                Column(
                    modifier = Modifier
                        .padding(top = 30.dp, end = 30.dp, start = 30.dp)
                        .verticalScroll(rememberScrollState())
                ){
                    Text(
                        modifier = Modifier.padding(bottom = 20.dp),
                        text = "INGRESAR",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.Black,
                    )
                    TextField(
                        modifier = Modifier.fillMaxWidth(),
                        value = "state.email",
                        onValueChange = {},
                        label = {
                            Text(text = "Correo Electrónico")
                        }
                    )
                    TextField(
                        modifier = Modifier.fillMaxWidth(),
                        value = "state.email",
                        onValueChange = {},
                        label = {
                            Text(text = "Contraseña")
                        }
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Button(
                        modifier = Modifier.fillMaxWidth(),
                        onClick = { /*TODO*/ }
                    ) {
                        Text(text = "LOGIN")
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 20.dp),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "¿No tienes cuenta?",
                        )
                        Spacer(modifier = Modifier.width(10.dp))
                        Text(
                            modifier = Modifier.clickable {  },
                            text = "Regístrate",
                            color = Color.Blue,
                        )
                    }


                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    AppMobileTheme {
        Greeting("Android")
    }
}