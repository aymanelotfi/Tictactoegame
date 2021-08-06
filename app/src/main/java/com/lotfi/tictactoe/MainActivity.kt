package com.lotfi.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buzz(view: View) {
        val bu_selec:Button=view as Button
        var cellId=0
        when(bu_selec.id){
            R.id.b1-> cellId=1
            R.id.b2-> cellId=2
            R.id.b3-> cellId=3
            R.id.b4-> cellId=4
            R.id.b5-> cellId=5
            R.id.b6-> cellId=6
            R.id.b7-> cellId=7
            R.id.b8-> cellId=8
            R.id.b9-> cellId=9
        }
        Log.d("buzz",cellId.toString())
        playgame(cellId,bu_selec)
    }
    var activeplayer=1
    var player1=ArrayList<Int>()
    var player2=ArrayList<Int>()
  fun playgame(cellId:Int,bus:Button){
    if(activeplayer==1){

        bus.setBackgroundResource(R.color.teal_200)
        bus.text="O"
        player1.add(cellId)
        activeplayer=2
    }
      else{

        bus.setBackgroundResource(R.color.purple_200)
        bus.text="X"
        player2.add(cellId)
        activeplayer=1
    }
      bus.isEnabled=false
  }
}