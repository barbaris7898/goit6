public class TexturePool {
    private static TexturePool texture = new TexturePool();
    private TexturePool(){

    }
    public static TexturePool getInstance() {
        return texture;
    }

    public String getTexture(String textureName){
        return "Get texture "+textureName;
    }
}
class TexturePoolTest {
    public static void main(String[] args) {
        //Get texture MainHero
        System.out.println(TexturePool.getInstance().getTexture("MainHero"));
    }
}
