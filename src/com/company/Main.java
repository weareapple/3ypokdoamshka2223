package com.company;

public class Main {

    public static void main(String[] args) {

        BankAccount ba = new BankAccount();
        ba.deposit(20000);

        while (true) {
            try {
                ba.withDraw(6000);
            } catch (LimitException le) {
                System.out.println(le.getMessage());
                try {
                    ba.withDraw((int) ba.getAmount());
                } catch (LimitException l) {
                    l.printStackTrace();
                }
                break;
            }

        }
    }
}
