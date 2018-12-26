package com.yxliu.androidutil.util;

import android.os.Vibrator;

/**
 * 手机振动
 */
public class VibratorUtil {

    public static final long shortTime = 150L;
    public static final long longTime = 400L;

    /**
     * 短振动
     */
    public static void vibratorShort(Vibrator vibrator) {
        vibrator.vibrate(shortTime);
    }

    /**
     * 长振动
     */
    public static void vibratorLong(Vibrator vibrator) {
        vibrator.vibrate(longTime);
    }

    /**
     * 振动
     */
    public static void vibrator(Vibrator vibrator, long time) {
        vibrator.vibrate(time);
    }

    /**
     * 模式震动
     *
     *    //“模式”指的是第一个参数；“次数”指的是第二个参数
     *    //“模式”参数说明
     *    //new long[]{1000,2000,1000,2000}：等待1秒+振动2秒+等待1秒+振动2秒
     *    //new long[]{5000,1000,3000,4000}：等待5秒+振动1秒+等待3秒+振动4秒
     *    //“模式”参数必须是成对出现才有实际意义，如果出现单数，那么将白等待啊。
     *    //测试时切记区分手机操作时的正常自身振动，如按键振动。
     *    //“次数”参数说明
     *    //当“次数”= 0 时，震动会一直持续；若“次数”= -1 时，震动只会出现一轮，运行完毕后就不会再有动作。
     * 取消振动
     *   vibrator.cancel();//中断正在进行的振动，视情况添加。绝对马上中断振动。
     * 收尾：用完后切记清空对象
     */
    public static void vibratorModel(Vibrator vibrator) {
        vibrator.vibrate(new long[]{1000,2000,1000,2000}, -1); //以设计好的“模式”及“次数”振动。
    }
}
