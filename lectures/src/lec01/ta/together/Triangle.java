package lec01.ta.together;

public class Triangle {

    Point _a;
    Point _b;
    Point _c;

    static final double SIDE_EPSILON = 0.001;


    Triangle (Point a, Point b, Point c) {
        _a = a;
        _b = b;
        _c = c;
    }

    String category() {
        if (close_enough(side_ab(), side_bc()) &&
                close_enough(side_bc(), side_ca())) {
            return "equilateral";
        } else if (close_enough(side_ab(), side_bc()) ||
                close_enough(side_ab(), side_ca()) ||
                close_enough(side_bc(), side_ca())) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }

    double area() {
        double s = (this.side_ab() + this.side_bc() + this.side_ca() )/2.0;
        return Math.sqrt(s*(s-side_ab() )*(s-side_bc())*(s-side_ca()));
    }

    double side_ab() {
        return _a.distanceTo(_b);
    }

    double side_bc() {
        return _b.distanceTo(_c);
    }

    double side_ca() {
        return this._c.distanceTo(this._a);
    }

    static boolean close_enough(double a, double b) {
        // Epsilon bound test for side distances.
        return Math.abs(a-b) < SIDE_EPSILON;
    }


}
