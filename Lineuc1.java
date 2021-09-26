package LineComparison;

public class Line {
	
		double distance(int x1,int y1,int x2,int y2)	
		{
		
		         double dis;	
			     dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
			     return dis;
		}
	public static void main(String[] args) {
	Line obj = new Line();
	double ans = obj.distance(4,6,7,4);
	System.out.println("distance between points  :"+ ans);
	}
		}

	

