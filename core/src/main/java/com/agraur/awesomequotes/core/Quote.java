package com.agraur.awesomequotes.core;

/**
 * Created by Alex.Graur@endava.com at 9/3/2020
 */
public class Quote {

    private String quote;
    private String author;

    public Quote(String quote, String author) {
        this.quote = quote;
        this.author = author;
    }

    public String getQuote() {
        return quote;
    }

    public String getAuthor() {
        return author;
    }
}
