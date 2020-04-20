import de.gurkenlabs.litiengine.Game;
import de.gurkenlabs.litiengine.gui.screens.Resolution;
import hygienegame.Globals;
import hygienegame.screens.GameScreen;
import hygienegame.screens.MenuScreen;

public class Program {
    // ctrl + option + o to remove unused import statements
    // red indicates that the import statement needs to be used
    public static void main(String[] args) {
        Game.info().setName("The Hygiene Game");
        Game.info().setSubTitle("by Abigayle and Elle");

        Game.init(args);

        Game.screens().add(new GameScreen(Globals.GAME_SCREEN));
        Game.screens().add(new MenuScreen(Globals.MENU_SCREEN));
        Game.screens().display(Globals.GAME_SCREEN);


        Game.world().camera().setFocus(20, 20);
    }
}
