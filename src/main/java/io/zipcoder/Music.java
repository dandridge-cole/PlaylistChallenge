package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
//        Integer newLoc=findSong(selection);
//        steps = Math.abs(newLoc - startIndex);
//        return Math.min(steps,playList.length-steps);
        if(playList[startIndex].equals(selection))return 0;
        Integer goingUp=startIndex;
        Integer goingDown=startIndex;
        for(int steps=1;steps<=playList.length/2;steps++){
            goingUp++;
            goingDown--;
            if(goingDown==-1)goingDown=playList.length-1;
            if(goingUp==playList.length)goingUp=0;
            if(playList[goingDown].equals(selection)||playList[goingUp].equals(selection))return steps;
        }
        return -1;
    }

    /* //this method assumed only one instance of selection
    public Integer findSong(String selection){
        for(int i=0;i<playList.length;i++){
            if(playList[i].equals(selection)) return i;
        }
        return -1;
    }
    */
}
