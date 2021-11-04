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
    @DisplayName("main2")
    void main2() {
        System.out.println("main2");
    }
}
