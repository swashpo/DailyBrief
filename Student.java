// contains constructor to define Student objects and methods to access student information

import java.util.Stack;

public class Student {

    private String student; // name
    private Stack<String> attendance = new Stack<String>();
    private int attendYes; // number of days present

    private Stack<String> focus = new Stack<String>();
    private int focusTotal;

    private Stack<String> initiative = new Stack<String>();
    private int iniTotal;

    private Stack<String> attitude = new Stack<String>();
    private Stack<String> perseverance = new Stack<String>();
    private Stack<String> cooperation = new Stack<String>();

    public Student(String name) {
        student = name;
        attendYes = 0;
        focusTotal = 0;
        iniTotal = 0;
    }

    // add attendance for the day
    public void addAttend(String attend) {
        // if click attendance box for said student, add "Y"
        // else add "N"
        // keep proactive tally of how many Y there are

        // if (yes)
        // attendYes++;

        attendance.push(attend);
    }

    // returns yesterday's attendance status and overall record so far
    public String getAttend() {
        String ratio = attendYes + "/" + attendance.size();

        return "Yesterday: " + attendance.peek() + " Overall: " + ratio;
    }

    /*
    For each area, rank out of 10
     */

    public void addFocus(int x) {
        focusTotal += x;
        focus.push("" + x);
    }

    // return running focus average
    public String getFocus() {
        return "Focus avg: " + focusTotal / focus.size();
    }

    public void addInit(int x) {
        iniTotal += x;
        initiative.push("" + x);
    }

    public String getInit() {
        return "Initiative avg: " + iniTotal / initiative.size();
    }

    public void addAtt() {}

    public String getAtt() {}

    public void addPer() {}

    public String getPer() {}

    public void addCoop() {}

    public String getCoop() {}

    public void addNote() {}

    public String getNotes() {}

    public void addPin() {}

    public String showPins() {}

    public String recommend() {}

}
