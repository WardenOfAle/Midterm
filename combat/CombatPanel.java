import java.awt.*;
import java.awt.color.*;

import javax.swing.JPanel;

public class CombatPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Tank t,t2;
	private level l;
	
	public void moveDir(char c1,int tank){
	
			
			
		
		Tank temp;
		if(tank==1)temp=t;
		else temp=t2;
		temp.move(c1);
		if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
		t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight())){
		if(c1=='u')temp.setY(temp.getY()+5);
		if(c1=='d')temp.setY(temp.getY()-5);
		if(c1=='l'){temp.setX(temp.getX()+5);
		}
		if(c1=='r'){temp.setX(temp.getX()-5);
		}
		}
		
	
	
	
	}
	
	public CombatPanel(){
		
		t=new Tank(300,400);
		t2=new Tank(100,400);
		l=new level(1);
	
	}
	
	boolean bounding_box_collision(int b1_x, int b1_y, int b1_w, int b1_h, int b2_x, int b2_y, int b2_w, int b2_h)
	{
		  if ((b1_x > b2_x + b2_w - 1) || // is b1 on the right side of b2?
			        (b1_y > b2_y + b2_h - 1) || // is b1 under b2?
			        (b2_x > b1_x + b1_w - 1) || // is b2 on the right side of b1?
			        (b2_y > b1_y + b1_h - 1))   // is b2 under b1?
			    {
			        // no collision
			        return false;
			    }

			    // collision
			    return true;
	}
	public void paintComponent(Graphics g){
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, 600, 800);
		g.setColor(Color.black);
		l.draw(g);
		t.draw(g);
		t2.draw(g);
	}

	public void move2Dir(char c) {
		// TODO Auto-generated method stub
		
	}
	
}
