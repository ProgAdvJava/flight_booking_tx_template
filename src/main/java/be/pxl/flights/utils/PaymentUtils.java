package be.pxl.flights.utils;

import be.pxl.flights.exception.InsufficientAmountException;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class PaymentUtils {

    private static final Map<String, Double> paymentMap = new HashMap<>();

    static {
        paymentMap.put("VISA-001", 500.0);
        paymentMap.put("VISA-002", 8000.0);
        paymentMap.put("MASTERCARD-001", 1500.0);
        paymentMap.put("MASTERCARD-002", 250.0);
    }

    public static String handlePayment(String account, double amount) {
        if (amount > paymentMap.get(account)) {
            throw new InsufficientAmountException("insufficient fund..!");
        } else {
            paymentMap.computeIfPresent(account, (key, value) -> value - amount);
            return UUID.randomUUID().toString();
        }
    }
}
