package cool.scx.common.constant;

import java.time.format.DateTimeFormatter;

import static java.time.format.DateTimeFormatter.ofPattern;

/// 预定义的 日期格式化器
///
/// @author scx567888
/// @version 0.0.1
public final class DateTimeFormatters {

    /// yyyy-MM-dd HH:mm:ss 精确到秒, 例 : "2023-05-09 13:02:35"
    public static final DateTimeFormatter yyyy_MM_dd_HH_mm_ss = ofPattern("yyyy-MM-dd HH:mm:ss");

    /// yyyy-MM-dd HH:mm:ss.SSS 精确到毫秒, 例 : "2023-05-09 13:02:35.167"
    public static final DateTimeFormatter yyyy_MM_dd_HH_mm_ss_SSS = ofPattern("yyyy-MM-dd HH:mm:ss.SSS");

    /// yyyy-MM-dd 精确到天, 例 : "2023-05-09"
    public static final DateTimeFormatter yyyy_MM_dd = ofPattern("yyyy-MM-dd");

    /// HH:mm:ss 精确到秒, 例 : "13:02:35"
    public static final DateTimeFormatter HH_mm_ss = ofPattern("HH:mm:ss");

    /// HH:mm:ss.SSS 精确到毫秒, 例 : "13:02:35.167"
    public static final DateTimeFormatter HH_mm_ss_SSS = ofPattern("HH:mm:ss.SSS");

}
