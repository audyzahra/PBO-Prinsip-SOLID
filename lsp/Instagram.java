package lsp;

public class Instagram implements PostMediaManager {

    @Override
    public void chat() {
        System.out.println("Fitur Chat");
    }

    @Override
    public void PhotosAndVideos() {
        System.out.println("Fitur Photo dan Video");
    }

    @Override
    public void publishPost() {
        System.out.println("Fitur Mengupload Postingan ke public");
    }
    
}
