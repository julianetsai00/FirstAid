
	import java.awt.*;//imports

	import java.awt.event.*;

	import javax.swing.*;



	public class GoodJob extends JPanel implements MouseListener {// class header


		private boolean  pressed, released, pressed1, released1, retry, done;// declare boolean

	private int counter;

		private int x, y, x1, y1;


		private JPanel cardPanel;
		private CardLayout cardLayout;

		public GoodJob(JPanel cardPanel, CardLayout cardLayout) {// constructor
			this.cardPanel=cardPanel;
			this.cardLayout=cardLayout;
		
			addMouseListener(this);// add mouselistener
			counter=0;
			repaint();

		}
	    


		public void paintComponent(Graphics g) {// paintComponent header
			
			Image img1 = Toolkit.getDefaultToolkit().getImage("goodjob.png");
			g.drawImage(img1, 0, 0, 800, 800, this);
		}
			
			// method//drawimage

			/*if (pressed == true && released == true) {
				// if pressed and released are true, draw image of done

				Image img1 = Toolkit.getDefaultToolkit().getImage("1");

				g.drawImage(img1, 0, 0, 1582, 1582, 0, 0, 1222, 1222, this);
				
				done=true;
				
				System.out.println("done");
			} 
		}
			
	*/

		public void mouseClicked(MouseEvent e) {
			if (done) { // if done, no more mouse handling
				return;
			}
			
			int x1 = e.getX();

			int y1 = e.getY();// get x and y
			
			System.out.println("mouse pressed " + ", x="+x1 + ", y=" +y1);

			if (x1 < 788 && x1 > 626 && y1 < 786 && y1 > 710) {// if x and y are in


				

				pressed = true;// pressed 1 is true
				counter++;
				System.out.println("mouse pressed - pressed TRUE");
				cardLayout.next(cardPanel);
			} else {

				pressed1 = false;
				System.out.println("mouse pressed - pressed1 FALSE");
			}

		}


		



		public void mouseEntered(MouseEvent e) {

		//	repaint(); no need to repaint when mouse entered

		}



		public void mouseExited(MouseEvent e) {

		}



		public void mousePressed(MouseEvent e) {// mouse pressed header
			
		}
		public void mouseReleased(MouseEvent e) {// mouse released header
		}
	}


	// if pressed and released are true



