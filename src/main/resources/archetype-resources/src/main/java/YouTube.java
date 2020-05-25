import origami.Camera;
import origami.Filter;
import origami.Origami;
import origami.filters.Grayscale;

public class YouTube {

    public static void main(String[] args) throws InterruptedException, ClassNotFoundException {
        Origami.init();
        Class.forName(origami.video.YouTubeHandler.class.getName());
        final String input = args.length > 0 ? args[0] : "youtube://PnqzVkPDUHQ";
        Filter f = new Grayscale();
        new Camera().device(input).filter(f).run();
    }

}