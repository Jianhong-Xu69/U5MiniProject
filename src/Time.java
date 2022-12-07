public class Time {

    /**
     * The Time class represents the Time. A time consists of hours, minutes, and seconds.
     */
    private int hours;
    private int minutes;
    private int seconds;

    /**
     * Constructor for the time class. This creates a new instance of Time given the following parameters
     * Logic is redundant but exists because I am a nerd who has suffered too much at the hands of testers
     *
     * @param h represents the hours of the Time object
     * @param m represents the minutes of the Time object
     * @param s represents the seconds of the Time object
     */
    public Time(int h, int m, int s) {
        hours = h;
        minutes = m;
        seconds = s;
        while (seconds >= 60) {
            seconds -= 60;
            minutes ++;
        }
        while (minutes >= 60) {
            minutes -= 60;
            hours ++;
        }
        while (hours >= 24) {
            hours -= 24;
        }
    }

    /**
     * Method for the time class. This increments seconds by 1, and can impact other parameters if seconds happens to exceed 60. Simulates ticking a single seconds on an actual clock
     * Once again, some logic is redundant. Once again I am a nerd who has suffered too much
     */
    public void tick() {
        seconds++;
        while (seconds >= 60) {
            seconds -= 60;
            minutes++;
        }
        while (minutes >= 60) {
            minutes -= 60;
            hours++;
        }
        while (hours >= 24) {
            hours -= 24;
        }
    }

    /**
     * Method for the Time class. This increments all the variables in the Time object by all the variables of another Time object.
     * Again still, some logic is redundant. Again still I am a nerd who hates user testing
     * @param t represents the Time object that is getting added to this Time object. Its hours, minutes, and seconds instance variables are all called
     */
    public void add(Time t) {
        hours += t.hours;
        minutes += t.minutes;
        seconds += t.seconds;
        while (seconds >= 60) {
            seconds -= 60;
            minutes++;
        }
        while (minutes >= 60) {
            minutes -= 60;
            hours++;
        }
        while (hours >= 24) {
            hours -= 24;
        }
    }

    /**
     * toString method for the Time class
     * @return all instance variables in the Time class in standard time format of HH:MM:SS
     */
    public String toString() {
        String temp = "";
        if (String.valueOf(hours).length() == 1) {
            temp += "0" + hours;
        } else {
            temp += hours;
        }
        temp += ":";
        if (String.valueOf(minutes).length() == 1) {
            temp += "0" + minutes;
        } else {
            temp += minutes;
        }
        temp += ":";
        if (String.valueOf(seconds).length() == 1) {
            temp += "0" + seconds;
        } else {
            temp += seconds;
        }
        return temp;
    }
}