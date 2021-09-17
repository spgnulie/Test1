package com.runoob.test;

@FunctionalInterface
public interface Supplier<T> {
    T get();
}