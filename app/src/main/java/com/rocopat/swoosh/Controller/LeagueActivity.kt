package com.rocopat.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import com.rocopat.swoosh.Model.Player
import com.rocopat.swoosh.R
import com.rocopat.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("", "")

    override fun onSaveInstanceState(outState: Bundle?, outPersistentState: PersistableBundle?) {
        super.onSaveInstanceState(outState, outPersistentState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null){
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }
     fun onCoedClicked (view: View){
         btnMens.isChecked = false
         btnWomens.isChecked = false
         player.league = "co-ed"
     }

    fun onWomensClicked (view: View) {
        btnCoed.isChecked = false
        btnMens.isChecked = false
        player.league = "womens"
    }

    fun onMensClicked (view: View) {
        btnCoed.isChecked = false
        btnWomens.isChecked = false
        player.league = "mens"
    }

    fun leagueNextClicked (view: View){
        if (player.league != ""){
            val skillActivity = Intent (this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a league", Toast.LENGTH_LONG).show()
        }
    }
}
