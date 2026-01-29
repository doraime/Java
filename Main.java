//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Sophia Choi
 */

public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");

    Lab1 lab = new Lab1();
    System.out.println(lab.increment(1));
    int[] array = {5,9,3,12,7,3,11,5};
    int i=0;
    while (i<array.length){
      System.out.println(array[i]);
      i++;
    }
    for(i=array.length-1;i>=0;i--){
      System.out.println(array[i]);
    }
    System.out.println(array[0]);
    System.out.println(array[array.length-1]);
    lab.max(1,2);
    lab.min(1,2);
    lab.sum(array);
    lab.average(array);
    lab.max(array);
    lab.min(array);
  }
}     

// Add all of the methods here
class Lab1 {
  public int increment(int num) {
    return ++num;
  }
  public int max(int a,int b){
    if(a>=b)
      return a;
    else
      return b;
  }
  public int min(int a,int b){
    if(a<=b)
      return a;
    else
      return b;
  }
  public int sum(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        return totalSum;
  }
public double average(int[] nums) {
    int sum = 0;
    for (int n : nums) {
        sum += n;
    }
    return (double) sum / nums.length;
}

  public int max(int[] nums){
    int value=nums[0];
    for(int i=0;i<nums.length;i++){
      if (nums[i] > value) {
                value = nums[i];
    }

  }
  return value;
  }
  public int min(int[] nums){
    int value = nums[0];
    for(int i=0;i<nums.length;i++){
      if(nums[i]<value){
        value=nums[i];
      }
    }
    return value;
  }
}
