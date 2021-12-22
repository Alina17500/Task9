package ru.vsu.cs.volobueva;

import java.util.List;

public class TransformList {
    public static List<Integer> transformList(List<Integer> list) {
        int maxElement = searchForMaxElement(list);
        int minElement = searchForMinElement(list);

        int maxIndex = searchForMaxIndex(list, maxElement);
        int minIndex = searchForMinIndex(list, minElement);

        int i = minIndex - 1;

        for (int row = maxIndex + 1; row <= minIndex/2; row++) {
            int temp = list.get(row);
            list.set(row, list.get(i));
            list.set(i, temp);
            i--;
        }
        return list;
    }

    private static int searchForMaxElement(List<Integer> list) {
        int maxElement = 0;

        for (Integer value : list) {
            if (value > maxElement) {
                maxElement = value;
            }
        }
        return maxElement;
    }

    private static int searchForMinElement(List<Integer> list) {
        int minElement = 9000000;

        for (Integer value : list) {
            if (value < minElement) {
                minElement = value;
            }
        }
        return minElement;
    }

    private static int searchForMaxIndex(List<Integer> list, int maxElement) {
        int maxIndex = 0;

        for (int row = list.size() - 1; row >= 0; row--) {
            if (list.get(row) == maxElement) {
                maxIndex = row;
            }
        }

        return maxIndex;
    }

    private static int searchForMinIndex(List<Integer> list, int minElement) {
        int minIndex = list.size();

        for (int row = 0; row < list.size(); row++) {
            if (list.get(row) == minElement) {
                minIndex = row;
            }
        }
        return minIndex;
    }
}
