package com.agraur.awesomequotes.funny;

import com.agraur.awesomequotes.core.Quote;

/**
 * Created by Alex.Graur@endava.com at 9/3/2020
 */
public class CoreController {

    public Quote getRandomQuote() {
        return new Quote("People say nothing is impossible. But I do nothing every day.", "A. A. Milne");
    }
}