import de.gurkenlabs.litiengine.Game;
import hygienegame.Globals;
import hygienegame.screens.GameScreen;

public class Program {
    // ctrl + option + o to remove unused import statements
    // red indicates that the import statement needs to be used
    public static void main(String[] args) {
        Game.info().setName("The Hygiene Game");
        Game.info().setSubTitle("by Abigayle and Elle");

        Game.init(args);

        Game.screens().add(new GameScreen(Globals.GAME_SCREEN));
        Game.screens().display(Globals.GAME_SCREEN);
        Game.world().camera().setFocus(200, 200);

        Game.start();
    }
}
