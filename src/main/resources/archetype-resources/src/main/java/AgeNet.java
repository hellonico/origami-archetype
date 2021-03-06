package hello;

import static org.opencv.core.Core.minMaxLoc;
import static org.opencv.dnn.Dnn.blobFromImage;
import static org.opencv.imgcodecs.Imgcodecs.imread;

import java.util.List;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.dnn.Dnn;
import org.opencv.dnn.Net;

public class AgeNet {
    public static void main(String[] args) {
        List<?> _list = origami.Dnn.readNetFromSpec("networks.caffe:convnet-age:1.0.0");
        Net net = (Net) _list.get(0);
        /*
         * readNetFromSpec returns
         * 
         * 0: Net object
         * 
         * 1: Options related to the way the image blob should be created
         * 
         * 2: labels
         */
        List<String> labels = (List<String>) _list.get(2);

        final String imageFile = args.length > 0 ? args[0] : "src/main/resources/jeunehomme.jpg";
        Mat image = imread(imageFile);
        Mat inputBlob = blobFromImage(image, 1.0, new Size(256, 256));
        net.setInput(inputBlob);
        net.setPreferableBackend(Dnn.DNN_BACKEND_OPENCV);

        /*
         * Get Result and Output
         */
        Mat result = net.forward();
        result = result.reshape(1, 1);
        // System.out.println(result.dump());
        Core.MinMaxLocResult minmax = minMaxLoc(result);
        System.out.println("Age range:" + labels.get((int) minmax.maxLoc.x));
    }

}