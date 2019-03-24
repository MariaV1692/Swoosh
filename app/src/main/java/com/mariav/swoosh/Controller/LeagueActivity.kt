package com.mariav.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import com.mariav.swoosh.Model.Player
import com.mariav.swoosh.R
import com.mariav.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {


    var player: Player? = Player()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    override fun onSaveInstanceState(outState: Bundle?, outPersistentState: PersistableBundle?) {
        super.onSaveInstanceState(outState, outPersistentState)
        outState?.putParcelable(EXTRA_PLAYER,player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState != null){
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    fun onTglMansClick(view: View) {
        tglWomen.isChecked = false
        tglCo.isChecked = false
        if(tglMens.isChecked){
            player?.league = "mans"
        }else{
            player?.league = null
        }
    }

    fun onTglWomansClick(view: View) {
        tglMens.isChecked = false
        tglCo.isChecked = false
        if(tglWomen.isChecked){
            player?.league = "womans"
        }else{
            player?.league = null
        }
    }

    fun onTglCoClick(view: View) {
        tglMens.isChecked = false
        tglWomen.isChecked = false
        if(tglCo.isChecked){
            player?.league = "co"
        }else{
            player?.league = null
        }
    }

    fun onBtnNextClick(view: View) {
        if(player?.league != null){
            val SkillIntend = Intent(this, SkillActivity::class.java)
            /*We can transfer data to intend by using extra*/
            SkillIntend.putExtra(EXTRA_PLAYER,player)
            startActivity(SkillIntend)
        }else{
            val alert = Toast.makeText(this,"Please select a league",Toast.LENGTH_SHORT)
            alert.show()
        }
    }
}
