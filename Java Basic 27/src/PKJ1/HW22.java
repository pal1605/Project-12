package PKJ1;

public class HW22 
{
	public int sum(int a , int b ){
		int A_sum;
		A_sum=a+b;
		return A_sum;
		
		
	}
	public int multi(int t, int d){
		int C_multi;
		C_multi=t*d;
		return C_multi;
		
	}
	public int sub(int w , int e){
		int E_sub;
		E_sub=w-e;
		return E_sub;
	}
	public int div(int p , int f){
		int F_div;	
		F_div= p/f;
		return F_div;
	}
	
	public static void main(String[] args) {
		
		HW22 V=new HW22();
		int a1,a2,a3,a4,a5;
		a1= V.sum(10,2);
		a2= V.sum(a1,2);
    	a3= V.multi(a2,2);
    	a4= V.sub(a3,2);
    	a5= V.div(a4,2);
		System.out.println(+a5);
	
		HW22 S=new HW22();
		int y1,y2,y3,y4,y5;
		y1= S.multi(10,2);
		y2= S.sum(y1,2);
		y3= S.sub(y2,2);
		y4= S.sum(y3,2);
		y5= S.div(y4, 2);	
		System.out.println(+y5);
	}
}
