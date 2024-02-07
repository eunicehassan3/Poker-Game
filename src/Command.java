import java.util.ArrayList;

public class Command {
    private String[] commandWords = {"start", "quit", "shuffle", "reveal" , "deal"};
    Command() {
    }
    public boolean isCommand(String command){
        for(int i = 0; i<commandWords.length; i++ ){
            commandWords[i].equalsIgnoreCase(command);
            return true;
        }
        return false;
    }

    public String getCommand(String command){
        for(int i = 0; i<commandWords.length; i++ ){
            commandWords[i].equalsIgnoreCase(command);
            return commandWords[i];
        }
        return "Invalid Command";
    }

}
