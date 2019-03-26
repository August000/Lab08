import org.junit.Assert;
import org.junit.Test;

public class TestBoardGame
{

    @Test
    public void test()
    {
       BoardGame game = new BoardGame();
        
       game.addPlayer("Augusto", GamePiece.BLUE_BOOT, Location.HALL);
       game.addPlayer("Pedro", GamePiece.MAGENTA_RACER, Location.STUDY);
       
       Assert.assertEquals("Augusto",game.getPlayerWithGamePiece(GamePiece.BLUE_BOOT));
    }

}
