package com.mariav.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selected_league: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onTglMansClick(view: View) {
        tglWomen.isChecked = false
        tglCo.isChecked = false
        if(tglMens.isChecked){
            selected_league = "mans"
        }else{
            selected_league = ""
        }
    }

    fun onTglWomansClick(view: View) {
        tglMens.isChecked = false
        tglCo.isChecked = false
        if(tglWomen.isChecked){
            selected_league = "womans"
        }else{
            selected_league = ""
        }
    }

    fun onTglCoClick(view: View) {
        tglMens.isChecked = false
        tglWomen.isChecked = false
        if(tglCo.isChecked){
            selected_league = "co"
        }else{
            selected_league = ""
        }
    }

    fun onBtnNextClick(view: View) {
        if(selected_league != ""){
            val SkillIntend = Intent(this,SkillActivity::class.java)
            /*We can transfer data to intend by using extra*/
            SkillIntend.putExtra(EXTRA_LEAGUE,selected_league)
            startActivity(SkillIntend)
        }else{
            val alert = Toast.makeText(this,"Please select a league",Toast.LENGTH_SHORT)
            alert.show()
        }
    }
}
