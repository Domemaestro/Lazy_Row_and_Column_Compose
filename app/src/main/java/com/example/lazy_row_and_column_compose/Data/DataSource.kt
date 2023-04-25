package com.example.lazy_row_and_column_compose.Data

import com.example.lazy_row_and_column_compose.Model.LazyData
import com.example.lazy_row_and_column_compose.R

class DataSource() {
    fun loadFun():List<LazyData>{
        return listOf<LazyData>(
            //to be done
           LazyData(R.string.test1),
            LazyData(R.string.test2),
            LazyData(R.string.test3),
            LazyData(R.string.test4),
            LazyData(R.string.test5),
            LazyData(R.string.test6),
            LazyData(R.string.test7),
            LazyData(R.string.test8),
            LazyData(R.string.test9),
            LazyData(R.string.test10),
            LazyData(R.string.test11),
            LazyData(R.string.test12),
            LazyData(R.string.test13),
            LazyData(R.string.test14),
            LazyData(R.string.test15),

        )
    }
}