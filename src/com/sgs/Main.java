package com.sgs;

import java.lang.management.ManagementFactory;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Waiting forever...");
        //Thread.sleep(1000);
        System.out.println("Waiting forever...");
        Thread.sleep(Long.MAX_VALUE);
    }
}
