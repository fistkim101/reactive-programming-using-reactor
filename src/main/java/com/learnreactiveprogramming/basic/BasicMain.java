package com.learnreactiveprogramming.basic;

import org.reactivestreams.Publisher;

import java.util.List;

public class BasicMain {
    public static void main(String[] args) {

        Publisher<String> publisher = new FPublisher(List.of("1", "2", "3"));
        publisher.subscribe(new FSubscriber(3));

    }
}
