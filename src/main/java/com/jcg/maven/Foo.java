package com.jcg.maven;

public class Foo {


        public static int div(int a, int b) {
            if (b == 0) {
                throw new UnsupportedOperationException("Can't divide by zero!");
            }
            return a / b;
        }


}
