import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //task 1.1

        int [] nums = new int[]{1, 2, 3};

        //task 1.2

        double [] fractionalNums = {1.57, 7.654, 9.986};

        //task 1.3

        int [] randomArray = new int [11];

        //task 2 (randomArray)

        for (int i = 0; i <= randomArray.length; i++){
            randomArray[i] = i;
            if (i == randomArray.length - 1){
                System.out.print(randomArray[i] + "\n");
                break;
            }
            else{
                System.out.print(randomArray[i] + ", ");
            }
        }

        //task2(nums)

        for (int i = 0; i <= nums.length; i++){
            if (i == nums.length - 1){
                System.out.print(nums[i] + "\n");
                break;
            }
            else{
                System.out.print(nums[i] + ", ");
            }
        }

        //task2(fractionalNums)

        for (int i = 0; i <= fractionalNums.length; i++){
            if (i == fractionalNums.length - 1){
                System.out.print(fractionalNums[i] + "\n");
                break;
            }
            else{
                System.out.print(fractionalNums[i] + ", ");
            }
        }

        System.out.println("\n");

        //task3(randomArrayReversed)

        for (int i = randomArray.length - 1; i >= 0; i--){
            if (i == 0){
                System.out.print(randomArray[i] + "\n");
            }
            else{
                System.out.print(randomArray[i] + ", ");
            }
        }

        //task3(numsReversed)

        for (int i = nums.length - 1; i >= 0; i--){
            if (i == 0){
                System.out.print(nums[i] + "\n");
            }
            else{
                System.out.print(nums[i] + ", ");
            }
        }

        //task3(fractionalNumsReversed)

        for (int i = fractionalNums.length - 1; i >= 0; i--){
            if (i == 0){
                System.out.print(fractionalNums[i] + "\n");
            }
            else{
                System.out.print(fractionalNums[i] + ", ");
            }
        }
        System.out.println("\n");
        //task 4

        for (int i = 0; i <= nums.length - 1; i++){
            if (nums[i] % 2 != 0){
                nums[i] = nums[i] + 1;
            }
        }
        System.out.print(Arrays.toString(nums));



    }
}