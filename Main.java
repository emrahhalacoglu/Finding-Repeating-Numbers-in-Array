import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Array Lenght : ");
        int arrayLenght = input.nextInt();
        int[] list = new int[arrayLenght];
        for (int i = 0; i < list.length; i++)
        {
            int randomNumber = (int)(Math.random()*100);
            list[i] = randomNumber;
        }
        System.out.println(Arrays.toString(list));
        int[] repeatNum = new int[arrayLenght];
        int k = 0;
        for (int i = 0; i < list.length; i++)
        {
            for (int j = i + 1; j < list.length; j++)
            {
                if (list[i] == list[j] && list[i] % 2 == 0)
                {
                    int counter = 0;
                    for (int l = 0; l < repeatNum.length; l++)
                    {
                        if (list[i] == repeatNum[l])
                            {
                                counter++;
                                if (counter > 1)
                                {
                                    break;
                                }
                            }
                    }
                    if (counter > 1)
                    {
                        break;
                    }

                    repeatNum[k++] = list[i];
                    break;
                }
            }
        }
        int[] repeatNum_list = Arrays.copyOfRange(repeatNum, 0,k);
        System.out.println(Arrays.toString(repeatNum_list));
    }
}
