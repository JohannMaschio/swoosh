package com.rocopat.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.rocopat.swoosh.Utilities.EXTRA_LEAGUE
import com.rocopat.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }
     fun onCoedClicked (view: View){
         btnMens.isChecked = false
         btnWomens.isChecked = false
         selectedLeague = "co-ed"
     }

    fun onWomensClicked (view: View) {
        btnCoed.isChecked = false
        btnMens.isChecked = false
        selectedLeague = "womens"
    }

    fun onMensClicked (view: View) {
        btnCoed.isChecked = false
        btnWomens.isChecked = false
        selectedLeague = "mens"
    }

    fun leagueNextClicked (view: View){
        if (selectedLeague != ""){
            val skillActivity = Intent (this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a league", Toast.LENGTH_LONG).show()
        }


    }
}
