package e.pallavidash.sags;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
private int rand1;
private int rand2;
private int points;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        points = 0;
        pickRandomNumbers();

    }
        private void pickRandomNumbers(){

        Random randy = new Random();
         rand1 = randy.nextInt(10);
         rand2 = randy.nextInt(10);

        Button lbutt = (Button) findViewById(R.id.Left_button);

        lbutt.setText(Integer.toString(rand1));
        Button rbutt = (Button) findViewById(R.id.Right_button);
        rbutt.setText(Integer.toString(rand2));
    }

    public void leftbuttonclick(View view) {
        if(rand1 > rand2){
            points++;
        }
        else {
            points--;

                    }
                   TextView tv = (TextView)  findViewById(R.id.points_field);
        tv.setText("Points: " + points);
        pickRandomNumbers();


            }

    public void rightbuttonclick(View view) {
        if(rand2 > rand1){
        points++;
    }
    else {
        points--;

    }
        TextView tv = (TextView)  findViewById(R.id.points_field);
        tv.setText("Points: " + points);
        pickRandomNumbers();



    }

}
