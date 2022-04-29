package com.learnreactiveprogramming.basic;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public class FSubscriber implements Subscriber<String> {

    private final int count;

    public FSubscriber(int count) {
        this.count = count;
    }

    @Override
    public void onSubscribe(Subscription subscription) {
        subscription.request(count);
    }

    @Override
    public void onNext(String element) {
        System.out.println("element in >>> " + element);
    }

    @Override
    public void onError(Throwable t) {
        System.out.println("subscriber onError");
    }

    @Override
    public void onComplete() {
        System.out.println("subscriber onComplete");
    }
}
