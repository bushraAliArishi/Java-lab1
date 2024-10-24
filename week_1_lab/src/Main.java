import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0, num2=0, num3 = 0, num4 = 0, count;
        double result, num5,num6,num7,num8;
        String myText = null;
        String myText2 = " ";
        boolean check = false;


       // Lab 1
        System.out.printf("Lab 1");
        System.out.println("    ********************************************************\n\t\t\t\t\t\t\t" +
                "question  1\n    ********************************************************");
        //1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
//        two numbers , takes two numbers as input
//        Test Data:
//        Input first number: 125
//        Input second number: 24
//        Expected Output :
//        125 + 24 = 149
//        125 - 24 = 101
//        125 x 24 = 3000
//        125 / 24 = 5
//        125 mod 24 = 5
        System.out.println("Enter Your first number ");
        num1 = input.nextInt();
        System.out.println("Enter Your second number ");
        num2 = input.nextInt();
        System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
        System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
        System.out.println(num1 + "x" + num2 + "=" + (num1 * num2));
        System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
        System.out.println(num1 + "mod" + num2 + "=" + (num1 % num2));


        System.out.println("    ********************************************************\n\t\t\t\t\t\t\t" +
                "question  2\n    ********************************************************");

//        2. Write a Java program that takes a number as input and prints its multiplication table up to
//        10.
//        Test Data:
//        Input a number: 8 Expected
//        Output :
//        8 x 1 = 8
//        8 x 2 = 16
//        8 x 3 = 24
//.
//        8 x 10 = 80
        System.out.println("Enter Your  number ");
        num1 = input.nextInt();
        for (count = 1; count <= 10; count++) {
            System.out.println(num1 + "x" + count + "=" + (num1 * num2));
        }

        System.out.println("    ********************************************************\n\t\t\t\t\t\t\t" +
                "question  3\n    ********************************************************");

//        3. Write a Java program to print the area and perimeter of a circle.
//        2
//        Test Data:
//        Radius = 7.5
//        Expected Output
//        Perimeter is = 47.12388980384689
//        Area is = 176.71458676442586
        System.out.println("Enter Radius ");
        num5 = input.nextDouble();
        result = (num5 * num5) * (3.14);
        System.out.println("Area is = " + result);
        result = (2 * (3.14) * num5);
        System.out.println("Perimeter is = " + result);


        System.out.println("    ********************************************************\n\t\t\t\t\t\t\t" +
                "question  4\n    ********************************************************");

//        4. Java program to find out the average of a set of integers
//        Enter the count of numbers:
//        5
//        Enter an integer:
//        3
//        Enter an integer:
//        8
//        Enter an integer:
//        6
//        Enter an integer:
//        7
//        Enter an integer:
//        2
//        The average is: 5.2
        result = 0;
        count = 1;
        System.out.println(" Enter the count of numbers: ");
        num1 = input.nextInt();

        while (count <= num1) {
            System.out.println(" Enter the count of numbers: ");
            num2 = input.nextInt();

            result = result + num2;

            count++;
        }

        System.out.println("The average is: " + result / (count - 1));

        System.out.println("    ********************************************************\n\t\t\t\t\t\t\t" +
                "question  5\n    ********************************************************");

//        5. Write a Java program that accepts three integers as input, adds the first two integers
//        together, and then determines whether the sum is equal to the third integer.
//        3
//        Sample Output:
//        Input the first number : 5
//        Input the second number: 10
//        Input the third number : 15
//        The result is: true
//                --------
//        Input the first number : 10
//        Input the second number: 20
//        Input the third number : 25
//        The result is: false
        System.out.println("Enter Your first number ");
        num1 = input.nextInt();
        System.out.println("Enter Your second number ");
        num2 = input.nextInt();
        System.out.println("Enter Your third number ");
        num3 = input.nextInt();
        check = num1 + num2 == num3;
        if (check) {

            System.out.println("The result is: " + check);
        } else System.out.println("The result is: " + check);

        System.out.println("    ********************************************************\n\t\t\t\t\t\t\t" +
                "question  6\n    ********************************************************");

//        6. Write a Java program to reverse a word.
//        Sample Output:
//        Input a word: dsaf
//        Reverse word: fasd
        //input.next();
        System.out.printf("Input a word : ");
        myText = input.next();
        count = myText.length() - 1;
        //    System.out.println("count = "+count);
        while (count >= 0) {
            myText2 = myText2 + (myText.charAt(count));
            // System.out.println(count+" char "+myText.charAt(count)+" word "+myText2);

            count--;
        }
        System.out.println("Reverse word : " + myText2);

        System.out.println("    ********************************************************\n\t\t\t\t\t\t\t" +
                "question  7\n    ********************************************************");

//        7 - Java program to check whether the given number is even or odd
//        Enter a number:
//        33
//        The number is Odd
//        Enter a number:
//        24
//        The number is Even
        System.out.println(" Enter a number: ");
        num1=input.nextInt();
       if (num1%2==0){
           System.out.println("The number is Even");
       }else System.out.println("The number is Odd");

        System.out.println("    ********************************************************\n\t\t\t\t\t\t\t" +
                "question  8\n    ********************************************************");

//        8 - Java program to convert the temperature in Centigrade to Fahrenheit
//
//        Enter temperature in Centigrade:
//        43
//        Temperature in Fahrenheit is: 109.4
        System.out.println("Enter temperature in Centigrade: ");
        num1=input.nextInt();
        System.out.println("Temperature in Fahrenheit is : "+((num1*1.8)+32));


        System.out.println("    ********************************************************\n\t\t\t\t\t\t\t" +
                "question  9\n    ********************************************************");

//        9.Write a Java program that takes a string and a number from the user,then prints the
//        character in the given index.
//                Test Data:
//        Input a string: Java Bootcamp
//        Input a number: 1
//        Expected Output:
        System.out.println("Input a string : ");
        myText = input.nextLine();
        input.next();
        System.out.printf("Input a number: ");
        num1=input.nextInt();
        System.out.println(myText.charAt(num1));

        System.out.println("    ********************************************************\n\t\t\t\t\t\t\t" +
                "question  10\n    ********************************************************");

//        10. Write a Java program to print the area and perimeter of a rectangle.
//        Test Data:
//        Width = 5.5 Height = 8.5
//        Expected Output
//        Area is 5.6 * 8.5 = 47.60
//        Perimeter is 2 * (5.6 + 8.5) = 28.20
        System.out.printf("Enter Width : ");
        num5 = input.nextDouble();
        System.out.printf("Enter Height : ");
        num6 = input.nextDouble();
        result = num5*num6;
        System.out.println("Area is "+num5+"x"+num6+"= " + result);
        result = 2 * (num5+ num6);
        System.out.println("Perimeter is 2x("+num5+"+"+num6+") =" + result);



        System.out.println("    ********************************************************\n\t\t\t\t\t\t\t" +
                "question  11\n    ********************************************************");

//        11. Write a Java program to compare two numbers.
//        Input Data:
//        Input first integer: 25
//        Input second integer: 39
//        Expected Output
//        25 != 39
//        25 < 39
//        25 <= 39
        System.out.println("Enter Your first number ");
        num1 = input.nextInt();
        System.out.println("Enter Your second number ");
        num2 = input.nextInt();
        for (count=1;count<7;count++){
            switch (count){
                case 1 :
                    if (num1<num2){
                        System.out.println(num1+">"+num2);}
                     continue;
                case 2:
                    if (num1>num2){
                    System.out.println(num1+">"+num2);}
                    continue;
                case 3 :
                    if (num1==num2) {
                    System.out.println(num1+"=="+num2);}
                    continue;
                case 4:
                    if (num1<=num2) {
                    System.out.println(num1+"<="+num2);}
                    continue;
                case 5:
                    if (num1>=num2) {
                    System.out.println(num1+">="+num2);}
                    continue;
                case 6:
                    if (num1!=num2) {
                    System.out.println(num1+"!="+num2);}
                    continue;
            }

            }




        System.out.println("    ********************************************************\n\t\t\t\t\t\t\t" +
                "question  12\n    ********************************************************");

//        12. Write a Java program to convert seconds to hours, minutes and seconds.
//        Sample Output:
//        Input seconds: 86399
//        23:59:59
        System.out.println("Input seconds : ");
        num1 = input.nextInt();
        num2=(num1/3600);
        num3=(num1/60)-(num2*60);
        num4=((num1-((num2*60)*60))-(num3*60));
        System.out.println(num2+":"+num3+":"+num4);

        System.out.println("    ********************************************************\n\t\t\t\t\t\t\t" +
                "question  13\n    ********************************************************");

//        13. Write a Java program that accepts four integers from the user and prints equal if all
//        four are equal, and not equal otherwise.
//                Sample Output:
//        Input first number: 25
//        Input second number: 37
//        Input third number: 45
//        Input fourth number: 23
//        Numbers are not equal!
        System.out.println("Input first number : ");
        num1 = input.nextInt();
        System.out.println("Input second number ");
        num2 = input.nextInt();
        System.out.println("Input third number");
        num3 = input.nextInt();
        System.out.println("Input fourth number");
        num4 = input.nextInt();
        if (num1==num2&&num2==num3&&num3==num4)
        {System.out.println("Numbers are equal!");

        }else System.out.println("Numbers are not equal!");


        System.out.println("    ********************************************************\n\t\t\t\t\t\t\t" +
                "question  14\n    ********************************************************");

//        14. Write a Java program that reads an integer and check whether it is negative, zero, or
//        positive.
//        Test Data Input a number: 7 Expected Output :
//        Number is positive

            System.out.println("Input a number : ");
            num1 = input.nextInt();
            if (num1>0){
                System.out.println(" Number is positive ");
            } else if (num1<0) {
                    System.out.println(" Number is negative ");
                }
                else
                System.out.println(" Number is zero ");



                System.out.println("    ********************************************************\n\t\t\t\t\t\t\t" +
                "question  15\n    ********************************************************");

//        15.Write a program to enter the numbers till the user wants and at the end it
//        should display the count of positive, negative and zeros entered
//        (End loop use -1 , Don’t count -1).
//                Test data
//        1
//        3
//        0
//                -2
//                -4
//                -1
//        2 positives
//        1 zero
//        2 negatives
        num2=0;
        num3=0;
        num4=0;
        check=true;
        System.out.println("if you want to stop enter -1");
        while (check) {
            num1 = input.nextInt();
            if (num1 == (-1)) {
                break;
            } else if (num1 > 0) {
                num2++;
            } else if (num1 < 0) {
                num3++;

            } else num4++;
        }
            System.out.println(num2+" positives\n"+num4+" zero\n"+num3+" negatives");

//



        System.out.println("    ********************************************************\n\t\t\t\t\t\t\t" +
                "question  16\n    ********************************************************");

//        16 - Write a program that prompts the user to input an integer and then outputs the
//        number with the digits reversed.
//                For example, if the input is 12345, the output should be 54321.
        System.out.println("Input first number : ");
        num1 = input.nextInt();
        num2 = 0;
        while (num1 != 0) {
            num2 = num2 * 10 + num1 % 10;
            num1 =num1/ 10;
        }
        System.out.println(num2);




        System.out.println("    ********************************************************\n\t\t\t\t\t\t\t" +
                "question  17\n    ********************************************************");

//        17 - Write a program to enter the numbers till the user wants and at the end the
//        program should display the largest and smallest numbers entered.
//                enter the number : 4
//        enter the number : 5
//        enter the number : -1
//        enter the number : 9
//        the large number : 9
//        the small number : -1
        count=0;
        check=true;
        while (check){
            System.out.println("Input number and to end enter -0: "+num1+":"+num2+":"+num3+":"+num4+"/"+count);
            num1 = input.nextInt();

            if(num1==(-0))
            { check=false;}

            else if (count==0){ num2=num1; }
            else if (count==1) {
                num2=num1;}
            else if (count>1) {
             if (num1>num2&&num3<num1)
                {num3=num1;num4=num2;num2=num1;}
            else if (num1<num2&&num4>num1 )
                {num3=num2;num4=num1;num2=num1;
                }}



            count++;
        }
        System.out.println(" the large number : "+num3);
        System.out.println(" the small number : "+num4);

        System.out.println("    ********************************************************\n\t\t\t\t\t\t\t" +
                "question  18\n    ********************************************************");

//        18 - Determine and print the number of times the character ‘a’ appears in the input
//        entered by the user.
//        Enter String:
//        Java bootcamp
//        Output: Number of a's: 3
        System.out.println("Input a text : ");
        myText = input.nextLine();
        num1=0;
        count=myText.length();
        while (count>0){
            if (myText.charAt(count-1)=='a')
            {num1++;}

            count--;
        }
        System.out.println("Number of a's : "+num1);
    }
}
