package he.orientering.liveresultatobasen;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;


//TODO:fix error with setContentView
//Todo: Do a graphical UI


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv;
        tv = (TextView) findViewById(R.id.TextView);
        setContentView(R.layout.activity_main);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;

    }

}
