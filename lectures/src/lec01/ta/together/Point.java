package lec01.ta.together;

public class Point {

    double _x;
    double _y;

    Point(double x, double y) {
        _x = x;
        _y = y;
    }

    double distanceTo(Point other) {
        return Math.sqrt(((this._x-other._x)*(this._x-other._x))+
                ((this._y-other._y)*(this._y-other._y)));
    }

}
