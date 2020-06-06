package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    final int missing;
    List<Integer> sequence;
    List<Integer> temp;

    public Main(int missing, List<Integer> sequence) {
        this.missing = missing;
        this.sequence = sequence;
    }

    void printNext() {
        int last;
        for (int i = 0; i < missing; i++) {
            temp = new ArrayList<>(sequence);
            last = computeNext(sequence.size());
            sequence.add(last);
            System.out.print(last);
            if (i + 1 < missing) {
                System.out.print(" ");
            }
        }
    }

    int computeNext(int len) {
        int dif = temp.get(len - 1);

        if (len == 1) {
            return temp.get(len - 1);
        }

        for (int i = 0; i < len - 1; i++) {
            temp.set(i, temp.get(i + 1) - temp.get(i));
        }
        if (temp.get(len - 1) == 0) {
            return temp.get(len - 1);
        } else {
            return dif + computeNext(len - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());

        Main[] parameters = new Main[lines];
        for (int i = 0; i < lines; i++) {
            String[] line = scanner.nextLine().split(" ");
            int len = Integer.parseInt(line[0]),
                    missing = Integer.parseInt(line[1]);

            List<Integer> sequence = new ArrayList<>();
            for (int j = 0; j < len; j++) {
                sequence.add(scanner.nextInt());
            }
            scanner.nextLine();
            parameters[i] = new Main(missing, sequence);
        }

        for (int i = 0; i < lines; i++) {
            parameters[i].printNext();
            if (i + 1 < lines) {
                System.out.println();
            }
        }
    }
}
