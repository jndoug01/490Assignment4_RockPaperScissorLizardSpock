package com.wesleyreisz.rockpaperscissors.Game;

import com.wesleyreisz.rockpaperscissors.GameUtils;
import com.wesleyreisz.rockpaperscissors.R;
public class Spock implements GameType{

    @Override
    public String eval(Integer opponentChoice) {
        if (opponentChoice== R.id.btnScissors)||(opponentChoice == R.id.btnRock){
            return GameUtils.BEATS;
        }else if (opponentChoice==R.id.btnPaper)||(opponentChoice == R.id.btnLizard){
            return GameUtils.LOSES_TO;
        }
        else{
            return GameUtils.TIES;
        }
    }
}