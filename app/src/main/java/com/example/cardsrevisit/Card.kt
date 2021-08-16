package com.example.cardsrevisit

import kotlin.random.Random

enum class Suit
{
    HEARTS, DIAMONDS, CLUBS, SPADES
}

enum class Rank
{
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
}

class Card (val suit: String, val rank: String){
    var flip : Boolean = true;

    fun flip()
    {
        flip = !flip;
    }

    fun printDetails()
    {
        when(flip)
        {
            true -> println("Suit: $suit Rank: $rank");
            false -> println("----");
        }
    }
}