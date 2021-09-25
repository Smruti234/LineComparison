package LineComparison;

public class Lineuc1 {
	
		double distance(int x1,int y1,int x2,int y2)	
		{
		
		         double dis;	
			     dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
			     return dis;
		}
	public static void main(String[] args) {
	Lineuc1 obj = new Lineuc1();
	double ans = obj.distance(4,6,7,4);
	System.out.println("distance between points is :"+ ans);
	}
		}

	

