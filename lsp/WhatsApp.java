package lsp;

public class WhatsApp implements VideoGroupManager {

    @Override
    public void chat() {
        System.out.println("Fitur Chat");
    }

    @Override
    public void PhotosAndVideos() {
        System.out.println("Fitur Photo dan Video");
    }

    @Override
    public void callGroupVideo() {
        System.out.println("Fitur Panggilan Group dan Video");
    }
    
}
