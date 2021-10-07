package Jannat;

public class Cricket {
    String matchType;
    int over;
    Player player;
    Cricket(String matchType, int over, Player player)
    {
        this.matchType = matchType;
        this.over = over;
        this.player = player;
    }

    void display()
    {
        System.out.println(" Type of the match: " +matchType);
        System.out.println("Over of the match: " +over);
        System.out.println("The  player name is: " +player.playerName);
        System.out.println("Jersey number of the player: " +player.jerseyNumber);
    }
}
//Name: Nurany Janat Jenny
//ID: 2012020154
//Section: D
//Email: cse_2012020154@lus.ac.bd
//Date: 11-09-2021
