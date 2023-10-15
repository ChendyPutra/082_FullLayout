package com.example.praktikumpam_4

import android.graphics.fonts.FontStyle
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.ColorRes
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.ModifierLocalReadScope
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.praktikumpam_4.ui.theme.PraktikumPAM_4Theme
import java.nio.file.WatchEvent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PraktikumPAM_4Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TampilanUtama()
                }
            }
        }
    }
}

@Composable
fun TampilanUtama(){

    val image = painterResource(R.drawable.img)
    Box {
        Image(
            painter = image,
            contentDescription = "",
            contentScale = ContentScale.FillHeight,
            modifier = Modifier.fillMaxSize()
        )
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(20.dp), horizontalAlignment = Alignment.CenterHorizontally ) {
            Text(text = "Weather APP", fontSize = 40.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.padding(18.dp))
            BoxScreeen()
            Spacer(modifier = Modifier.padding(18.dp))
            Lokasi()
            Spacer(modifier = Modifier.padding(18.dp))
            BoxKeterangan()



        }

    }


}
@Composable
fun BoxScreeen() {
    Box(modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(20.dp))
        .background(colorResource(id = R.color.Light_Slate_Gray))) {
        Column (horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()){
                Image(painter = painterResource(id = R.drawable.img_bg), contentDescription = "", Modifier.size(250.dp) )
                Text(text = "Rain", fontSize = 30.sp, fontWeight = FontWeight.Bold)
            
        }
    }
}
@Composable
fun Lokasi(){
    Text(text = "24℃", fontSize = 50.sp, fontWeight = FontWeight.Bold)
    Row {
        Image(painter = painterResource(id = R.drawable.loc), contentDescription = "", Modifier.size(35.dp))
        Text(text = "Merauke", fontSize = 30.sp)
    }
    Text(text = "JL.Noari, Kabupaten Merauke, Provinsi Papua Selatan", textAlign = TextAlign.Center, color = Color.White)
}
@Composable
fun BoxKeterangan(){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(20.dp))
            .background(colorResource(id = R.color.Light_Slate_Gray))
            .height(200.dp)
    ) {
        Row (modifier = Modifier
            .align(Alignment.TopStart)){
            Column (modifier = Modifier.padding(vertical = 25.dp)) {
                Text(text = "Humidity", fontSize = 15.sp, modifier = Modifier.padding(horizontal = 38.dp))
                Text(text = "98%", fontSize = 25.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(horizontal = 45.dp))
            }
        }
        Row (modifier = Modifier
            .align(Alignment.BottomStart))
        {
            Column (modifier = Modifier.padding(vertical = 25.dp)) {
                Text(text = "Sunrise", fontSize = 15.sp, modifier = Modifier.padding(horizontal = 40.dp))
                Text(text = "05.00 AM", fontSize = 25.sp, fontWeight = FontWeight.Bold ,modifier = Modifier.padding(horizontal = 20.dp))
            }
        }
        Row (modifier = Modifier
            .align(Alignment.TopEnd))
        {
            Column (modifier = Modifier.padding(vertical = 25.dp)) {
                Text(text = "UV Index", fontSize = 15.sp, modifier = Modifier.padding(horizontal = 45.dp))
                Text(text = "9/10", fontSize = 25.sp, fontWeight = FontWeight.Bold ,modifier = Modifier.padding(horizontal = 50.dp))
            }
        }
        Row (modifier = Modifier
            .align(Alignment.BottomEnd))
        {
            Column (modifier = Modifier.padding(vertical = 25.dp)){
                Text(text = "Sunset", fontSize = 15.sp, modifier = Modifier.padding(horizontal = 55.dp))
                Text(text = "05.40 PM", fontSize = 25.sp, fontWeight = FontWeight.Bold ,modifier = Modifier.padding(horizontal = 20.dp))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PraktikumPAM_4Theme {
        TampilanUtama()
    }
}