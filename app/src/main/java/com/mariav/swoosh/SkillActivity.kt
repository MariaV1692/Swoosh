package com.mariav.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class SkillActivity : BaseActivity() {

    var league: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        /*Access to extra data that we've transferred with intend*/
        league = intent.getStringExtra(EXTRA_LEAGUE)
    }
}
