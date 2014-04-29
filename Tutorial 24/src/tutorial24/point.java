package tutorial24;

import toxi.geom.Vec3D;

public class point {

	Vec3D loc;
	Tutorial24 p5;
	
	point(Tutorial24 _p5, Vec3D _loc){
		loc = _loc;
		p5 = _p5;
		
	}
	void display(){
		
		p5.strokeWeight(8);
		p5.stroke(255,255,0);
		p5.point(loc.x,loc.y);
		
	}
	
	
}
