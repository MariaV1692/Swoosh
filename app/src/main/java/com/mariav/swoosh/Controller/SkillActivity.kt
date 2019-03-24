package com.mariav.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import com.mariav.swoosh.Model.Player
import com.mariav.swoosh.R
import com.mariav.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {


    private var player:Player? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        /*Access to extra data that we've transferred with intend*/
        player = intent.getParcelableExtra(EXTRA_PLAYER)
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

    fun onTglBegginerClick(view: View) {
        tglBaller.isChecked = false
        if(tglBegginer.isChecked){
            player?.skill = "beginner"
        }else{
            player?.skill = null
        }
    }

    fun onTglBallerClick(view: View) {
        tglBegginer.isChecked = false
        if(tglBaller.isChecked){
            player?.skill = "baller"
        }else{
            player?.skill = null
        }
    }

    fun onBtnFinishClick(view: View) {
        if(player?.league != null && player?.skill != null){
            val finishScreen = Intent(this,FinishActivity::class.java)
            finishScreen.putExtra(EXTRA_PLAYER,player)
            startActivity(finishScreen)
        }else{
            val alert = Toast.makeText(this,"Missing league or skill level",Toast.LENGTH_SHORT)
            alert.show()
        }
    }

}
