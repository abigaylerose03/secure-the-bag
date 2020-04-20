package hygienegame;

public enum TileType {
    GROUND(0),
    WALL(50),
    VOID(10);

    private int sprite;

    TileType(int sprite) {

        this.sprite = sprite;
    }

    public int getSprite() {
        return sprite;
    }
}
