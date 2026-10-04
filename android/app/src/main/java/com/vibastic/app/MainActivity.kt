package online.vibastic.e2eapk38972
import android.app.Activity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebSettings

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val wv = WebView(this)
        wv.settings.javaScriptEnabled = true
        wv.settings.domStorageEnabled = true
        wv.settings.cacheMode = WebSettings.LOAD_DEFAULT
        setContentView(wv)
        wv.loadUrl("file:///android_asset/www/index.html")
    }
}
