package by.itstep.J1022.victorgalkevich.model;

public class VectorLogic {
    private VectorLogic() {
    }

    public static boolean isMirrored(Vector vector) {
        if(vector == null || vector.length() == 0){
            return false;
        }
        int limit = vector.length() / 2;
        int tIndex = vector.length() - 1;
        for (int i = 0; i <= limit; i++) {
            if (vector.get(i) != vector.get(tIndex - i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean allElementsAreEqual(Vector vector) {
        if(vector == null || vector.length() == 0){
            return false;
        }
        for (int i = 0; i < vector.length() - 1; i++) {
            if (vector.get(i) != vector.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean allElementsAreDifferent(Vector vector) {
        if(vector == null || vector.length() == 0){
            return false;
        }
        for (int i = 0; i < vector.length(); i++) {
            for (int j = i + 1; j < vector.length(); j++) {
                if (vector.get(i) == vector.get(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isAscending(Vector vector) {
        if(vector == null || vector.length() == 0){
            return false;
        }
        for (int i = 0; i < vector.length() - 1; i++) {
            if (vector.get(i) > vector.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDescending(Vector vector) {
        if(vector == null || vector.length() == 0){
            return false;
        }
        for (int i = 0; i < vector.length() - 1; i++) {
            if (vector.get(i) < vector.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static int getQuantityOfEvenNumbers(Vector vector) {
        if(vector == null || vector.length() == 0){
            return -1;
        }
        int counter = 0;
        for (int i = 0; i < vector.length(); i++) {
            if (vector.get(i) % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int getQuantityOfOddNumbers(Vector vector) {
        if(vector == null || vector.length() == 0){
            return -1;
        }
        return vector.length() - getQuantityOfEvenNumbers(vector);
    }
}
