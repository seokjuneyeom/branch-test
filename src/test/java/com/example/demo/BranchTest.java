package com.example.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BranchTest {

    @Test
    @DisplayName("main")
    void main() {
        System.out.println("main");
    }

    @Test
    @DisplayName("merge")
    void merge() {
        System.out.println("merge");
    }

    @Test
    @DisplayName("main2")
    void main2() {
        System.out.println("main2");
    }

    @Test
    @DisplayName("main3")
    void main3() {
        System.out.println("main3");
    }


}
