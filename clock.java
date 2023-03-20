/** Code for findining the minimum angle between the hour hand and minute hand
Input : Hour and minute
Output : The minumum angle between the hour hand and minute hand
*/

import java.lang.Math ;

class clock {
        public static void main(String[] argv) {

        double hour = 6;  // 0 <= hour <=12
        double minute = 30; // 0 <= minute <-60

        double min_angle = minute/60*360 ;
        double hour_angle = hour/12*360 + minute/60*30 ; 

        double diff ;
        diff = Math.abs(min_angle - hour_angle) ; 

        if (diff > 180) diff = 360 - diff ;
        System.out.println("THe minumum angle between the hour hand and the minute hand is\n"+ diff) ;
        }

}
