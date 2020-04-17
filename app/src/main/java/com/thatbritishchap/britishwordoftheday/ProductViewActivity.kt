package com.thatbritishchap.britishwordoftheday

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.util.Log.d
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.android.synthetic.main.product_view.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.net.URL

class ProductViewActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.product_view)

//        todo add this back in
//        val preferences =  getSharedPreferences("database", Context.MODE_PRIVATE)
//        val savedName = preferences.getString("savedProductName", "this value doesn't exist")
//        Log.d("itemListActivity", "msg: $savedName")
//        lastSavedProduct.text = savedName
//        https://finepointmobile.com/api/inventory/v1/message
        lifecycleScope.launch(Dispatchers.Default) {
            val specialMessage = URL("https://finepointmobile.com/api/inventory/v1/message").readText()
            d("carlo", "Here's the money: $specialMessage")
            lastSavedProduct.text = specialMessage
        }
    }
}