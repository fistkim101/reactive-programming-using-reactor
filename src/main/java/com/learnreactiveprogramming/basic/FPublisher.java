package com.learnreactiveprogramming.basic;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.util.List;
import java.util.stream.IntStream;

public class FPublisher implements Publisher<String> {

    private final List<String> data;

    public FPublisher(List<String> data) {
        this.data = data;
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscriber.onSubscribe(new Subscription() {
            @Override
            public void request(long n) {
                IntStream.range(0, (int) n)
                        .forEach(index -> subscriber.onNext(data.get(index)));

                subscriber.onComplete();
            }

            @Override
            public void cancel() {

            }
        });
    }

}
