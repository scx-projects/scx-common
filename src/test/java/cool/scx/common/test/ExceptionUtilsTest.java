package cool.scx.common.test;

import cool.scx.common.util.ExceptionUtils;
import org.testng.annotations.Test;

public class ExceptionUtilsTest {

    public static void main(String[] args) {
        test1();
    }

    @Test
    public static void test1() {
        ExceptionUtils.ignore(() -> {
            var i = 1 / 0;
        });
    }


}
