public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double roundedToHundredth(double toRound) {
        double rounded = Math.round(toRound * 100.00) / 100.00;
        return rounded;
    }

    public double slope() {
        double slope = (double) (y2 - y1) / (double) (x2 - x1);
        double roundedSlope = roundedToHundredth(slope);
        return roundedSlope;
    }

    public double distance() {
        double d = Math.pow((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)), 0.5);
        double roundedD = roundedToHundredth(d);
        return roundedD;
    }

    public double yIntercept() {
        double yIntercept = y2 - (slope() * x2);
        double roundedYIINT = roundedToHundredth(yIntercept);
        return roundedYIINT;
    }

    public String equation() {
        int x = x2 - x1;
        int y = y2 - y1;
        if (x < 0) {
            x = Math.abs(x);
            y = -y;
        }
        String slope = y + "/" + x;

        if (yIntercept() < 0) {
            return "y= " + slope + "x " + "-" + Math.abs(yIntercept());
        } else {
            return "y= " + slope + "x " + Math.abs(yIntercept());
        }

    }


}