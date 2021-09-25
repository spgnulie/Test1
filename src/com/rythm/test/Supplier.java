package com.rythm.test;

@FunctionalInterface
public interface Supplier<T> {
    T get();
}