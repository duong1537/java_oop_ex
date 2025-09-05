package vector;
import java.util.ArrayList;
import java.util.List;

public class ListVector implements IVector {
    private List<Double> data;

    public ListVector() {
        this.data = new ArrayList<>();
    }

    public ListVector(List<Double> data) {
        this.data = new ArrayList<>(data);
    }

    @Override
    public void append(double value) {
        data.add(value);
    }

    @Override
    public void insert(double value, int index) {
        data.add(index, value);
    }

    @Override
    public void remove(int index) {
        data.remove(index);
    }

    @Override
    public int length() {
        return data.size();
    }

    @Override
    public double magnitude() {
        double sum = 0;
        for (double value : data) {
            sum += value * value;
        }
        return Math.sqrt(sum);
    }

    public double distanceTo(ListVector another) {
        if (this.length() != another.length()) {
            throw new IllegalArgumentException("Vectors must have the same length.");
        }

        double sum = 0;
        for (int i = 0; i < this.length(); i++) {
            double diff = this.element(i) - another.element(i);
            sum += diff * diff;
        }
        return Math.sqrt(sum);
    }

    @Override
    public double[] elements() {
        double[] elements = new double[length()];
        for (int i = 0; i < length(); i++) {
            elements[i] = data.get(i);
        }
        return elements;
    }

    @Override
    public double element(int index) {
        return data.get(index);
    }

    public ListVector minus(ListVector another) {
        if (this.length() != another.length()) {
            throw new IllegalArgumentException("Vectors must have the same length.");
        }

        List<Double> result = new ArrayList<>();
        for (int i = 0; i < this.length(); i++) {
            result.add(this.element(i) - another.element(i));
        }
        return new ListVector(result);
    }

    public ListVector plus(ListVector another) {
        if (this.length() != another.length()) {
            throw new IllegalArgumentException("Vectors must have the same length.");
        }

        List<Double> result = new ArrayList<>();
        for (int i = 0; i < this.length(); i++) {
            result.add(this.element(i) + another.element(i));
        }
        return new ListVector(result);
    }

    public ListVector scale(double factor) {
        List<Double> result = new ArrayList<>();
        for (int i = 0; i < this.length(); i++) {
            result.add(this.element(i) * factor);
        }
        return new ListVector(result);
    }

    public double dot(ListVector another) {
        double result = 0;
        for (int i = 0; i < length(); i++) {
            result += element(i) * another.element(i);
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < length(); i++) {
            sb.append(element(i));
            if (i < length() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

}

