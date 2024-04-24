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



    int birdX = frameWidth/8;
    int birdY = frameHeight/2;
    int birdWidth = 34;
    int birdHeight = 24;



    class Bird{
        int x = birdX;
        int y = birdY;
        int width = birdWidth;
        int height = birdHeight;
        Image img;

        Bird(Image img){
            this.img = img;
        }
    }



    Bird bird;


    bird(){
        setPreferredSize(new Dimension(frameWidth, frameHeight));

        backImage = new ImageIcon(getClass().getResource("./flappybirdbg.png")).getImage();
        birdImage = new ImageIcon(getClass().getResource("./flappybird.png")).getImage();
        upperPipeImage = new ImageIcon(getClass().getResource("./toppipe.png")).getImage();
        lowerPipeImage = new ImageIcon(getClass().getResource("./bottompipe.png")).getImage();


        bird = new Bird(birdImage);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g){
        // Your code here
        g.drawImage(backImage, 0, 0, frameWidth, frameHeight, null);
        g.drawImage(bird.img, bird.x, bird.y, bird.width, bird.height, null);
    }
}
