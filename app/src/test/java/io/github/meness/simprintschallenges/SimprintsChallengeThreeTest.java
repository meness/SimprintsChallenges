package io.github.meness.simprintschallenges;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

@SuppressWarnings("SpellCheckingInspection")
public class SimprintsChallengeThreeTest {

    @Test
    public void run() {
        String[] simprintsValues = {
                "Relentless Commitment to Impact",
                "Robust as Fudge",
                "Be Surprisingly Bold",
                "Get Back Up",
                "Make it Happen",
                "Don't be a Jerk",
                "Confront the Grey",
                "Laugh Together, Grow Together"
        };

        int[] simprintsValuesAsciiCodes = SimprintsChallengeThree.run(simprintsValues);
        assertArrayEquals(new int[]{3039, 2720, 1923, 1633, 1406, 1271, 1232, 918}, simprintsValuesAsciiCodes);
    }
}