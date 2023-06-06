package by.itstep.J1022.victorgalkevich.model;

import org.junit.Assert;
import org.junit.Test;

import static by.itstep.J1022.victorgalkevich.model.VectorLogic.*;

public class VectorLogicTest {

    @Test
    public void testMirroredNegative() {
        //Arrange
        Vector vector1 = new Vector(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        Vector vector2 = new Vector(new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 3});
        Vector vector3 = new Vector(new int[]{123, 2, 0, 23, 77, 99, 2223, 809, 3453, 10});
        Vector vector4 = new Vector(new int[]{5, 4, 3, 3, 2, 1, 2, 3, 4, 5});
        Vector vector5 = new Vector(new int[]{10, 9, 0, 0, 0, 1, 0, 0, 9, 10});

        //Assert
        Assert.assertSame(false, isMirrored(vector1));
        Assert.assertSame(false, isMirrored(vector2));
        Assert.assertSame(false, isMirrored(vector3));
        Assert.assertSame(false, isMirrored(vector4));
        Assert.assertSame(false, isMirrored(vector5));
    }

    @Test
    public void testMirroredPositive() {
        //Arrange
        Vector vector1 = new Vector(new int[]{1, 2, 3, 4, 5, 5, 4, 3, 2, 1});
        Vector vector2 = new Vector(new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2});
        Vector vector3 = new Vector(new int[]{123, 2, 0, 23, 77, 77, 23, 0, 2, 123});
        Vector vector4 = new Vector(new int[]{123, 7, 65, 77, 65, 7, 123});
        Vector vector5 = new Vector(new int[]{0, 1, 0});

        //Assert
        Assert.assertSame(true, isMirrored(vector1));
        Assert.assertSame(true, isMirrored(vector2));
        Assert.assertSame(true, isMirrored(vector3));
        Assert.assertSame(true, isMirrored(vector4));
        Assert.assertSame(true, isMirrored(vector5));
    }

    @Test
    public void testMirroredZeroSize() {
        //Arrange
        Vector vector1 = new Vector(new int[]{});
        //Assert
        Assert.assertSame(false, isMirrored(vector1));
    }

    @Test
    public void testMirroredNull() {
        //Arrange
        Vector vector1 = null;
        //Assert
        Assert.assertSame(false, isMirrored(vector1));
    }

    @Test
    public void testMirroredWithoutInitialization() {
        //Arrange
        Vector vector1 = new Vector();
        //Assert
        Assert.assertSame(true, isMirrored(vector1));
    }

    @Test
    public void testEqualElementsNegative() {
        //Arrange
        Vector vector1 = new Vector(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        Vector vector2 = new Vector(new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 3});
        Vector vector3 = new Vector(new int[]{-123, 2, -0, 23, 77, 99, 2223, 809, 3453, 10});
        Vector vector4 = new Vector(new int[]{5, 4, 3, 3, 2, 1, 2, 3, 4, 5});
        Vector vector5 = new Vector(new int[]{10, 9, 0, 0, 0, 1, 0, 0, 9, 10});
        Vector vector6 = new Vector(new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, -2});


        //Assert
        Assert.assertSame(false, allElementsAreEqual(vector1));
        Assert.assertSame(false, allElementsAreEqual(vector2));
        Assert.assertSame(false, allElementsAreEqual(vector3));
        Assert.assertSame(false, allElementsAreEqual(vector4));
        Assert.assertSame(false, allElementsAreEqual(vector5));
        Assert.assertSame(false, allElementsAreEqual(vector6));
    }

    @Test
    public void testEqualElementsPositive() {
        //Arrange
        Vector vector1 = new Vector(new int[]{0, 0, 0, 0, 0, 0, 0});
        Vector vector2 = new Vector(new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2});
        Vector vector3 = new Vector(new int[]{123, 123, 123, 123, 123});
        Vector vector4 = new Vector(new int[]{-1, -1, -1, -1, -1, -1});
        Vector vector5 = new Vector(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1});

        //Assert
        Assert.assertSame(true, allElementsAreEqual(vector1));
        Assert.assertSame(true, allElementsAreEqual(vector2));
        Assert.assertSame(true, allElementsAreEqual(vector3));
        Assert.assertSame(true, allElementsAreEqual(vector4));
        Assert.assertSame(true, allElementsAreEqual(vector5));
    }

    @Test
    public void testEqualElementsZeroSize() {
        //Arrange
        Vector vector1 = new Vector(new int[]{});
        //Assert
        Assert.assertSame(false, allElementsAreEqual(vector1));
    }

    @Test
    public void testEqualElementsWithoutInitialization() {
        //Arrange
        Vector vector1 = new Vector();
        //Assert
        Assert.assertSame(true, allElementsAreEqual(vector1));
    }

    @Test
    public void testEqualElementsNull() {
        //Arrange
        Vector vector1 = null;
        //Assert
        Assert.assertSame(false, allElementsAreEqual(vector1));
    }

    @Test
    public void testDifferentElementsNegative() {
        //Arrange
        Vector vector1 = new Vector(new int[]{1, 2, 3, 4, 5, 5, 7, 8, 9, 10});
        Vector vector2 = new Vector(new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 3});
        Vector vector3 = new Vector(new int[]{-123, 2, 10, 23, 77, 99, 2223, 809, 3453, 10});
        Vector vector4 = new Vector(new int[]{5, 4, 3, 3, 2, 1, 2, 3, 4, 5});
        Vector vector5 = new Vector(new int[]{10, 9, 0, 0, 0, 1, 0, 0, 9, 10});
        Vector vector6 = new Vector(new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, -2});


        //Assert
        Assert.assertSame(false, allElementsAreDifferent(vector1));
        Assert.assertSame(false, allElementsAreDifferent(vector2));
        Assert.assertSame(false, allElementsAreDifferent(vector3));
        Assert.assertSame(false, allElementsAreDifferent(vector4));
        Assert.assertSame(false, allElementsAreDifferent(vector5));
        Assert.assertSame(false, allElementsAreDifferent(vector6));
    }

    @Test
    public void testDifferentElementsPositive() {
        //Arrange
        Vector vector1 = new Vector(new int[]{1, 2, 3, 4, 5, 6, 7});
        Vector vector2 = new Vector(new int[]{2, 22, 222, 2222, -2, -22, -222, -2222, 202, -202});
        Vector vector3 = new Vector(new int[]{1231, 1232, 1233, 1234, 1235});
        Vector vector4 = new Vector(new int[]{-1, -12, -13, -14, -15, -16});
        Vector vector5 = new Vector(new int[]{101, 100, 199, 1123123, 100000, 10, 10000, -100, 111});

        //Assert
        Assert.assertSame(true, allElementsAreDifferent(vector1));
        Assert.assertSame(true, allElementsAreDifferent(vector2));
        Assert.assertSame(true, allElementsAreDifferent(vector3));
        Assert.assertSame(true, allElementsAreDifferent(vector4));
        Assert.assertSame(true, allElementsAreDifferent(vector5));
    }

    @Test
    public void testDifferentElementsZeroSize() {
        //Arrange
        Vector vector1 = new Vector(new int[]{});
        //Assert
        Assert.assertSame(false, allElementsAreDifferent(vector1));
    }

    @Test
    public void testDifferentElementsWithoutInitialization() {
        //Arrange
        Vector vector1 = new Vector();
        //Assert
        Assert.assertSame(false, allElementsAreDifferent(vector1));
    }

    @Test
    public void testDifferentElementsNull() {
        //Arrange
        Vector vector1 = null;
        //Assert
        Assert.assertSame(false, allElementsAreDifferent(vector1));
    }

    @Test
    public void testEvensQuantityNegative() {
        //Arrange
        Vector vector1 = new Vector(new int[]{1, 1, 1, 1, 1, 1, 1});
        Vector vector2 = new Vector(new int[]{1, 3, 5, 7, 9});
        Vector vector3 = new Vector(new int[]{-1, -3, -5, -7, -9});
        Vector vector4 = new Vector(new int[]{-1, 1, -3, 3, -5, 5});
        Vector vector5 = new Vector(new int[]{243, 81, 627, 49});

        //Assert
        Assert.assertSame(0, getQuantityOfEvenNumbers(vector1));
        Assert.assertSame(0, getQuantityOfEvenNumbers(vector2));
        Assert.assertSame(0, getQuantityOfEvenNumbers(vector3));
        Assert.assertSame(0, getQuantityOfEvenNumbers(vector4));
        Assert.assertSame(0, getQuantityOfEvenNumbers(vector5));
    }

    @Test
    public void testEvensQuantityPositive() {
        //Arrange
        Vector vector1 = new Vector(new int[]{1, 2, 3, 4, 5, 6, 7});
        Vector vector2 = new Vector(new int[]{2, 22, 222, 2222, -2, -22, -222, -2222, 202, -202});
        Vector vector3 = new Vector(new int[]{1231, 1232, 1233, 1234, 1235});
        Vector vector4 = new Vector(new int[]{-1, -12, -13, -14, -15, -16});
        Vector vector5 = new Vector(new int[]{101, 100, 199, 1123123, 100000, 10, 10000, -100, 111});

        //Assert
        Assert.assertSame(3, getQuantityOfEvenNumbers(vector1));
        Assert.assertSame(10, getQuantityOfEvenNumbers(vector2));
        Assert.assertSame(2, getQuantityOfEvenNumbers(vector3));
        Assert.assertSame(3, getQuantityOfEvenNumbers(vector4));
        Assert.assertSame(5, getQuantityOfEvenNumbers(vector5));
    }

    @Test
    public void testEvensQuantityZeroSize() {
        //Arrange
        Vector vector1 = new Vector(new int[]{});
        //Assert
        Assert.assertSame(-1, getQuantityOfEvenNumbers(vector1));
    }

    @Test
    public void testEvensQuantityWithoutInitialization() {
        //Arrange
        Vector vector1 = new Vector();
        //Assert
        Assert.assertSame(10, getQuantityOfEvenNumbers(vector1));
    }

    @Test
    public void testEvensQuantityNull() {
        //Arrange
        Vector vector1 = null;
        //Assert
        Assert.assertSame(-1, getQuantityOfEvenNumbers(vector1));
    }

    @Test
    public void testOddQuantityNegative() {
        //Arrange
        Vector vector1 = new Vector(new int[]{2, 2, 2, 2, 2, 2, 2});
        Vector vector2 = new Vector(new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 4});
        Vector vector3 = new Vector(new int[]{2, 4, 6, 8, 8, 6, 4, 2});
        Vector vector4 = new Vector(new int[]{0, 122, 222, 444, 4234232});
        Vector vector5 = new Vector(new int[]{10, 10, 10, 10});

        //Assert
        Assert.assertSame(0, getQuantityOfOddNumbers(vector1));
        Assert.assertSame(0, getQuantityOfOddNumbers(vector2));
        Assert.assertSame(0, getQuantityOfOddNumbers(vector3));
        Assert.assertSame(0, getQuantityOfOddNumbers(vector4));
        Assert.assertSame(0, getQuantityOfOddNumbers(vector5));
    }

    @Test
    public void testOddQuantityPositive() {
        //Arrange
        Vector vector1 = new Vector(new int[]{1, 2, 4, 6, 8, 10});
        Vector vector2 = new Vector(new int[]{-3, -5, 2, 4, 6, 8, 10});
        Vector vector3 = new Vector(new int[]{2, 4, 3, 5, 7, 8, 12});
        Vector vector4 = new Vector(new int[]{3, 5, 7, 9});
        Vector vector5 = new Vector(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

        //Assert
        Assert.assertSame(1, getQuantityOfOddNumbers(vector1));
        Assert.assertSame(2, getQuantityOfOddNumbers(vector2));
        Assert.assertSame(3, getQuantityOfOddNumbers(vector3));
        Assert.assertSame(4, getQuantityOfOddNumbers(vector4));
        Assert.assertSame(5, getQuantityOfOddNumbers(vector5));
    }

    @Test
    public void testOddQuantityZeroSize() {
        //Arrange
        Vector vector1 = new Vector(new int[]{});
        //Assert
        Assert.assertSame(-1, getQuantityOfOddNumbers(vector1));
    }

    @Test
    public void testOddQuantityWithoutInitialization() {
        //Arrange
        Vector vector1 = new Vector();
        //Assert
        Assert.assertSame(0, getQuantityOfOddNumbers(vector1));
    }

    @Test
    public void testOddQuantityNull() {
        //Arrange
        Vector vector1 = null;
        //Assert
        Assert.assertSame(-1, getQuantityOfOddNumbers(vector1));
    }

    @Test
    public void testDescendingNegative() {
        //Arrange
        Vector vector1 = new Vector(new int[]{1, 2, 3, 4, 5, 5, 7, 8, 9, 10});
        Vector vector2 = new Vector(new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 3});
        Vector vector3 = new Vector(new int[]{-123, 2, 10, 23, 77, 99, 2223, 809, 3453, 10});
        Vector vector4 = new Vector(new int[]{5, 4, 3, 3, 2, 1, 2, 3, 4, 5});
        Vector vector5 = new Vector(new int[]{10, 9, 0, 0, 0, 1, 0, 0, 9, 10});
        Vector vector6 = new Vector(new int[]{123, 2, 2, 2, 2, 2, 2, 2, 2, 3});


        //Assert
        Assert.assertSame(false, isDescending(vector1));
        Assert.assertSame(false, isDescending(vector2));
        Assert.assertSame(false, isDescending(vector3));
        Assert.assertSame(false, isDescending(vector4));
        Assert.assertSame(false, isDescending(vector5));
        Assert.assertSame(false, isDescending(vector6));
    }

    @Test
    public void testDescendingPositive() {
        //Arrange
        Vector vector1 = new Vector(new int[]{111, 110, 109, 108, 108, 77, 7});
        Vector vector2 = new Vector(new int[]{2222, 222, 22, 2, 0, -22, -222, -2222});
        Vector vector3 = new Vector(new int[]{222, 22, 0});
        Vector vector4 = new Vector(new int[]{0, -1, -2, -3, -4, -5});
        Vector vector5 = new Vector(new int[]{-12, -123123, -123123131});

        //Assert
        Assert.assertSame(true, isDescending(vector1));
        Assert.assertSame(true, isDescending(vector2));
        Assert.assertSame(true, isDescending(vector3));
        Assert.assertSame(true, isDescending(vector4));
        Assert.assertSame(true, isDescending(vector5));
    }

    @Test
    public void testDescendingZeroSize() {
        //Arrange
        Vector vector1 = new Vector(new int[]{});
        //Assert
        Assert.assertSame(false, isDescending(vector1));
    }

    @Test
    public void testDescendingWithoutInitialization() {
        //Arrange
        Vector vector1 = new Vector();
        //Assert
        Assert.assertSame(true, isDescending(vector1));
    }

    @Test
    public void testDescendingNull() {
        //Arrange
        Vector vector1 = null;
        //Assert
        Assert.assertSame(false, isDescending(vector1));
    }

    @Test
    public void testAscendingElementsNegative() {
        //Arrange
        Vector vector1 = new Vector(new int[]{1, 2, 3, 4, 5, 5, 7, 8, 9, 8});
        Vector vector2 = new Vector(new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 0});
        Vector vector3 = new Vector(new int[]{-123, 2, 10, 23, 77, 99, 2223, 809, 3453, 10});
        Vector vector4 = new Vector(new int[]{5, 4, 3, 3, 2, 1, 2, 3, 4, 5});
        Vector vector5 = new Vector(new int[]{10, 9, 0, 0, 0, 1, 0, 0, 9, 10});
        Vector vector6 = new Vector(new int[]{66, 2, 2, 2, 2, 2, 2, 2, 2, -2});


        //Assert
        Assert.assertSame(false, isAscending(vector1));
        Assert.assertSame(false, isAscending(vector2));
        Assert.assertSame(false, isAscending(vector3));
        Assert.assertSame(false, isAscending(vector4));
        Assert.assertSame(false, isAscending(vector5));
        Assert.assertSame(false, isAscending(vector6));
    }

    @Test
    public void testAscendingPositive() {
        //Arrange
        Vector vector1 = new Vector(new int[]{1, 2, 3, 4, 5, 6, 7});
        Vector vector2 = new Vector(new int[]{-1, 0, 22, 67, 9123});
        Vector vector3 = new Vector(new int[]{0, 1});
        Vector vector4 = new Vector(new int[]{-123, -122, -112, -111, -32, -27, -1});
        Vector vector5 = new Vector(new int[]{-5, -4, -3, -2, -1, 0});

        //Assert
        Assert.assertSame(true, isAscending(vector1));
        Assert.assertSame(true, isAscending(vector2));
        Assert.assertSame(true, isAscending(vector3));
        Assert.assertSame(true, isAscending(vector4));
        Assert.assertSame(true, isAscending(vector5));
    }

    @Test
    public void testAscendingZeroSize() {
        //Arrange
        Vector vector1 = new Vector(new int[]{});
        //Assert
        Assert.assertSame(false, isAscending(vector1));
    }

    @Test
    public void testAscendingWithoutInitialization() {
        //Arrange
        Vector vector1 = new Vector();
        //Assert
        Assert.assertSame(true, isAscending(vector1));
    }

    @Test
    public void testAscendingNull() {
        //Arrange
        Vector vector1 = null;
        //Assert
        Assert.assertSame(false, isAscending(vector1));
    }
}
