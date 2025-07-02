package cool.scx.common.test;

import cool.scx.common.cache.Cache;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CacheTest {

    public static void main(String[] args) {
        test1();
    }

    @Test
    public static void test1() {
        var cache = new Cache<String, String>(10);
        for (int i = 0; i < 20; i++) {
            cache.put("key" + i, "value" + i);
        }
        Assert.assertNull(cache.get("key1"));
        Assert.assertEquals(cache.get("key11"), "value11");
    }

}
