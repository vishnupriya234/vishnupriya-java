import java.util.Scanner;
class StringOperations{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter first string:");
String str1 = sc.nextLine();
System.out.print("Enter second string:");
String str2 = sc.nextLine();
//charAt()
System.out.print("\nCharacter at index 0:"+ str1.charAt(0));
//substring()
System.out.println("substring from index 1:"+ str1.substring(1));
//concat()
System.out.println("concatenation:"+ str1.concat(str2));
//equals()
System.out.println("Are both string equal?"+ str1.equals(str2));
//isEmpty()
System.out.println("Is frist string empty?"+ str1.isEmpty());
sc.close();
}}