
public class GamePieceAppearance
{
    Color color;
    Shape shape;
    
    public GamePieceAppearance(Color color, Shape shape) {
        this.color = color;
        this.shape = shape;
    }
    
    public Color getColor() {
        return this.color;
    }
    
    public Shape getShape(){
        return this.shape; 
    }
}
