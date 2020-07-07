package org.junit.jupiter.api;

import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

public class Assertions {
    protected Assertions(){}

    public static <V> V fail(){
        AssertionUtils.fail();
    }

    public static <V> V fail(String message){
        AssertionUtils.fail(message);
        return null;
    }

    public static <V> V fail(String message, Throwable cause){
        AssertionUtils.fail(message, cause);
        return null;
    }

    public static <V> V fail(Throwable cause){
        AssertionUtils.fail(cause);
        return null;
    }

    public static <V> V fail(Supplier<String> messageSupplier){
        AssertionUtils.fail(messageSupplier);
        return null;
    }

    //-- assertTrue --------------------------------
    public static void assertTrue(boolean condition){
        AssertTrue.assertTrue(condition);
    }

    public static void assertTrue(boolean condition, Supplier<String> messageSupplier){
        AssertTrue.assertTrue(condition, messageSupplier);
    }

    public static void assertTrue(BooleanSupplier booleanSupplier){
        AssertTrue.assertTrue(booleanSupplier);
    }

    public static void assertTrue(BooleanSupplier booleanSupplier, String message){
        AssertTrue.assertTrue(booleanSupplier, message);
    }

    public static void assertTrue(boolean condition, String message){
        AssertTrue.assertTrue(condition, message);
    }

    public static void assertTrue(BooleanSupplier booleanSupplier, Supplier<String> message){
        AssertTrue.assertTrue(booleanSupplier, message);
    }


}
