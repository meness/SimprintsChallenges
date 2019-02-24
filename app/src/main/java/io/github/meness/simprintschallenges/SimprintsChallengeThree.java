package io.github.meness.simprintschallenges;

import android.os.Build;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("SpellCheckingInspection")
class SimprintsChallengeThree {
    static int[] run(String[] strings) {
        List<Integer> valuesAsciiCodes = countAsciiCodes(strings);
        sort(valuesAsciiCodes, true);

        return toPrimitive(valuesAsciiCodes);
    }

    /**
     * Count ASCII codes.
     *
     * @param strings An array of {@link String}.
     * @return A {@link List<Integer>} of ASCII codes.
     */
    private static List<Integer> countAsciiCodes(String[] strings) {
        List<Integer> valuesAsciiCodes = new ArrayList<>(strings.length);

        for (String value : strings) {
            int valueAsciiCode = 0;

            for (char valueChar : value.toCharArray()) {
                valueAsciiCode += (int) valueChar;
            }

            valuesAsciiCodes.add(valueAsciiCode);
        }

        return valuesAsciiCodes;
    }

    /**
     * Sort lists.
     *
     * @param list       A {@link List} to be sorted.
     * @param descending Sort the the in descending order.
     */
    @SuppressWarnings("SameParameterValue")
    private static <T extends Comparable<T>> void sort(List<T> list, boolean descending) {
        if (descending) {
            Collections.sort(list, Collections.reverseOrder());
        } else {
            Collections.sort(list);
        }
    }

    /**
     * Convert {@link List<Integer>} to integers.
     *
     * @param integers A {@link List<Integer>}.
     * @return an integer array.
     */
    private static int[] toPrimitive(List<Integer> integers) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return integers.stream().mapToInt(i -> i).toArray();
        }

        int[] ret = new int[integers.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = integers.get(i);
        }
        return ret;
    }
}