import static java.lang.Math.*;
    //importing Math class
public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    //instance variables for the coordinates

    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
//initializing the variables under the constructor
    public double roundedToHundredth(double toRound) {
        double rounded = Math.round(toRound * 100.00) / 100.00;
        return rounded;
    }
    //rounding any number to the nearest hundredth

    public double slope() {
        double slope = (double) (y2 - y1) / (x2 - x1);
        double roundedSlope = roundedToHundredth(slope);
        return roundedSlope;
    }
// returns the slope rounded to the nearest hundredth
    public double distance() {
        double d = pow((pow(x2 - x1, 2)) + (pow(y2 - y1, 2)), 0.5);
        double roundedD = roundedToHundredth(d);
        return roundedD;
    }
// returns the distance between two points rounded to the nearest hundredth
    public double yIntercept() {
        double yIntercept = (double) (y2 - (slope() * x2));
        double roundedYIINT = roundedToHundredth(yIntercept);
        return roundedYIINT;
    }
    // return the y-Intercept rounded to the nearest hundredth

    public String equation() {
        int y = y2 - y1;
        int x = x2 - x1;
        if (slope() == 1.0) {
            if (yIntercept() < 0) {
                return "y = x - " + Math.abs(yIntercept());
            } else if (yIntercept() > 0) {
                return "y = x + " + yIntercept();
            } else {
                return "y = x";
            }
        }
        if (slope() == -1.0) {
            if (yIntercept() < 0) {
                return "y = -x - " + Math.abs(yIntercept());
            } else if (yIntercept() > 0) {
                return "y = -x + " + yIntercept();
            } else {
                return "y = -x";
            }
        }

            if (slope() == 0.0) {
                if (yIntercept() < 0) {
                    return "y = " + "-" + (int) (Math.abs(yIntercept()));
                }
                return "y = " + (int) (yIntercept());
            }
            if (y % x == 0) {
                if (yIntercept() < 0) {
                    return "y = " + (y) / (x) + "x" + " - " + Math.abs(yIntercept());
                } else if (yIntercept() == 0) {
                    return "y = " + (y) / (x) + "x ";
                }
                return "y = " + (y) / (x) + "x" + " + " + yIntercept();
            }
            if (x < 0) {
                y = -(y);
                x = Math.abs(x);
                if (yIntercept() < 0) {
                    return "y = " + y + "/" + x + "x " + "- " + Math.abs(yIntercept());
                } else if (yIntercept() == 0) {
                    return "y = " + y + "/" + x + "x ";
                }
                return "y = " + y + "/" + x + "x" + " + " + yIntercept();
            }
            if (yIntercept() < 0) {
                return "y = " + y + "/" + x + "x " + "- " + Math.abs(yIntercept());
            }
            if (yIntercept() == 0) {
                return "y = " + y + "/" + x + "x ";
            }
            return "y = " + y + "/" + x + "x" + " + " + yIntercept();
        }
        //returns strings of equations that have multiple criterias, and if the coordinates follow it, they will return that specific statement

        public String lineInfo () {
            String coordinatePt = "The two points are: (" + x1 + "," + y1 + ") " + "and " + "(" + x2 + "," + y2 + ")";
            String equation = "The equation of the line between these points is: " + equation();
            String slope = "The slope of the line is: " + slope();
            String yInt = "The y-intercept of the line is: " + yIntercept();
            String distance = "The distance between the two points is: " + distance();
            return coordinatePt + "\n" + equation + "\n" + slope + "\n" + yInt + "\n" + distance + "\n" + "\n";
        }
        //returns all the info from all these methods that's called in the Runner class

        public String coordinateForX ( double newX){
            double yVal = slope() * newX + yIntercept();
            return "The point on the line is: (" + newX + ", " + yVal + ")";
        }
    }
    // calculates the y value for the new inputted x value
