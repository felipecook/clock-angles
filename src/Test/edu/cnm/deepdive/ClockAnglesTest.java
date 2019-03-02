package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

class ClockAnglesTest {

    /*
  first, we need to figure out where the hour hand is on the clock depending
  the hour variable.

  second, we need to figure out where the minute hand is on the clock depending
  on the minute variable (floating point).

  finally, we need to find the distance between these two points and represent
  it in degrees.
   */

    @Test
    void determineHourHand() {
      int hour = 0;
      int[] clock = new int[12];

      for (int i = 0; i < clock.length; i++) {
        clock = (IntStream.range(1, 13).toArray());
        System.out.println("clock check" + clock);
      }

      // normalize the hour variable
      if (hour > 11) {
        hour = hour % 12;
      } else {
        System.out.println("hour is normal");
      }

      // determine location of hour variable in array range
      for (int i : clock) {
        if (hour == clock[i]) {

        }
      }


    }



}