package com.jhkwak.orderservice.scheduler;

import com.jhkwak.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ScheduledTasks {

    private final OrderService orderService;

    // 매일 자정에 실행
    // 배송중, 배송 완료 상태값 업데이트 스케줄러
    @Scheduled(cron = "0 0 0 * * ?")
    public void performTaskAtMidnight() {
        orderService.deliveryStatusUpdate();
        System.out.println("스케줄러 접근");
    }
}
