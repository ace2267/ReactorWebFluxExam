package com.webflux.study.exam;

import reactor.core.CoreSubscriber;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ex1_1 {
    public static void main(String[] args) {
        Flux.just(1,3,4,6)
                .filter(n->n % 2 == 0)
                .map(n->n * 2)
                .subscribe(System.out::println);

        Mono.just(2)
                .filter(n->n % 2 == 0)
                .map(n->n * 2)
                .subscribe(System.out::println);
    }
}
