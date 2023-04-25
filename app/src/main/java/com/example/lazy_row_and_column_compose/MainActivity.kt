package com.example.lazy_row_and_column_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lazy_row_and_column_compose.Model.LazyData
import com.example.lazy_row_and_column_compose.ui.theme.Lazy_Row_and_Column_ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lazy_Row_and_Column_ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun MainDisplay(){
    Column(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            //Section 1

            //Title
            Text(
                text = "Implementing Lazy Row",
                fontSize = 25.sp,
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(16.dp)
            )

            //Lazy Row Code here

        }

        Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            //Section 2

            //Title
            Text(
                text = "Implementing Lazy Column",
                fontSize = 25.sp,
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(16.dp)
            )

            //Lazy Column Code Here
            
        }
    }
}
@Composable
fun LazyCard(testText:LazyData){
    Card(elevation = CardDefaults.cardElevation(20.dp), modifier = Modifier.padding(10.dp)) {
        Box(modifier = Modifier
            .width(150.dp)
            .height(200.dp)) {
            Text(text = stringResource(id = testText.StringData))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lazy_Row_and_Column_ComposeTheme {
//        Greeting("Android")
        MainDisplay()
    }
}