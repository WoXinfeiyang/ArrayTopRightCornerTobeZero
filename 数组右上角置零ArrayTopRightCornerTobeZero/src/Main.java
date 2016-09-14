import java.util.Scanner;


public class Main {
    
	public static void  SetArrayTopRightCornerTobeZero(int [][]a){
    	int row=a.length;
    	int colum=a[0].length;
    	int i,j;
    	for(i=0;i<row;i++){
    		for(j=i;j<colum;j++){
    			a[i][j]=0;
    		}
    	}
    	
    	for(i=0;i<row;i++){
    		for(j=0;j<colum;j++){
    			System.out.print(a[i][j]);
    		}
    	}
    }
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a=new int[3][3];
		int i=0,j=0;
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			for(i=0;i<3;i++){
				for(j=0;j<3;j++){
					a[i][j]=in.nextInt();
				}
			}
			SetArrayTopRightCornerTobeZero(a);
		}
	}

}
