import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class BoardGame
{
    protected LinkedHashMap<String, GamePiece> playerPieces; 
    protected LinkedHashMap<String, Location> playerLocations;
    
    public BoardGame(){
        playerPieces = new LinkedHashMap<String, GamePiece>();
        playerLocations =  new LinkedHashMap<String, Location>();
    }
    
    public boolean addPlayer(String playerName, GamePiece gamePiece, Location intialLocation) {
        
        if(playerPieces.containsKey(playerName)) {
            return false;
        }
        else {
            playerLocations.put(playerName, intialLocation);
            playerPieces.put(playerName, gamePiece);
            return true;
        }
       
    }
    
    public GamePiece getPlayerGamePiece(String playerName){
        return playerPieces.get(playerName);
    } 
    
    public Location getPlayersLocation(String playerName){ 
        return playerLocations.get(playerName);
    } 
   
    public void movePlayer(String playerName, Location newLocation){
        playerLocations.replace(playerName, newLocation);
    }
    
    public String getPlayerWithGamePiece(GamePiece gamePiece){
        
        String playerPiece = null;
        
        for(String player: playerPieces.keySet()) {
            if(playerPieces.get(player).equals(gamePiece)) {
                playerPiece = player;
            }
        }
        
        return playerPiece;
    }
    
    public String[] moveTwoPlayers(String[] playerNames , Location[] newLocations){
     
        String [] priorityArray = new  String [2];
        
        GamePiece priorityPiece = GamePiece.movesFirst(playerPieces.get(playerNames[0]), playerPieces.get(playerNames[1]));
        
        if(getPlayerWithGamePiece(priorityPiece).equals(playerNames[0])) {
            
            playerLocations.replace(playerNames[0], newLocations[0]);
            playerLocations.replace(playerNames[1], newLocations[1]);
            
            priorityArray[0] = playerNames[0];
            priorityArray[1] = playerNames[1];
        }
        else {
            
            playerLocations.replace(playerNames[1], newLocations[1]);
            playerLocations.replace(playerNames[0], newLocations[0]);
            
            priorityArray[0] = playerNames[1];
            priorityArray[1] = playerNames[0];
        }
        
        return priorityArray;
    }
            
    public ArrayList<String> getPlayersAtLocation(Location loc){
        
        ArrayList<String> playersAtLoc = new ArrayList<>();
        
        for(String player : playerLocations.keySet()) {
            if(playerLocations.get(player).equals(loc)) {
                playersAtLoc.add(player);
            }
        }
        
        return playersAtLoc;
    }
    
    public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc){
        
        ArrayList<GamePiece> PiecesAtLoc = new  ArrayList<GamePiece>();
        
        for(String player: getPlayersAtLocation(loc)) {
            PiecesAtLoc.add(playerPieces.get(player));
        }
        
        return PiecesAtLoc;
    } 
    
    public Set<String> getPlayers(){
        
        Set <String> players = new HashSet<>(); 
        
        for(String player : playerPieces.keySet()){
            players.add(player);
        }
        return players;
    }
    
    public  Set<Location> getPlayerLocations(){
        
        Set<Location> locations = new HashSet<>(); 
        
        for(String player : playerLocations.keySet()){
            locations.add(playerLocations.get(player));
        }
        
        return locations;
    }
    
    public Set<GamePiece> getPlayerPieces(){
        
        Set<GamePiece> pieces = new HashSet<>(); 
        
        for(String player : playerPieces.keySet()) {
            pieces.add(playerPieces.get(player));
        }
        
        return pieces;
    }
}
