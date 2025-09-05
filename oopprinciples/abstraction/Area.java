package oopprinciples.abstraction;

public class Area extends Abstract {

    @Override
    public double getAreaCircle(int radius) {
        return radius * radius * Math.PI;
    }

    @Override
    public double getAreaSquare(int edge) {
        // TODO Auto-generated method stub
        return edge * edge;
    }
    
}
