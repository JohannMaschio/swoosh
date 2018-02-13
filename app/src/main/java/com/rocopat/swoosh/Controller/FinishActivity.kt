package com.rocopat.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.rocopat.swoosh.Model.Player
import com.rocopat.swoosh.R
import com.rocopat.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*
import java.time.Instant

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
        searchTxt.text = "Looking for ${player.league} ${player.skill} skill league near you..."
    }
}
