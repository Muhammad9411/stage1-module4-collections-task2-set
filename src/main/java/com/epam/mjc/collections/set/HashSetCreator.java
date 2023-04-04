package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (Integer s : sourceList) {
            hashSet.add(s);
            if (s % 2 == 0) {
                while (s % 2 == 0) {
                    s /= 2;
                    hashSet.add(s);
                }

            } else {
                hashSet.add(s * 2);
            }
        }
        return hashSet;
    }
}
