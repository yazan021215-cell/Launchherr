
package net.power.launcher

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.statusBarColor = Color.rgb(8, 8, 8)
        window.navigationBarColor = Color.rgb(8, 8, 8)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setPadding(30, 30, 30, 30)
        layout.setBackgroundColor(Color.rgb(8, 8, 8))

        val logo = TextView(this)
        logo.text = "⚡ POWER"
        logo.textSize = 36f
        logo.setTextColor(Color.YELLOW)
        logo.gravity = Gravity.CENTER

        val subtitle = TextView(this)
        subtitle.text = "MINECRAFT JAVA LAUNCHER"
        subtitle.setTextColor(Color.WHITE)
        subtitle.gravity = Gravity.CENTER

        val play = Button(this)
        play.text = "PLAY"
        play.setOnClickListener {
            Toast.makeText(this, "POWER Launcher!", Toast.LENGTH_SHORT).show()
        }

        layout.addView(logo)
        layout.addView(subtitle)
        layout.addView(play)

        setContentView(layout)
    }
}
