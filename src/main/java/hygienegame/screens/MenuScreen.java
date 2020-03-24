package hygienegame.screens;

import de.gurkenlabs.litiengine.Game;
import de.gurkenlabs.litiengine.graphics.Spritesheet;
import de.gurkenlabs.litiengine.gui.screens.Screen;
import de.gurkenlabs.litiengine.util.io.ImageSerializer;

import java.awt.*;
import java.awt.image.BufferedImage;

public class MenuScreen extends Screen {
    private BufferedImage image;

    public MenuScreen(String screenName) {
        super(screenName);
        image = ImageSerializer.loadImage("img/menuplaceholder.jpg");
    }

    @Override
    public void render(Graphics2D g) {
        super.render(g);

        Game.graphics().renderImage(g, image, -270, -80);
    }
}
