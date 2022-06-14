package com.company;

import com.company.models.ContaCorrente;

public class Main {

    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente(101.0, 10.0);

        c1.sacar(100);
        System.out.println(c1.getSaldo());
    }
}
