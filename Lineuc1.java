package LineComparison;

public class Line {
		double distanceCal(int x1,int y1,int x2,int y2)	
		{
		
		         double dis;	
			     dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)); 	 	    	 	    
	             return dis;  	         
		}
	public static void main(String[] args) {
	   Line obj = new Line();
	   Double line1=obj.distanceCal(1,1,1,1);
	   Double line2=obj.distanceCal(2,4,3,2);
	   System.out.println("line1 and line 2 are equal.True or False :" +line1.equals(line2));
	}
	}
