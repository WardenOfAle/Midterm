import java.awt.Graphics;



public class level{
		
		public level(int _l) {
	}

	public void draw(Graphics g){
		//box
		g.fillRect(0, 0, 600, 15);
		g.fillRect(0, 0, 15, 600);
		g.fillRect(0, 563, 600, 15);
		g.fillRect(585, 0, 15, 600);
		g.fillRect(150, 180, 15, 200);
		g.fillRect(450, 180, 15, 200);
		g.fillRect(320, 290, 80, 15);
		g.fillRect(280, 210, 80, 15);
		g.fillRect(240, 350, 80, 15);
		g.fillRect(240, 350, 15, 80);
		g.fillRect(300, 420, 15, 80);
		g.fillRect(180, 460, 15, 80);
		g.fillRect(195, 50, 15, 80);
		g.fillRect(180, 460, 15, 80);
		g.fillRect(290, 70, 15, 80);
		g.fillRect(410, 60, 15, 80);
	}

	

}
