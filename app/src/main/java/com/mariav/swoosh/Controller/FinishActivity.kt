package com.mariav.swoosh.Controller

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.mariav.swoosh.R
import com.mariav.swoosh.Utilities.EXTRA_LEAGUE
import com.mariav.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        txtLeague.text = "Looking for a ${intent.getStringExtra(EXTRA_LEAGUE)} " +
                "in ${intent.getStringExtra(EXTRA_SKILL)} league near you…"
    }
}
