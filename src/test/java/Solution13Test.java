import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * 测试类 L2022111241_13_TEST 的总体设计原则是等价类划分原则。
 * 根据不同情况对排序算法进行测试，包括正常情况、边界情况以及特殊情况等。
 */
public class Solution13Test {

    // 测试目的：验证正常情况下的颜色排序功能
    // 测试用例：{2, 0, 2, 1, 1, 0}
    @Test
    public void testSortColors_HappyPath() {
        Solution13 solution13 = new Solution13();
        int[] nums = {2, 0, 2, 1, 1, 0};
        solution13.sortColors(nums);
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, nums);
    }

    // 测试目的：验证只有两个颜色情况下的颜色排序功能
    // 测试用例：{2, 0, 0}
    @Test
    public void testSortColors_TwoColors() {
        Solution13 solution13 = new Solution13();
        int[] nums = {2, 0, 0};
        solution13.sortColors(nums);
        assertArrayEquals(new int[]{0, 0, 2}, nums);
    }

    // 测试目的：验证只有一种颜色情况下的颜色排序功能
    // 测试用例：{1, 1, 1, 1}
    @Test
    public void testSortColors_OneColor() {
        Solution13 solution13 = new Solution13();
        int[] nums = {1, 1, 1, 1};
        solution13.sortColors(nums);
        assertArrayEquals(new int[]{1, 1, 1, 1}, nums);
    }

    // 测试目的：验证空数组情况下的颜色排序功能
    // 测试用例：{}
    @Test
    public void testSortColors_EmptyArray() {
        Solution13 solution13 = new Solution13();
        int[] nums = {};
        solution13.sortColors(nums);
        assertArrayEquals(new int[]{}, nums);
    }

    // 测试目的：验证随机顺序数组情况下的颜色排序功能
    // 测试用例：{0, 1, 2}
    @Test
    public void testSortColors_RandomOrder() {
        Solution13 solution13 = new Solution13();
        int[] nums = {0, 1, 2};
        solution13.sortColors(nums);
        assertArrayEquals(new int[]{0, 1, 2}, nums);
    }
}
