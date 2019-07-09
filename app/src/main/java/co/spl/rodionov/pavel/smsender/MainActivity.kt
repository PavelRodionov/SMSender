package co.spl.rodionov.pavel.smsender

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import co.spl.rodionov.pavel.smsender.view.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addFragment()
    }

    fun addFragment() {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainer, MainFragment())
            .commit()
    }
}
