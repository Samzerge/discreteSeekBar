package org.adw.samples.discreteseekbar;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.adw.library.widgets.discreteseekbar.DiscreteSeekBar;

public class MainActivity extends Activity {

    private Button plusButton;
    private Button minusButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final DiscreteSeekBar discreteSeekBar1 = (DiscreteSeekBar) findViewById(R.id.discrete1);

        discreteSeekBar1.setNumericTransformer(new DiscreteSeekBar.NumericTransformer() {
            @Override
            public int transform(int value) {
                return value * 100;
            }
        });


        final DiscreteSeekBar discreteSeekBar4 = (DiscreteSeekBar) findViewById(R.id.discrete4);
        plusButton = (Button) findViewById(R.id.plusButton);
        minusButton = (Button) findViewById(R.id.minusButton);

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                discreteSeekBar4.animateSetProgress( discreteSeekBar4.getProgress()+ 100);


            }
        });

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                discreteSeekBar4.animateSetProgress( discreteSeekBar4.getProgress()- 100);
            }
        });
    }

}
