package demo;

public class Avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		int trips[]= {8,16,98,74,6};	
		System.out.println(minArr(trips));
		System.out.println(maxArr(trips));
		System.out.println(median(trips));
	}
	
	public static  int minArr(int[] a )
	{
	  int  min=a[0];
	  for (int i=0;i<a.length;i++) {
		 if(a[i]<min) {
			 min=a[i];
		 }
	  }
	   return min;
		
	}
	
	public static  int maxArr(int[] a )
	{
	  int  max=a[0];
	  for (int i=0;i<a.length;i++) {
		 if(a[i]>max) {
			 max=a[i];
		 }
	  }
	   return max;
		
	}
	
	
   public static float median(int[] a) {
		
		float total =0;
		for (int i=0;i<a.length;i++) {
		    total= total+a[i];
		    
		}
		float average=total/a.length;
	      return average;
   
}
}