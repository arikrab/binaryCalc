package com.company;

public class Main {

    static int FromBoolToReal(boolean[] nubmber) {
        int decimalNumber = 0;

        for (int i = nubmber.length - 1, j = 1; i >= 0; i--) {

            if (nubmber[i] == true) {
                decimalNumber = decimalNumber + j;

            }
            j = j * 2;

        }
        return decimalNumber;
    }

    static void printInBinary(int realNumber) {
        if (realNumber==0){
            System.out.println(realNumber);
            return;
        }
        int count = 0;
        int temp = realNumber;

        while (temp != 0) {
            temp = temp / 2;
            count++;
        }
        int[] binaryArray = new int[count];
        for (int i = count - 1; i >= 0; i--) {

            if (realNumber % 2 == 1) {
                binaryArray[i] = 1;
                realNumber=realNumber/2;
            } else {
                binaryArray[i] = 0;
                realNumber=realNumber/2;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.print(binaryArray[i]);
        }
    }





    public static void main(String[] args) {

    	boolean[] num={true,false,false,false,false};
    	int realnum=FromBoolToReal(num);
        System.out.println(realnum);
        num=new boolean[]{false,true,false,false,false};
        realnum=FromBoolToReal(num);
        System.out.println(realnum);
        num=new boolean[]{false,false,true,false,false};
        realnum=FromBoolToReal(num);
        System.out.println(realnum);
        num=new boolean[]{false,false,false,true,false};
        realnum=FromBoolToReal(num);
        System.out.println(realnum);
        num=new boolean[]{false,false,false,false,true};
        realnum=FromBoolToReal(num);
        System.out.println(realnum);

        int number=5;
        printInBinary(7);

}
}