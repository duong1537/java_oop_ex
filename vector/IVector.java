package vector;

public interface IVector {
    /*
     * The function calculates the length of the vector.
     */
    int length();

    /*
     * Euclidean normal function of vectors.
     */
    double magnitude();

    /*
     * The function returns the elements of the vector.
     */
    double[] elements();

    /*
     * The function returns the element of the vector at the index position.
     */
    double element(int index);

    /*
     * The function adds to the end of the vector an element with the value value.
     */
    void append(double value);

    /*
     * The function inserts at the index position of the vector an element with the value value.
     */
    void insert(double value, int index);

    /*
     * The function deletes an element of the vector at the index position.
     */
    void remove(int index);
}
