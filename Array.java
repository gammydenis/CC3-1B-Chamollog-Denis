package cc3.pkg1b;

import java.util.*;

class CC31B {
 static Scanner sc = new Scanner (System.in);
public static int Mean(int array[]){
int sum = 0;
int length=array.length;
for(int j = 0; j < length; j++){
sum += array[j];
}
return sum/length;
}

public static int Mode(int array[]) {
int max=0, maxCount=0;
int length=array.length;
for (int i = 0; i <length; ++i) {
int count = 0;
for (int j = 0; j <length; ++j) {
if (array[j] == array[i]) ++count;
}
if (count > maxCount)
{
maxCount = count;
max = array[i];
}
}
return max;
}

public static void main(String[] args)
{
//Scanner nums = new Scanner(System.in);
System.out.println("Enter size of array:");
  int n = sc.nextInt();
  int[] num = new int[n];

  System.out.println("Enter elements of array:");

    for (int i = 0; i < n; i++){
      num[i] = sc.nextInt();
}

int mean=CC31B.Mean(num);
System.out.println("Mean= "+mean);
int mode=CC31B.Mode(num);
System.out.println("Mode= "+mode);
}
}   
    