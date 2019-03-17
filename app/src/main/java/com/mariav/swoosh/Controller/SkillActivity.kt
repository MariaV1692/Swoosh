package com.mariav.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.mariav.swoosh.Utilities.EXTRA_LEAGUE
import com.mariav.swoosh.R
import com.mariav.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league: String = ""
    var skill_level: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        /*Access to extra data that we've transferred with intend*/
        league = intent.getStringExtra(EXTRA_LEAGUE)
    }

    fun onTglBegginerClick(view: View) {
        tglBaller.isChecked = false
        if(tglBegginer.isChecked){
            skill_level = "beginner"
        }else{
            skill_level = ""
        }
    }

    fun onTglBallerClick(view: View) {
        tglBegginer.isChecked = false
        if(tglBaller.isChecked){
            skill_level = "baller"
        }else{
            skill_level = ""
        }
    }

    fun onBtnFinishClick(view: View) {
        if(league.isNotEmpty() && skill_level.isNotEmpty()){
            val finishScreen = Intent(this,FinishActivity::class.java)
            finishScreen.putExtra(EXTRA_LEAGUE,league)
            finishScreen.putExtra(EXTRA_SKILL,skill_level)
            startActivity(finishScreen)
        }else{
            val alert = Toast.makeText(this,"Missing league or skill level",Toast.LENGTH_SHORT)
            alert.show()
        }
    }

}
