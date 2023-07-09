import java.util.Scanner;

public class Main {
    public int secondSmallest(int[] nums) {
        // Your code goes here
        java.util.Arrays.sort(nums);
        int Firstsmallest = nums[0];
        int temp = nums[0];
        int incerement = 1;
        while(nums[0] == temp){
            if(nums[0] < nums[incerement] && nums[0] != nums[incerement] ){
                temp = nums[incerement];
            }
            incerement++;
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
    }
}