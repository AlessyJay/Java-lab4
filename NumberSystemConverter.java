import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Operation {
    // Operation A
    public static void toBinary(String store) {
        int result = Integer.parseInt(store, 2);

        System.out.println(String.format("Your result in decimal from binary is: %s",
                result + "\n" + "----------------------------------------------------"));
    }

    public static void toHexadecimal(String store) {
        int result = Integer.parseInt(store, 16);

        System.out.println(String.format("Your result in decimal from hexadecimal is: %s",
                result + "\n" + "----------------------------------------------------"));
    }

    // Operation B
    public static void decimalToBinary(int store) {
        String result = Integer.toBinaryString(store);

        System.out.println(String.format("Your result in binary from decimal is: %s",
                result + "\n" + "----------------------------------------------------"));
    }

    public static void decimalToHexadecimal(int store) {
        String result = Integer.toHexString(store);

        System.out.println(String.format("Your result in hexadecimal from decimal is: %s",
                result + "\n" + "----------------------------------------------------"));
    }

    // Operation C
    public static void operationCSum(String num1, String num2, String choose1, String choose2, String display) {
        int count1 = Integer.parseInt(num1), count2 = Integer.parseInt(num2);
        int num1BinaryResult = Integer.parseInt(num1, 2), num2BinaryResult = Integer.parseInt(num2, 2),
                num1HexaResult = Integer.parseInt(num1, 16), num2HexaResult = Integer.parseInt(num2, 16);
        String result;

        if (choose1.equals("2")) {
            if (choose2.equals("10")) {
                switch (display) {
                    case "2":
                        int sum = num1BinaryResult + count2;

                        System.out.println("num1Binary = " + num1BinaryResult);
                        System.out.println("num2Binary = " + count2);
                        System.out.println("Sum = " + sum);

                        result = Integer.toBinaryString(sum);

                        System.out.println(String.format("Your result in binary from summing is: %s",
                                result + "\n" + "----------------------------------------------------"));
                        break;

                    case "10":
                        result = Integer.toString(num1BinaryResult + count2);

                        System.out.println("num1Binary = " + num1BinaryResult);
                        System.out.println("num2Binary = " + count2);
                        System.out.println("Sum = " + result);

                        System.out.println(String.format("Your result in decimal from summing is: %s",
                                result + "\n"
                                        + "----------------------------------------------------"));
                        break;

                    case "16":
                        result = Integer.toHexString(num1HexaResult + count2);

                        System.out.println("num1 = " + num1HexaResult);
                        System.out.println("num2 = " + count2);
                        System.out.println("Sum = " + result);

                        System.out.println(String.format("Your result in hexadecimal from summing is: %s",
                                result + "\n" + "----------------------------------------------------"));
                        break;
                }
            }

            if (choose2.equals("2")) {
                switch (display) {
                    case "2":
                        int sum2 = num1BinaryResult + num2BinaryResult;
                        result = Integer.toBinaryString(sum2);

                        System.out.println(String.format("Your result in binary from summing is: %s",
                                result + "\n" + "----------------------------------------------------"));
                        break;

                    case "10":
                        int sum10 = num1BinaryResult + num2BinaryResult;

                        System.out.println(String.format("Your result in decimal from summing is: " +
                                "%s",
                                sum10 + "\n" + "----------------------------------------------------"));
                        break;

                    case "16":
                        String sum16 = Integer.toHexString(num1BinaryResult + num2BinaryResult);

                        System.out.println(String.format("Your result in decimal from summing is: " +
                                "%s",
                                sum16 + "\n" + "----------------------------------------------------"));
                        break;
                }
            }
        }
    }
}

class SmartCal {
    public static void main(String[] args) throws IOException, NumberFormatException {
        String usersInput;
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Welcome to Smart Calculator!");
        System.out.println("Please, choose operation that suits you best. \n");

        do {
            System.out.println("A: Convert from any system to the decimal system.");
            System.out.println("B: Convert from decimal system to another system.");
            System.out.println("C: Summing up numbers from different system.");
            System.out.println("D: Substracting numbers from different system.");
            System.out.println("E: Multiplying numbers from different system.");
            System.out.println("F: Divinding numbers from different system. \n");
            System.out.println("W: Exit program");
            usersInput = BR.readLine().toUpperCase();

            if (usersInput.equals("A")) {
                String count;
                System.out.print("Welcome to binary or hexadecimal to decimal converter," +
                        " type your number to convert: ");
                count = BR.readLine();
                System.out.print("Choose your system (2 or 16): ");
                usersInput = BR.readLine();

                if (usersInput.equals("2")) {
                    Operation.toBinary(count);
                } else if (usersInput.equals("16")) {
                    Operation.toHexadecimal(count);
                }
            }

            if (usersInput.equals("B")) {
                int count;
                System.out.print("Welcome to decimal to binary or hexadecimal converter," +
                        " type your number to convert: ");
                count = Integer.parseInt(BR.readLine());
                System.out.print("Choose your system (2 or 16): ");
                usersInput = BR.readLine();

                if (usersInput.equals("2")) {
                    Operation.decimalToBinary(count);
                } else if (usersInput.equals("16")) {
                    Operation.decimalToHexadecimal(count);
                }
            }

            if (usersInput.equals("C")) {
                String num1, num2;
                String choose1, choose2;

                System.out.print("Welcome to numbers summation," +
                        " type your first number to convert: ");
                num1 = BR.readLine();
                System.out.print("What system of the number is it from?: ");
                choose1 = BR.readLine();
                System.out.print("Great! Now let us know your second number: ");
                num2 = BR.readLine();
                System.out.print("What system of the number is it from?: ");
                choose2 = BR.readLine();
                System.out.print("Choose your display system result (2, 10, and 16): ");
                usersInput = BR.readLine();
                System.out.println(usersInput);

                Operation.operationCSum(num1, num2, choose1, choose2, usersInput);
            }
        } while (!usersInput.equals("W"));
    }
}