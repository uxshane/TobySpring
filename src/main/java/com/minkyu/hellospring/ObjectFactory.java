package com.minkyu.hellospring;

import com.minkyu.hellospring.exrate.ExRateProvider;
import com.minkyu.hellospring.exrate.WebApiExRatePaymentService;
import com.minkyu.hellospring.payment.PaymentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ObjectFactory {

    @Bean
    public PaymentService paymentService() {
        return new PaymentService(cachedExRateProvider());
    }

    @Bean
    public ExRateProvider cachedExRateProvider() {
        return new CachedExRateProvider(exRateProvider());
    }

    @Bean
    public ExRateProvider exRateProvider() {
        return new WebApiExRatePaymentService();
    }
}
