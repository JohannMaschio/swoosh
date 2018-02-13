package com.rocopat.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.rocopat.swoosh.Model.Player
import com.rocopat.swoosh.R
import com.rocopat.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }
    fun onBeginnerClick (view: View){
        btnBaller.isChecked = false
        player.skill = "beginner"
    }
    fun onBallerClick (view: View){
        btnBeginner.isChecked = false
        player.skill = "baller"
    }

    fun onFinishClicked (view: View){
        if (player.skill != ""){
            val finishActivity = Intent (this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Selecte a skill level...",Toast.LENGTH_SHORT).show()
        }
    }
}
