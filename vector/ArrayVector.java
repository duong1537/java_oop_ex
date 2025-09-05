package vector;

import java.util.Arrays;

public class ArrayVector implements IVector {
    private double[] data;
    private int length;

    public ArrayVector() {
        data = new double[1];
    }

    public ArrayVector(double[] coefficients) {
        this.data = coefficients;
        this.length = coefficients.length;
    }

    /*
     * The function doubles the number of elements in the array.
     * Since the array cannot change the number of elements after it has been allocated, to increase
     * number of array elements, need to re-allocate another array with double the number of elements,
     * then copy the elements of the old array to the new array.
     */
    private void extend() {
        double[] newData = new double[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    /*
     * The function adds an element to the end of the vector.
     * Check if the array has room to add a new element, if there is no space
     * then need to allocate a larger array.
     */
    @Override
    public void append(double value) {
        if (length == data.length) {
            extend();
        }
        data[length] = value;
        length++;
    }

    /*
     * The function adds an element to the vector at the index position.
     * Check if the array has room to add a new element, if there is no space
     * then need to allocate a larger array.
     */
    @Override
    public void insert(double value, int index) {
        if (length == data.length) {
            extend();
        }
        for (int i = length; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = value;
        length++;
    }

    /*
     * The function deletes an element of the vector at the index position.
     */
    @Override
    public void remove(int index) {
        for (int i = index; i < length - 1; i++) {
            data[i] = data[i + 1];
        }
        length--;
    }

    @Override
    public int length() {
        return length;
    }

    @Override
    public double magnitude() {
        double sum = 0;
        for (int i = 0; i < length; i++) {
            sum += data[i] * data[i];
        }
        return Math.sqrt(sum);
    }

    public double distanceTo(ArrayVector another) {
        if (length != another.length) {
            throw new IllegalArgumentException("Vectors have different lengths");
        }
        double sum = 0;
        for (int i = 0; i < length; i++) {
            double difference = data[i] - another.data[i];
            sum += difference * difference;
        }
        return Math.sqrt(sum);
    }

    @Override
    public double[] elements() {
        double[] result = new double[length];
        for (int i = 0; i < length; i++) {
            result[i] = data[i];
        }
        return result;
    }

    @Override
    public double element(int index) {
        return data[index];
    }

    public ArrayVector minus(ArrayVector another) {
        if (length != another.length) {
            throw new IllegalArgumentException("Vectors have different lengths");
        }
        double[] result = new double[length];
        for (int i = 0; i < length; i++) {
            result[i] = data[i] - another.data[i];
        }
        return new ArrayVector(result);
    }

    public ArrayVector plus(ArrayVector another) {
        if (length != another.length) {
            throw new IllegalArgumentException("Vectors have different lengths");
        }
        double[] result = new double[length];
        for (int i = 0; i < length; i++) {
            result[i] = data[i] + another.data[i];
        }
        return new ArrayVector(result);
    }

    public ArrayVector scale(double factor) {
        double[] result = new double[length];
        for (int i = 0; i < length; i++) {
            result[i] = data[i] * factor;
        }
        ArrayVector array1 = new ArrayVector(result);
        return array1;
    }

    public double dot(ArrayVector another) {
        if (length != another.length) {
            throw new IllegalArgumentException("Vectors have different lengths");
        }
        double result = 0;
        for (int i = 0; i < length; i++) {
            result += data[i] * another.data[i];
        }
        return result;
    }

    /*
     * The function returns the format of the vector: [a1, a2, ..., an].
     */

    @Override
    public String toString() {
        return Arrays.toString(data);
    }
}
