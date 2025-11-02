package lsp;

public class Main {
    public static void main(String[] args) {
    WhatsApp wa = new WhatsApp();
    Instagram ig = new Instagram();

    wa.chat();
    ig.chat();
    wa.PhotosAndVideos();
    ig.PhotosAndVideos();
    wa.callGroupVideo();
    ig.publishPost();

    }
}
