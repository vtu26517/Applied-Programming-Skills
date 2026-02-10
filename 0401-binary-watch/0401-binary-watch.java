import java.util.*;

class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> result = new ArrayList<>();

        // Try all possible hours (0–11)
        for (int hour = 0; hour < 12; hour++) {

            // Try all possible minutes (0–59)
            for (int minute = 0; minute < 60; minute++) {

                // Count total ON LEDs
                int bits = Integer.bitCount(hour) + Integer.bitCount(minute);

                if (bits == turnedOn) {
                    // Format minute to always have 2 digits
                    String time = hour + ":" + String.format("%02d", minute);
                    result.add(time);
                }
            }
        }

        return result;
    }
}
