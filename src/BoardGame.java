
public class BoardGame
{
    protected LinkedHashMap<String> playerPieces; 
    protected LinkedHashMap<String> playerLocations;
    
    public boolean addPlayer(String playerName, GamePiece gamePiece, Location intialLocation) {
        
    }
    
    public GamePiece getPlayerGamePiece(String playerName) {
        
    } 
    
    public String getPlayerWithGamePiece(GamePiece gamePiece) {
        
    }
    
    public void movePlayer(String playerName, Location newLocation ){
        
    }
    
    public String[] moveTwoPlayers(String[] playerNames , Location[] newLocations) {
        
    }
            
    public Location getPlayersLocation(String player){ 
        
    } 
    
    public ArrayList<String> getPlayersAtLocation(Location loc){
        return null;
    }
    
    public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc){
        
    } 
    
    public Set<String> getPlayers(){
        
    }
    
    public  Set<Location> getPlayerLocations(){
        
    }
    
    public Set<GamePiece> getPlayerPieces(){
        
    }
}
