package com.webflux.study.exam;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;
@Slf4j
public class ex10_1 {
    // Reactor의 Scheduler는 비동기 프로그래밍을 위해 사용되는 스레드를 관리해줌.
    public static void main(String[] args) {
        Flux.fromArray(new Integer[] {1,2,3,4})
                .subscribeOn(Schedulers.boundedElastic())
                .doOnNext(data->log.info("# doOnNext: {}",data))
                .doOnSubscribe()
    }
}
