import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.junit.*;

public class TestBoardGame{
    
    /*--------------------------TestBoardGame---------------------------*/
    
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
       
       String[] players = new String[2];
       players[0] = "Augusto";
       players[1] = "Pedro";
       
       Location[] locations = new Location[2];
       locations[0] = Location.CONSERVATORY;
       locations[1] = Location.CONSERVATORY;
       
       game.moveTwoPlayers(players, locations);
       Assert.assertEquals(Location.CONSERVATORY,game.getPlayersLocation("Augusto"));
       Assert.assertEquals(Location.CONSERVATORY,game.getPlayersLocation("Pedro"));
       
       players[0] = "Pedro";
       players[1] = "Augusto";
       
       game.moveTwoPlayers(players, locations);
       Assert.assertEquals(Location.CONSERVATORY,game.getPlayersLocation("Augusto"));
       Assert.assertEquals(Location.CONSERVATORY,game.getPlayersLocation("Pedro"));
       
       //Test Arrays
       ArrayList<String> playersAtLoc = new ArrayList<String>();
       playersAtLoc.add("Augusto");
       playersAtLoc.add("Pedro");
       Assert.assertEquals( playersAtLoc,game.getPlayersAtLocation(Location.CONSERVATORY));
       
       ArrayList<GamePiece> piecesAtLoc = new ArrayList<>();
       piecesAtLoc.add(GamePiece.BLUE_BOOT);
       piecesAtLoc.add(GamePiece.MAGENTA_RACER);
       Assert.assertEquals( piecesAtLoc,game.getGamePiecesAtLocation(Location.CONSERVATORY));
       
       game.addPlayer("Augusto", GamePiece.BLUE_BOOT, Location.HALL);
       
       //Test Sets
       Set<String>  totalPlayers = new HashSet<String>();
       totalPlayers.add("Augusto");
       totalPlayers.add("Pedro");
       
       for(String player: totalPlayers) {
           Assert.assertTrue(game.getPlayers().contains(player)) ;
       }
       
       Set<Location>  playersLocations = new HashSet<Location>();
       playersLocations.add(Location.CONSERVATORY);
      
       //Assert.assertTrue() ;
}
    
    /*-------------------------------TestEnum-----------------------------------------*/

    @Test
    public void testColor()
    {
        Color color = Color.RED;
        
        Assert.assertEquals(255, color.getR());
        Assert.assertEquals(0, color.getG());
        Assert.assertEquals(0, color.getB());
        
        color = Color.GREEN;
        
        Assert.assertEquals(0, color.getR());
        Assert.assertEquals(255, color.getG());
        Assert.assertEquals(0, color.getB());
        
        color = Color.BLUE;
        
        Assert.assertEquals(0, color.getR());
        Assert.assertEquals(0, color.getG());
        Assert.assertEquals(255, color.getB());
        
        color = Color.YELLOW;
        
        Assert.assertEquals(255, color.getR());
        Assert.assertEquals(255, color.getG());
        Assert.assertEquals(0, color.getB());
        
        color = Color.CYAN;
        
        Assert.assertEquals(0, color.getR());
        Assert.assertEquals(255, color.getG());
        Assert.assertEquals(255, color.getB());
        
        color = Color.MAGENTA;
        
        Assert.assertEquals(255, color.getR());
        Assert.assertEquals(0, color.getG());
        Assert.assertEquals(255, color.getB());
    }
   
    @Test
    public void testShape()
    {
        Shape s = Shape.RACECAR;
        Assert.assertEquals("RACECAR", s.toString());
         
        s = Shape.BOOT;
        Assert.assertEquals("BOOT", s.toString());
        
        s = Shape.THIMBLE;
        Assert.assertEquals("THIMBLE", s.toString());
    }
    
    @Test
    public void testLocation()
    {
        Location loc = Location.KITCHEN; 
        Assert.assertEquals("KITCHEN", loc.toString());
        
        loc = Location.CONSERVATORY;
        Assert.assertEquals("CONSERVATORY", loc.toString());
        
        loc = Location.DINING_ROOM;
        Assert.assertEquals("DINING_ROOM", loc.toString());
        
        loc = Location.BALLROOM; 
        Assert.assertEquals("BALLROOM", loc.toString());
        
        loc = Location.STUDY; 
        Assert.assertEquals("STUDY", loc.toString());
        
        loc = Location.HALL;
        Assert.assertEquals("HALL", loc.toString());
        
        loc = Location.LOUNGE; 
        Assert.assertEquals("LOUNGE", loc.toString());
        
        loc = Location.LIBRARY; 
        Assert.assertEquals("LIBRARY", loc.toString());
        
        loc = Location.BILLIARD_ROOM;
        Assert.assertEquals("BILLIARD_ROOM", loc.toString());
        
    }
    
    @Test
    public void testGamePieceAppearance(){
        
        GamePieceAppearance appearance = new GamePieceAppearance(Color.GREEN,Shape.THIMBLE);
        Assert.assertEquals( Color.GREEN, appearance.getColor());
        Assert.assertEquals( Shape.THIMBLE, appearance.getShape());
    }
    
    @Test
    public void testGamePiece()
    {
        
        GamePiece piece = GamePiece.RED_RACER;
        Assert.assertEquals( Color.RED, piece.getColor());
        Assert.assertEquals( Shape.RACECAR, piece.getShape());
        
        GamePiece piece2 = GamePiece.BLUE_RACER;
        Assert.assertEquals( Color.BLUE, piece2.getColor());
        Assert.assertEquals( Shape.RACECAR, piece2.getShape());
        
        //Priority comparison test
        Assert.assertEquals( GamePiece.RED_RACER, GamePiece.movesFirst(piece, piece2));
        Assert.assertEquals( GamePiece.RED_RACER, GamePiece.movesFirst(piece2, piece));
        
        piece = GamePiece.MAGENTA_RACER;
        Assert.assertEquals( Color.MAGENTA, piece.getColor());
        Assert.assertEquals( Shape.RACECAR, piece.getShape());
        
        piece = GamePiece.RED_THIMBLE;
        Assert.assertEquals( Color.RED, piece.getColor());
        Assert.assertEquals( Shape.THIMBLE, piece.getShape());
        
        piece = GamePiece.BLUE_BOOT;
        Assert.assertEquals( Color.BLUE, piece.getColor());
        Assert.assertEquals( Shape.BOOT, piece.getShape());
        
        piece = GamePiece.GREEN_BOOT;
        Assert.assertEquals( Color.GREEN, piece.getColor());
        Assert.assertEquals( Shape.BOOT, piece.getShape());
        
        piece = GamePiece.YELLOW_BOOT;
        Assert.assertEquals( Color.YELLOW, piece.getColor());
        Assert.assertEquals( Shape.BOOT, piece.getShape());
        Assert.assertEquals( "YELLOW_BOOT", piece.toString());
    }

}
