package cool.scx.common.test;

import cool.scx.common.util.RandomUtils;
import org.testng.annotations.Test;

import static cool.scx.common.constant.CharPools.NUMBER;
import static cool.scx.common.constant.CharPools.NUMBER_AND_LETTER;

public class RandomUtilsTest {

    public static void main(String[] args) {
        test1();
    }

    @Test
    public static void test1() {
        RandomUtils.randomString(1000, NUMBER_AND_LETTER);
        RandomUtils.randomString(1000, NUMBER);
        RandomUtils.randomString(1000, new String[]{"😂", "🥶", "😡", "🤢"});
        RandomUtils.randomString(1000, "🐷😂🤣123你好😅😍😡");
    }

}
