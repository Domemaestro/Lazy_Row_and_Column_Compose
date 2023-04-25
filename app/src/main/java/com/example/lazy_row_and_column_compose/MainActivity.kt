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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lazy_row_and_column_compose.Data.DataSource
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
                    MainDisplay()
                }
            }
        }
    }
}

@Composable
fun MainDisplay(){
    Column(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp), horizontalAlignment = Alignment.CenterHorizontally) {
            //Section 1

            //Title
            Text(
                text = "Implementing Lazy Row -->",
                fontSize = 25.sp,
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(16.dp)
            )

            //Lazy Row Code here
            LazyRow(lazyList = DataSource().loadFun())
        }

        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp), horizontalAlignment = Alignment.CenterHorizontally) {
            //Section 2

            //Title
            Text(
                text = "Implementing Lazy Column v",
                fontSize = 25.sp,
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(16.dp)
            )

            //Lazy Column Code Here
            LazyCol(lazyList = DataSource().loadFun())
        }
    }
}

//CardView ------------------------------------
@Composable
fun LazyCard(testText:LazyData){
    Card(elevation = CardDefaults.cardElevation(20.dp), modifier = Modifier.padding(10.dp)) {
        Box(modifier = Modifier
            .width(150.dp)
            .height(200.dp), contentAlignment = Alignment.Center) {
            Text(
                text = stringResource(id = testText.StringData),
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

//Lazy Column Implementation
@Composable
private fun LazyCol(lazyList:List<LazyData>){
    LazyColumn{
        items(lazyList){
            dispText -> LazyCard(testText = dispText)
        }
    }

}

//Lazy Row Implementation
@Composable
private fun LazyRow(lazyList:List<LazyData>){
    androidx.compose.foundation.lazy.LazyRow{
        items(lazyList){
            dispRow -> LazyCard(testText = dispRow)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lazy_Row_and_Column_ComposeTheme {
//        Greeting("Android")
        MainDisplay()
//        LazyCard(testText = LazyData(R.string.test1))
    }
}