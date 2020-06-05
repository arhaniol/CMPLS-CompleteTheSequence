package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        Scanner scanner =new Scanner(System.in);
        int lines=Integer.parseInt(scanner.nextLine());
        class Parameters{
            int len;
            int missing;
            int[] sequence;

            public Parameters(int missing, int[] sequence) {
                this.len = sequence.length;
                this.missing = missing;
                this.sequence = sequence;
            }
            int computeNext(int len){
                int dif=0;
                for (int i = 0; i <len ; i++) {
                    dif+=computeNext(len-1);
                    if (dif > 0) {

                    }
                }
                return dif;
            }
        }

        Parameters[] parameters=new Parameters[lines];
        for (int i = 0; i < lines ; i++) {
            int len=scanner.nextInt(),
                    missing=scanner.nextInt();
            int[] sequence=new int[len];
            for (int j = 0; j <len ; j++) {
                sequence[i]=scanner.nextInt();
                System.out.println(sequence[i]);
            }
            parameters[i]=new Parameters(missing,sequence);
        }
    }
}
