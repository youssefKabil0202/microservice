package com.example.stock_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class StockController {

    private List<Stock> stocks = Arrays.asList(
            new Stock(1, 10), // 10 ordinateurs disponibles
            new Stock(2, 5)   // 5 souris disponibles
    );

    @GetMapping("/stock/{productId}")
    public Stock getStockByProductId(@PathVariable int productId) {
        return stocks.stream()
                .filter(s -> s.getProductId() == productId)
                .findFirst()
                .orElse(new Stock(productId, 0)); // Si non trouvé → stock = 0
    }
}

