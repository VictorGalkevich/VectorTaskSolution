package by.itstep.J1022.victorgalkevich.model;

public class Exam {
    private static final int MAX_MARK_VALUE = 5;
    private static final int MIN_MARK_VALUE = 0;

    private Exam() {
    }

    public static double[][] getMarkPercentages(Vector vector) {
        for (int i = 0; i < vector.length(); i++) {
            if (vector.get(i) < MIN_MARK_VALUE || vector.get(i) > MAX_MARK_VALUE) {
                return new double[0][0];
            }
        }
        double[][] result = new double[6][2];
        for (int i = 0; i < vector.length(); i++) {
            result[vector.get(i)][0]++;
        }

        for (int i = 0; i < 6; i++) {
            result[i][1] = (result[i][0] / vector.length()) * 100;
        }
        return result;
    }
}
