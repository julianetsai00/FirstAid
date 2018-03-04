

	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;

	public class Framey extends JFrame{
		
		
	    public static void main (String [] args){
	    Framey f=new Framey();
	    }
	        public Framey(){
	        	
	        setSize(820,840);
	        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	        
	        final JPanel cardPanel = new JPanel();
	        final CardLayout cardLayout = new CardLayout();
	        cardPanel.setLayout(cardLayout);

	        JPanel panels[]={new Start(cardPanel, cardLayout), new Welcome(cardPanel, cardLayout), 
	        		 new Step1(cardPanel, cardLayout), new Step2(cardPanel, cardLayout), 
	        		 new Step3(cardPanel, cardLayout), new GoodJob(cardPanel, cardLayout),
	        		 new Compression(cardPanel, cardLayout), new Airway(cardPanel, cardLayout), 
	        		 new Breathe(cardPanel, cardLayout), new Congrats(cardPanel, cardLayout)
					};
	        
	        for (int i = 0; i < panels.length; i++) {
	          JPanel card = panels[i];
	          card.setPreferredSize(new Dimension(820,840));
	          String cardName = "card" + 1;
	          cardPanel.add(card, cardName);
	        }
	        
	        
	    //    Compression hg=new Compression();
	    //   Breathe hg= new  Breathe();
	   //     Airway hg= new Airway();
	        setContentPane(cardPanel);
	        setVisible(true);
	        }
	    }
