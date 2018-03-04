
import java.awt.*;//imports
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
 
public class Compression extends JPanel implements MouseListener, ChangeListener {//class header extends JPanel ActionListener and implement change listener
private JSlider slider;//declare private slider, and message, and value
private int value, x, y, counter, gamescore, last;//declare ints
private boolean clicked,change, next;//declare booleans
private Image up, down;//declare images
private JPanel cardPanel;
private CardLayout cardLayout;

public Compression(JPanel cardPanel, CardLayout cardLayout) {// constructor
	this.cardPanel=cardPanel;
	this.cardLayout=cardLayout;


        
        up = Toolkit.getDefaultToolkit().getImage("up.png");//initialize images
        down = Toolkit.getDefaultToolkit().getImage("down.png");
       
        /*int x=0;
        int x1=0;
        int y=0;
        int y1=0;
        */
        value =1;
        last = 3;
        
        change=false;//set booleans to false
        next = false;
        
        /*
        setLayout(new BorderLayout());//set border layout
        
        slider=new JSlider(JSlider.VERTICAL,0,100,0);//create slider
        add(slider,BorderLayout.EAST);//add slider to south
        slider.addChangeListener(this);//add change listener
        */
        this.addMouseListener(this);
        slider=new JSlider(JSlider.VERTICAL,0,100,0);//create slider     // startButton.setBounds(300, 50,140, 50 );
       
        this.add(slider);
        slider.addChangeListener(this);//add change listener
        change=true;
        repaint();
      
}

public void paintComponent(Graphics g) {//paint component

//if(clicked==false){//before anything, draw the icepack image directions
   // g.drawImage(up, 0, 0, 800, 860, 0, 0, 800, 860, this);
//}
/*if (counter==1){//as user clicks once pull up the Keep going image
    g.drawImage(two, 0, 0, 800, 860, 0, 0, 800, 860, this);
    g.setFont(bigFont);
    g.setColor(Color.MAGENTA);
    g.drawString("1",50,75);//draw count 
    }
    
    
if (counter==2){
    g.drawImage(two, 0, 0, 800, 860, 0, 0, 800, 860, this);
    g.setFont(bigFont);
    g.setColor(Color.MAGENTA);
    g.drawString("2",50,75);
}

if (counter==3){
    g.drawImage(two, 0, 0, 800, 860, 0, 0, 800, 860, this);
    g.setFont(bigFont);
    g.setColor(Color.MAGENTA);
    g.drawString("3",50,75);}

if (counter==4){
    g.drawImage(two, 0, 0, 800, 860, 0, 0, 800, 860, this);
    g.setFont(bigFont);
    g.setColor(Color.MAGENTA);
    g.drawString("4",50,75);
    }

if (counter==5){
    g.drawImage(three, 0, 0, 800, 860, 0, 0, 800, 860, this);
    }

if(counter==6){
    g.drawImage(one1, 0, 0, 800, 860, 0, 0, 800, 860, this);
}
*/
	
slider.setBounds(550, 270, 20, 400);

	 
if(value> 50&&change==true){
	g.drawImage(up, 0, 0, 800, 800, this);
}
    
else if (value < 50 &&change==true){
	g.drawImage(down, 0, 0, 800, 800, this);
}    }
/*    
else if ((value>=20&&value<40||value>=60&&value<80)&&change==true){
    g.drawImage(right, 0, 0, 800, 860, 0, 0, 800, 860, this);
    }
    
else if (value==100&&change==true){
        g.drawImage(finalize, 0, 0, 900, 900, 0, 0, 900, 1018, this);
        counter = 300;
        if(last == 3){
                gamescore+=10;
                last = 3000;
        }
    }
}
*/

//load image
//print message
//if value is 0
//draw icepack to the left
//if value is 10
//draw icepack to the right
//if value is 20 to the left
//if value is 30 to the right
//if value is 40 to the left
//if 50 draw good job
public void mousePressed (MouseEvent e){
    }

public void mouseReleased (MouseEvent e){
    }    

public void mouseClicked (MouseEvent e){
	int x1 = e.getX();

	int y1 = e.getY();// get x and y
	
	System.out.println("mouse pressed " + ", x="+x1 + ", y=" +y1);

	if (x1 < 788 && x1 > 626 && y1 < 786 && y1 > 710) {// if x and y are in

		System.out.println("mouse pressed - pressed TRUE");
		cardLayout.next(cardPanel);
	}
}
       /* 
        if(counter == 300 && y>100 && y<300 && x>0 && x<900){
          returnedc(gamescore);
        }
        if (x>300&&x<440&&y<600&&y>500){
        
            counter++;
            repaint();
            }
        
        }
        */
    
public void mouseEntered (MouseEvent e){
          repaint();
    }    

public void mouseExited(MouseEvent e){
    }

public void stateChanged(ChangeEvent e)
    {
	
        value=slider.getValue();
        change=true;
        repaint();
        
    }
}

