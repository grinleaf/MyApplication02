package com.example.myapplication02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.WebChromeClient
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.myapplication02.databinding.ActivityWebviewBinding

class WebViewActivity : AppCompatActivity() {
    val binding by lazy { ActivityWebviewBinding.inflate(layoutInflater) }
    val uri by lazy { intent.data.toString() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val myWebView = WebView(this@WebViewActivity)
        setContentView(myWebView)

        binding.webview.apply {
//            loadUrl(uri)
            settings.javaScriptEnabled = false
            webChromeClient = WebChromeClient()
            webViewClient = WebViewClient()
            if(Intent.ACTION_VIEW.equals(intent.action)){
                val uri = intent.data
                if(uri != null){
                    val getUri = uri.toString()
                    val bridge = uri.getQueryParameter("bridge")
                    val key = uri.getQueryParameter("key")


                }
            }
//            {
//                override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
//                    val uri = request?.url.toString()
//                    if (uri.startsWith("http")) {
//                        Log.i("aaa", "http: $uri")
//                        return false
//                    }else if(uri.startsWith("wc:")){
//                        loadUrl(uri)
//                        Log.i("aaa", "wc: $uri")
//                        return true
//                    }
//                    return false
//                }
//            }
        }
    }
}