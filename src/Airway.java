
import java.awt.*;//imports
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
 
public class Airway extends JPanel implements MouseListener,  MouseMotionListener {//class header extends JPanel ActionListener and implement change listener

private int value, lastx, lasty, counter, gamescore, last;//declare ints
private boolean clicked,change, next;//declare booleans
private Image up, down;//declare images
private JPanel cardPanel;
private CardLayout cardLayout;

public Airway(JPanel cardPanel, CardLayout cardLayout) {// constructor
	this.cardPanel=cardPanel;
	this.cardLayout=cardLayout;


        
        up = Toolkit.getDefaultToolkit().getImage("tilt1.png");//initialize images
        down = Toolkit.getDefaultToolkit().getImage("tilt2.png");
       
        /*int x=0;
        int x1=0;
        int y=0;
        int y1=0;
        */
        value =0;
      
        
        change=true;
        
        /*
        setLayout(new BorderLayout());//set border layout
        
        slider=new JSlider(JSlider.VERTICAL,0,100,0);//create slider
        add(slider,BorderLayout.EAST);//add slider to south
        slider.addChangeListener(this);//add change listener
        */
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    
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
	

	 
if(value == 0 &&change==true){
	g.drawImage(up, 0, 0, 800, 800, this);
}
    
else if (value == 1 &&change==true){
	g.drawImage(down, 0, 0, 800, 800, this);
}    


}
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
	System.out.println("release...");
	 int x = e.getX();
     int y = e.getY();
     
	if (change && (x > 291 || x < 255 || y > 438 || y < 387)) { // not  in B
		change=false;
	}
	if (change && value ==0 ) {
		value=1;
		repaint();
    }
}   

public void mouseClicked (MouseEvent e){
	int x1= e.getX();
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

@Override
public void mouseDragged(MouseEvent e) {
	// TODO Auto-generated method stub

	int x = e.getX();
    int y = e.getY();
    if (x > 430 && x < 466 && y > 388 && y < 437) { // in A
		change=true;
		return;
	}

	
}

@Override
public void mouseMoved(MouseEvent e) {
	// TODO Auto-generated method stub
//	System.out.println("moved...");
}
}




