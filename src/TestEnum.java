import org.junit.Assert;
import org.junit.Test;

public class TestEnum
{

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