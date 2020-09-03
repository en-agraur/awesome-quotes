package com.agraur.awesomequotes.core;

/**
 * Created by Alex.Graur@endava.com at 9/3/2020
 */
public class CoreController implements CoreApi {

    @Override
    public Quote getRandomQuote() {
        return new Quote("Act as if what you do makes a difference. It does", "William James");
    }
}