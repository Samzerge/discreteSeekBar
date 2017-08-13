package org.adw.library.widgets.discreteseekbar.internal;

/**
 * Created by USER on 8/12/2017.
 */

public enum ThumbStyle {

    DEFAULT(0),
    ONLYTHUMB(1),
    ONLYMARKER(2);

    private final int value;
    private ThumbStyle(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static ThumbStyle getThumbStyle(int value) {
        for (ThumbStyle thumbStyle : ThumbStyle.values()) {
            if (thumbStyle.value == value)
                return thumbStyle;
        }
        throw new IllegalArgumentException("No ThumbStyle with that value");
    }
}
