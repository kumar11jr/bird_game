import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class bird extends JPanel implements ActionListener,KeyListener{
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
    Timer gameloop;
    int velocityY = 0;
    int gravity = 1;


    bird(){
        setPreferredSize(new Dimension(frameWidth, frameHeight));
        setFocusable(true);
        addKeyListener(this);     

                 
        backImage = new ImageIcon(getClass().getResource("./flappybirdbg.png")).getImage();
        birdImage = new ImageIcon(getClass().getResource("./flappybird.png")).getImage();
        upperPipeImage = new ImageIcon(getClass().getResource("./toppipe.png")).getImage();
        lowerPipeImage = new ImageIcon(getClass().getResource("./bottompipe.png")).getImage();


        bird = new Bird(birdImage);

        // this -> refers to bird class
        gameloop = new Timer(1000/60,this);
        gameloop.start();
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

    public void move(){
        velocityY += gravity;
        bird.y += velocityY;
        birdY = Math.max(bird.y,0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        move();
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_SPACE){
            velocityY = -9;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
}
