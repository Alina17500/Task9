package ru.vsu.cs.volobueva;

import org.junit.Assert;
import org.junit.Test;
import ru.vsu.cs.util.ArrayUtils;

import java.util.List;

public class TestsDifferentSituations {
    @Test
    public void testStandardSituation() {
        List<Integer> listForTest = ArrayUtils.readListFromFile("TestCase/input01TestStandardSituation.txt");
        TransformList.transformList(listForTest);
        List<Integer> resultList = ArrayUtils.readListFromFile("TestResult/outputResult01.txt");
        Assert.assertEquals(resultList, listForTest);
    }

    @Test
    public void testNothingElementsBetweenFirstMaxAndLastMin() {
        List<Integer> listForTest = ArrayUtils.readListFromFile("TestCase/input02TestNothingElementsBetweenFirstMaxAndLastMin.txt");
        TransformList.transformList(listForTest);
        List<Integer> resultList = ArrayUtils.readListFromFile("TestResult/outputResult02.txt");
        Assert.assertEquals(resultList, listForTest);
    }

    @Test
    public void testFirstMaxAndLastMinAtEdges() {
        List<Integer> listForTest = ArrayUtils.readListFromFile("TestCase/input03TestFirstMaxAndLastMinAtEdges.txt");
        TransformList.transformList(listForTest);
        List<Integer> resultList = ArrayUtils.readListFromFile("TestResult/outputResult03.txt");
        Assert.assertEquals(resultList, listForTest);
    }

    @Test
    public void testSituationWithNegativeElements() {
        List<Integer> listForTest = ArrayUtils.readListFromFile("TestCase/input04TestSituationWithNegativeElements.txt");
        TransformList.transformList(listForTest);
        List<Integer> resultList = ArrayUtils.readListFromFile("TestResult/outputResult04.txt");
        Assert.assertEquals(resultList, listForTest);
    }

    @Test
    public void testSituationWithIdenticalElements() {
        List<Integer> listForTest = ArrayUtils.readListFromFile("TestCase/input05TestSituationWithIdenticalElements.txt");
        TransformList.transformList(listForTest);
        List<Integer> resultList = ArrayUtils.readListFromFile("TestResult/outputResult05.txt");
        Assert.assertEquals(resultList, listForTest);
    }
}
