import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class bird extends JPanel {
    int frameWidth = 360;
    int frameHeight = 640;


    Image backImage;
    Image birdImage;
    Image upperPipeImage;
    Image lowerPipeImage;

    bird(){
        setPreferredSize(new Dimension(frameWidth, frameHeight));
        setBackground(Color.blue);

        backImage = new ImageIcon(getClass().getResource("./flappybirdbg.png")).getImage();
        birdImage = new ImageIcon(getClass().getResource("./flappybird.png")).getImage();
        upperPipeImage = new ImageIcon(getClass().getResource("./toppipe.png")).getImage();
        lowerPipeImage = new ImageIcon(getClass().getResource("./bottompipe.png")).getImage();
    }
}
