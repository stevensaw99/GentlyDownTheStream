package com.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class GentlyDownTheStream
{
        protected List<String> fruits;
        protected List<String> veggies;
        protected List<Integer> integerValues;

        public GentlyDownTheStream() {
            fruits = Arrays.asList("Apple", "Orange", "Banana", "Pear", "Peach", "Tomato");
            veggies = Arrays.asList("Corn", "Potato", "Carrot", "Pea", "Tomato");
            integerValues = new Random().ints(0, 1001)
                    .boxed()
                    .limit(1000)
                    .collect(Collectors.toList());
        }

        // TODO - return a list of sorted fruits based on the fruits list
        public List<String> sortedFruits()
        {
            return fruits.stream()
                    .sorted()
                    .collect(Collectors.toList());
        }

        // TODO - return a list of sorted fruits with all fruits filtered out that start with "A"
        public List<String> sortedFruitsException()
        {
            return fruits.sortedFruitsException()
                    .sorted()
                    .collect(Collectors.toList());
        }

        // TODO - return a list with the first 2 elements of a sorted list of fruits
        public List<String> sortedFruitsFirstTwo()
        {
            return fruits.sortedFruitsFirstTwo()
                    .sorted()
                    .collect(Collectors.toList());
        }

        // TODO - return a comma separated String of sorted fruits
        public String commaSeparatedListOfFruits()
        {
            return fruits.commaSeparatedListOfFruits()
                    .sorted()
        }

        // TODO - return a list of veggies that are sorted in reverse (descending) order
        public List<String> reverseSortedVeggies()
        {
            return veggies.reverseSortedVeggies()
                    .sorted()
                    .collect(Collectors.toList());
        }

        // TODO - return a list of veggies that are sorted in reverse order, and all in upper case
        public List<String> reverseSortedVeggiesInUpperCase()
        {
            return veggies.reverseSortedVeggiesInUpperCase()
                    .add()
                    .sorted()
                    .collect(Collectors.toList());
        }

        // TODO - return a list of the top 10 values in the list of random integers
        public List<Integer> topTen()
        {
            return fruits.stream.topTen()
                    .random();
                    .boxed()
                    .sorted();
                    .collect(Collectors.toList());
        }

        // TODO - return a list of the top 10 unique values in the list of random integers
        public List<Integer> topTenUnique()
        {
            return fruits.stream.topTenUnique()
                    .boxed();
                    .sorted()
                    .collect(Collectors.toList());
        }

        // TODO - return a list of the top 10 unique values in the list of random integers that are odd
        public List<Integer> topTenUniqueOdd()
        {
            return fruits.stream.topTenUniqueOdd()
                    .boxed();
                    .sorted()
                    .collect(Collectors.toList());

        }

        // TODO - return a single value that represents the average of all of your random numbers
        public Double average()
        {
            return fruits.stream.average()
                    .sorted()
                    .collect(Collectors.toList());

        }
    }


