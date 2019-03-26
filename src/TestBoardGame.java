import org.junit.Assert;
import org.junit.Test;

public class TestBoardGame
{

    @Test
    public void testBoardGame()
    {
       BoardGame game = new BoardGame();
        
       game.addPlayer("Augusto", GamePiece.BLUE_BOOT, Location.HALL);
       game.addPlayer("Pedro", GamePiece.MAGENTA_RACER, Location.STUDY);
       
       Assert.assertEquals(GamePiece.BLUE_BOOT,game.getPlayerGamePiece("Augusto"));
       Assert.assertEquals(Location.HALL,game.getPlayersLocation("Augusto"));
       Assert.assertEquals("Augusto",game.getPlayerWithGamePiece(GamePiece.BLUE_BOOT));
       
       game.movePlayer("Augusto", Location.BALLROOM);
       Assert.assertEquals(Location.BALLROOM,game.getPlayersLocation("Augusto"));
    
       //game.moveTwoPlayers(playerNames, newLocations);
    }

}
