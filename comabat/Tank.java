import java.awt.Color;
import java.awt.Graphics;


public class Tank {
	
	private int x;
	private int y;
	private char dir;
	public int getX(){return x;}
	public void setX(int i){x=i;}
	public int getY(){return y;}
	public void setY(int i){y=i;}

	
	public void moveLeft(){
		x=x-5;
	}
	public void moveRight(){
		x=x+5;
	}
	public void moveUp(){
		y=y-5;
	}
	public void moveDown(){
		y=y+5;
	}
	public void move(char _dir){
		dir = _dir;
		if(dir=='u'){
			y-=5;
		}else if(dir=='d'){
			y+=5;
		}else if(dir=='r'){
			x+=5;
		}else if(dir=='l'){
			x-=5;
		}
		
	}



public Tank(int _x,int _y) {
	x=_x;
	y=_y;
	
	
	//TODO Auto-generated constructor stub
}

public void draw (Graphics g){
	//box
	g.fillRect(x-10, y-13, 20, 20);
	//tread
	 if (dir=='l'){
	  g.fillRect(x-18, y-16, 35, 5);
	  g.fillRect(x-18, y+5, 35, 5);
}  
	 else if (dir=='r'){
	  g.fillRect(x-18, y-16, 35, 5);
	  g.fillRect(x-18, y+5, 35, 5);
}
	 else{
	  g.fillRect(x-10, y-20, 5, 35);
	  g.fillRect(x+10, y-20, 5, 35);	 
	 }
	 
	//inner box
	g.fillRect(x-1, y-5, 10, 10);
	//turret
	 if (dir=='d'){
	   g.fillRect(x-1, y-1, 6, 20);
	 }
	 else if(dir=='u'){
	   g.fillRect(x-1, y-25, 6, 20);	
	}
	 else if (dir=='l'){
	   g.fillRect(x-24, y-7, 20, 6);
	 }
	 else if (dir=='r'){
	   g.fillRect(x+2, y-7, 20, 6);
	 }
	

}

public int getTopX(){if(dir=='u'||dir=='d')return x-18; return x-10;}
public int getTopY(){if(dir=='u'||dir=='d')return y-16; return y-20;}
public int getWidth(){if(dir=='u'||dir=='d')return 25; return 30;}
public int getHeight(){if(dir=='u'||dir=='d')return 30; return 25;}

	
		
}


