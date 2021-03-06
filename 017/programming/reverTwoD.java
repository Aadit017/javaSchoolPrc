package programming;
import java.util.*;
class reverTwoD{ 
    public static void main(String args[]){ 
        Scanner sc=new Scanner(System.in);
        // values for the rows and columns in two dimensional array 
        System.out.println("value of the rows");
        int a =sc.nextInt();
        System.out.println("value of the columns");
        int b =sc.nextInt(); 
        int arr[][]=new int[a][b];
        System.out.println("\t now the array ");
        for(int i=0;i<a;i++){ 
            for(int j=0;j<b;j++){ 
                arr[i][j]=sc.nextInt();
            }
        }
        int rev[][]=new int[a][b];
        for(int i=0,p=2;i<a && p>=0;i++,p--){ 
            for(int j=0,r=2;j<b && r>=0;j++,r--){ 
                rev[p][r]=arr[i][j];
            }
        }
        System.out.println("The entered array ");
        for(int[] i:arr){ 
            for(int j:i){
                System.out.print("\t"+j);
            }
            System.out.println("\n");
        }
        System.out.println("\n");
        System.out.println("---------------");
        System.out.println("\n");
        for(int[] i:rev){
        for(int j:i){
            System.out.print("\t"+j);
        }
    System.out.println("\n");
        }
    sc.close();
    }
}