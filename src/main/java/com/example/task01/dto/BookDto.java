package com.example.task01.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;


    @NotBlank(message = "Book name is mandatory")
    @Size(min = 2, max = 40, message = "Book name should be between 2 and 40 characters")
    private String name;

    @NotBlank(message = "Author is mandatory")
    @Size(min = 2, max = 30, message = "Author should be between 2 and 40 characters")
    private String author;

    @NotNull(message = "The number of pages is mandatory")
    @Positive(message = "Page count should be greater than 0")
    private Integer page;

    @NotNull(message = "Weight is mandatory")
    @Positive(message = "Weight should be greater than 0")
    private Integer weightInGrams;

    @NotNull(message = "Price is mandatory")
    @PositiveOrZero(message = "Price cannot be negative")
    private Integer priceInKopecks;

}
