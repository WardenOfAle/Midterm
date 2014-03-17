import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;


public class Combat2 implements KeyListener {
	private JFrame window;
	private CombatPanel cp;
	
	public Combat2() {
		window=new JFrame("Combat Game");
		cp=new CombatPanel();
		window.add(cp);
		window.setSize(800,600);
		window.setVisible(true);
		window.addKeyListener(this);
		//TODO Auto-generated constructer stub
		
	}

	public static void main(String[] args) {
		new Combat2();
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("K"+e.getKeyCode());
		if(e.getKeyCode()==87){
			//W-UP
			cp.moveDir('u', 1);
		

		}else if(e.getKeyCode()==83){
			//S-Down
			cp.moveDir('d', 1);
		}else if(e.getKeyCode()==68){	
			//A-Right
			cp.moveDir('r', 1);
		}else if(e.getKeyCode()==65){
			//D-Left
			cp.moveDir('l', 1);
		}
		
		if(e.getKeyCode()==38){
			//UP
			cp.moveDir('u', 2);
		

		}else if(e.getKeyCode()==40){
			//Down
			cp.moveDir('d', 2);
		}else if(e.getKeyCode()==39){	
			//Right
			cp.moveDir('r', 2);
		}else if(e.getKeyCode()==37){
			//Left
			cp.moveDir('l', 2);
		}
		
		cp.repaint();
		
	}
	
	@Override
	public void keyTyped(KeyEvent arg0){
		//TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
