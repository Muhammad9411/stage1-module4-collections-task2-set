package com.epam.mjc.collections.set;

import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {

        NavigableSet<Integer> hashSet = new TreeSet<>();

        for (Integer s : sourceList) {
            hashSet.add(s * s);
        }

        return hashSet.subSet(lowerBound, upperBound+1);
    }
}
