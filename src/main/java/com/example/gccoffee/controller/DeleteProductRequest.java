package com.example.gccoffee.controller;

import com.example.gccoffee.model.Category;

public record DeleteProductRequest(String productName, Category category, long price, String description) {
}
