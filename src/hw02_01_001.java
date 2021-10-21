

// Java program to create a blank text
// field of definite number of columns.
import java.awt.event.*;
import javax.swing.*;
import        javax.swing.JFrame;
import javax.swing.JTextField;
import java.util.Random;
    class hw02_01_001 extends JFrame implements ActionListener {

        // JTextField
        static JTextField t01;
        static JTextField t02;
        static JTextField t04;

        // JFrame
        static JFrame f;

        // JButton
        static JButton b01;

        // label to display text
        static JLabel l01;
        static JLabel l02;

        // default constructor
        hw02_01_001()
        {
        }

        // main class
        public static void main(String[] args)
        {
            // create a new frame to store text field and button
            f = new JFrame("cw01_01_001");

            // create a label to display text
            l01 = new JLabel("Ievadiet X");
            l02 = new JLabel("Ievadiet y");
            t01 = new JTextField(16);
            t02 = new JTextField(16);
            t04 = new JTextField(25);

            // create a new button
            b01 = new JButton("Atbilde");

            // create a object of the text class
            hw02_01_001 te = new hw02_01_001();

            // addActionListener to button
            b01.addActionListener(te);

            JPanel p = new JPanel();

            // add buttons and textfield to panel
            p.add(l01);
            p.add(t01);
            p.add(l02);
            p.add(t02);
            p.add(b01);
            p.add(t04);

            // add panel to frame
            f.add(p);

            // set the size of frame
            f.setSize(300, 300);

            f.show();
        }
        public void actionPerformed(ActionEvent e)
        {
            String X = t01.getText();
            String Y = t02.getText();

            int coorX = Integer.parseInt(X);
            int coorY = Integer.parseInt(Y);

            int status = 0;
            int boundaryXmax = 3;
            int boundaryXmin = -2;
            int boundaryYmax = 1;
            int boundaryYmin = -4;

            if(coorX<boundaryXmax){
                if(coorX>boundaryXmin){
                    if(coorY<boundaryYmax){
                        if(coorY>boundaryYmin){
                            status = 2;
                        }
                    }
                }
            }
            if(coorX==boundaryXmax) {
                if(coorY<=boundaryYmax) {
                    if(coorY>=boundaryYmin) {
                       status = 1;
                    }
                }
            }
            if(coorX==boundaryXmin){
                if(coorY>=boundaryYmin){
                    if(coorY<=boundaryYmax){
                        status = 1;
                    }
                }
            }
            if(coorY==boundaryYmax) {
                if(coorX<=boundaryXmax) {
                    if(coorX>=boundaryXmin) {
                        status = 1;
                    }
                }
            }
            if(coorY==boundaryYmin) {
                if(coorX>=boundaryXmin) {
                    if(coorX<=boundaryXmax) {
                        status = 1;
                    }
                }
            }
            String Atbilde;
            if(status == 2) {
                Atbilde = "Koordinatas (" + X + ":" + Y + ") atrodas figuras iekspuse";
            }else {
                if(status == 1) {
                    Atbilde = "Koordinatas ("+X + ":" + Y+") atrodas uz figuras linijas";
                }else {
                    Atbilde = "Koordinatas (" + X + ":" + Y + ") atrodas figuras arpuse";
                }
            }
            String s = e.getActionCommand();
            if (s.equals("Atbilde")) {
                t04.setText(Atbilde);
            }
        }
    }







