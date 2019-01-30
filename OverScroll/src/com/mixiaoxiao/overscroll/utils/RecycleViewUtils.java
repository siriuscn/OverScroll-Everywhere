package com.mixiaoxiao.overscroll.utils;

public final class RecycleViewUtils {

    private RecycleViewUtils() {
    }

    public static boolean isRecycleViewLoaded() {
        try {
            Class.forName("android.support.v7.widget.RecyclerView");
        } catch (final ClassNotFoundException e) {
            return false;
        }
        return true;
    }
}
