import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void mostPointsTest1(){
        Assert.assertEquals(5, new Solution().mostPoints(
                new int[][]{{3,2}, {4,3}, {4,4},{2,5}}));
    }
}
