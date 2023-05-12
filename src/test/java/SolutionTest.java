import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void mostPointsTest1() {
        Assert.assertEquals(5, new Solution().mostPoints(
                new int[][]{{3, 2}, {4, 3}, {4, 4}, {2, 5}}));
    }

    @Test
    public void mostPointsTest2() {
        Assert.assertEquals(7, new Solution().mostPoints(
                new int[][]{{1, 1}, {2, 2}, {3, 3}, {4, 4}, {5, 5}}));
    }

    @Test
    public void mostPointsTest3() {
        Assert.assertEquals(43, new Solution().mostPoints(
                new int[][]{{43, 5}}));
    }
    @Test
    public void mostPointsTest4() {
        Assert.assertEquals(157, new Solution().mostPoints(
                new int[][]{{21, 5}, {92, 3}, {74, 2}, {39, 4}, {58, 2}, {5, 5}, {49, 4}, {65, 3}}));
    }
}
