package org.adw.library.widgets.discreteseekbar.internal.drawable;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.NonNull;
import android.util.Log;

/**
 * Created by USER on 8/12/2017.
 */

public class TrackRectDividerDrawable extends TrackRectDrawable {

    public int sections;
    private int dividersWidth;
    private int dividersHeight;

    public TrackRectDividerDrawable(@NonNull ColorStateList tintStateList, int sections, int dividersWidth, int dividersHeight) {
        super(tintStateList);
        this.sections = sections;
        this.dividersWidth = dividersWidth;
        this.dividersHeight = dividersHeight;
    }

    @Override
    void doDraw(Canvas canvas, Paint paint) {

        if(sections > 0){
            float subSection = Math.abs(getBounds().left - getBounds().right) / sections;
            float sectionsOffset = getBounds().left;

            paint.setStrokeWidth(dividersWidth);

            float midHeight = dividersHeight > -1 ? dividersHeight /2 : 0;

            for(int i = 0; i <= sections; i++){
                float xPos = (subSection * i)  + sectionsOffset;
                canvas.drawLine(xPos,getBounds().top - midHeight, xPos, getBounds().bottom +midHeight, paint );
            }
        }
    }
}
