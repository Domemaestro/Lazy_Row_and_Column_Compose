package com.example.lazy_row_and_column_compose.Data

import com.example.lazy_row_and_column_compose.Model.LazyData

class DataSource() {
    fun loadFun():List<LazyData>{
        return listOf<LazyData>(
            //to be done
            LazyData("Test 1"),
            LazyData("Test 2"),
            LazyData("Test 3"),
            LazyData("Test 4"),
            LazyData("Test 5"),
            LazyData("Test 6"),
            LazyData("Test 7"),
            LazyData("Test 8"),
            LazyData("Test 9"),
            LazyData("Test 10"),

        )
    }
}