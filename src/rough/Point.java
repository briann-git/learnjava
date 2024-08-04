package rough;

public class Point {
    private final float x;
    private final float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point cast_obj)
            return ((this.x == cast_obj.x) && (this.y == cast_obj.y));

        return false;
    }
}



