import java.util.Scanner;
public class MatrixMultiplication{
public static void main(String[]args){
Scanner sc = new
Scanner(System.in);
//input rows and columns for first matrix
System.out.print("enter rows and columns of first matrix:");
int r1=sc.nextInt();
int c1=sc.nextInt();
//input rows and colunms for second matrix
System.out.print("Enter rows and columns of second matrix:");
int r2 = sc.nextInt();
int c2 = sc.nextInt();
//Check if multiplication is possible 
if(c1 != r2){
System.out.print("Matrix multiplication is not possible:");
return;
}
int[][] A = new int[r1][c1];
int[][] B = new int[r2][c2];
int[][] C = new int[r1][c2];
//INPUT FRIST MATRIX
System.out.println("Enter elements  of first  matrix:");
for(int i=0;i<r1;i++){
for(int j=0;j<c1;j++){
A[i][j]=sc.nextInt();
}
}
//Metrix multiplication
for(int i = 0; i<r1;i++){
for(int j = 0; j<c2;j++){
C[i][j]=0;
for(int k=0;k<c1;k++){
C[i][j]+=A[i][k]*B[k][j];
}
}
}
//Display result
System.out.println("Resultant Matrix:");
for(int i=0;i<r1;i++){
for(int j=0;j<c2;j++){
System.out.print(C[i][j]+"");
}
System.out.println();
}
sc.close();
}
}
