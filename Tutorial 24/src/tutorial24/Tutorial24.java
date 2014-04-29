package tutorial24;

import processing.core.PApplet;
import toxi.geom.Vec3D;


public class Tutorial24 extends PApplet {
	
	
	point pt;

	public void setup() {
		
		size(800,600);
		smooth();
		Vec3D v = new Vec3D (random(width),random(height),0);
		pt = new point(this, v);
	}

	public void draw() {
		
		background(0);
		stroke(255,0,0);
		fill(255);
		ellipse(mouseX,mouseY,30,30);
		
		pt.display();
	}
	
	public static void main(String _args[]) {
		PApplet.main(new String[] { tutorial24.Tutorial24.class.getName() });
	}
}
