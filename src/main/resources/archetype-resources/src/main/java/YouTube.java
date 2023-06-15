package hello;

import origami.Camera;
import origami.Filter;
import origami.Origami;
import origami.filters.detect.yolo.MyYolo;

public class YouTube {


    public static void main(String[] args) throws InterruptedException, ClassNotFoundException {

        Origami.init();
        Class.forName(origami.video.YouTubeHandler.class.getName());
        final String input = args.length > 0 ? args[0] : "{:device \"youtube://DXUAyRRkI6k\" :slow 100}";
        Filter f = new MyYolo.V3Tiny();
        new Camera().device(input).filter(f).run();
    }

}