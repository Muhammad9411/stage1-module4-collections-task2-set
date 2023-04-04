package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {

        Set<String> result = new HashSet<>();

        Iterator<String> f_itr = firstSet.iterator();

        while (f_itr.hasNext()) {
            String f = f_itr.next();
            if (secondSet.contains(f)) {
                if (!thirdSet.contains(f)) {
                    result.add(f);
                }
            }
        }

        Iterator<String> th_itr = thirdSet.iterator();

        while (th_itr.hasNext()) {
            String th = th_itr.next();
            if (!firstSet.contains(th) && !secondSet.contains(th)) {
                result.add(th);
            }
        }

        return result;
    }
}
