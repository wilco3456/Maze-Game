import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class paintMain extends JComponent implements KeyListener {
	//Turns array into 2D graphics for the Maze game
	int ballLocationX = 0;
	int ballLocationY = 0;
	char[][] mazeArray = Maze_Game.testmain();
	JFrame f;
	JButton b1;
	JPanel p;
	
	
	public void keyPressed(KeyEvent e) {
		//if an arrow key is pressed, attempt move the blue ball if a wall is not blocking the path
	    if (e.getKeyCode() == KeyEvent.VK_RIGHT ) {		//Listening for right arrow key press
	    	if (mazeArray[ballLocationX][ballLocationY+1] == '\u0020'){		//if the array field to the right of the ball is a white space, move right
		        mazeArray[ballLocationX][ballLocationY] = '\u0020';		//change the current ball position into a white space in the maze array
		        mazeArray[ballLocationX][ballLocationY+1] = '\u0031';	//change the array field to the right of the ball to a number 1
		        ballLocationY = ballLocationY + 1;		//increment the y position of the ball since the ball moved right
	    	}
	    	else if (mazeArray[ballLocationX][ballLocationY+1] == '\u0032'){	//if the array field to the right of the ball is a number 2, show congratulations message.
	    		JOptionPane.showMessageDialog(null, "Congratulations you've won the game","INFO", JOptionPane.INFORMATION_MESSAGE);
	    	}
	    } 
	    else if (e.getKeyCode() == KeyEvent.VK_LEFT ) {
	    	if (mazeArray[ballLocationX][ballLocationY-1] == '\u0020'){
	            mazeArray[ballLocationX][ballLocationY] = '\u0020';
	            mazeArray[ballLocationX][ballLocationY-1] = '\u0031';
	            ballLocationY = ballLocationY - 1;
	    	}
	    	else if (mazeArray[ballLocationX][ballLocationY-1] == '\u0032'){
	    		JOptionPane.showMessageDialog(null, "Congratulations you've won the game","INFO", JOptionPane.INFORMATION_MESSAGE);
	    	}
	    } 
	    else if (e.getKeyCode() == KeyEvent.VK_UP ) {		//Listening for up arrow key press
	    	if (mazeArray[ballLocationX-1][ballLocationY] == '\u0020'){		//if the array field above the ball is a white space, move up
	            mazeArray[ballLocationX][ballLocationY] = '\u0020';		//change the current ball position into a white space in the maze array
	            mazeArray[ballLocationX-1][ballLocationY] = '\u0031';		//change the array field above the ball to a number 1
	            ballLocationX = ballLocationX - 1;		//decrement the x position of the ball since the ball moved up
	    	}
	    	else if (mazeArray[ballLocationX-1][ballLocationY] == '\u0032'){	//if the array field above the ball is a number 2, show congratulations message.
	    		JOptionPane.showMessageDialog(null, "Congratulations you've won the game","INFO", JOptionPane.INFORMATION_MESSAGE);
	    	}
	    } 
	    else if (e.getKeyCode() == KeyEvent.VK_DOWN ) {
	    	if (mazeArray[ballLocationX+1][ballLocationY] == '\u0020'){
	            mazeArray[ballLocationX][ballLocationY] = '\u0020';
	            mazeArray[ballLocationX+1][ballLocationY] = '\u0031';
	            ballLocationX = ballLocationX + 1;
	    	}
	    	else if (mazeArray[ballLocationX+1][ballLocationY] == '\u0032'){
	    		JOptionPane.showMessageDialog(null, "Congratulations you've won the game","INFO", JOptionPane.INFORMATION_MESSAGE);
	    	}
	    }
	    repaint();	//implement the changes to the maze array
	}
	
	public void keyTyped(KeyEvent e) {}		//needs to be implemented for KeyListener to work

    public void keyReleased(KeyEvent e) {}		//needs to be implemented for KeyListener to work


    public paintMain(){
        addKeyListener(this);	//initialises the key listener on the paint main class
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }
	
	
	public static void main(String[] args) {
		//Creates a new JFrame for the game to be played on
		JFrame f = new JFrame("Maze Game");
		f.setSize(630, 680); 
		f.add(new paintMain(), BorderLayout.CENTER);	//Puts the maze in the centre of the JFrame
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton b1 = new JButton("Reset");
		b1.addActionListener(e -> main(null));
		f.add(b1, BorderLayout.SOUTH);		//Puts the button at the bottom of the JFrame
		f.setVisible(true);		//Makes the frame and its contents visible
	}
	
	public void paintComponent(Graphics graphics){
		//Creates the maze from the array given
		Graphics2D g = (Graphics2D) graphics;
		for(int x=0;x<mazeArray.length;x++){
			   for(int j=0;j<mazeArray[0].length;j++){
				   if (mazeArray[j][x] == '\u0023'){	//If the current field in the array is a # add a black rectangle
					   g.setColor (Color.black);
					   g.fillRect((x*10),(j*10),10,10);
				   }
				   else if (mazeArray[j][x] == '\u0020'){		//If the current field in the array is a whitespace add a white rectangle
					   g.setColor (Color.white);
					   g.fillRect((x*10),(j*10),10,10);
				   }
				   else if (mazeArray[j][x] == '\u0031'){		//If the current field in the array is a number 1 add a blue circle
					   g.setColor (Color.blue);
					   g.fillOval((x*10),(j*10),10,10);
					   ballLocationX = j;
					   ballLocationY = x;
				   }
				   else if (mazeArray[j][x] == '\u0032'){		//If the current field in the array is a number 2 add a red circle
					   g.setColor (Color.red);
					   g.fillOval((x*10),(j*10),10,10);
				   }
			   }
		} 
	}

}

