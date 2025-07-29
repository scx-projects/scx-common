package cool.scx.common.util;


import cool.scx.function.CallableX;
import cool.scx.function.RunnableX;

import java.io.PrintWriter;
import java.io.StringWriter;

/// ExceptionUtils
///
/// @author scx567888
/// @version 0.0.1
public final class ExceptionUtils {

    /// 忽略异常 发生异常时返回 null
    public static <T> T ignore(CallableX<T, ?> handler) {
        try {
            return handler.call();
        } catch (Throwable throwable) {
            return null;
        }
    }

    /// 忽略异常 发生异常时返回默认值
    public static <T> T ignore(CallableX<T, ?> handler, T defaultVal) {
        try {
            return handler.call();
        } catch (Throwable throwable) {
            return defaultVal;
        }
    }

    /// 忽略异常
    public static void ignore(RunnableX<?> handler) {
        try {
            handler.run();
        } catch (Throwable ignored) {

        }
    }

    /// 检测执行的操作是否有异常 (有异常时不打印信息)
    public static boolean noException(RunnableX<?> scxRunnable) {
        try {
            scxRunnable.run();
            return true;
        } catch (Throwable throwable) {
            return false;
        }
    }

    /// 获取 jdk 内部默认实现的堆栈跟踪字符串
    public static String getStackTraceString(Throwable throwable) {
        var stringWriter = new StringWriter();
        throwable.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.getBuffer().toString();
    }

}
