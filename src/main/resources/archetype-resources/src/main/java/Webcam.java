import origami.Camera;
import origami.Origami;

public class Webcam {
    public static void main(String... args) {
        Origami.init();
        new Camera().run();
    }

}