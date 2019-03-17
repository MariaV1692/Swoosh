package com.mariav.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import com.mariav.swoosh.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnStart.setOnClickListener {
            val leagueIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}
