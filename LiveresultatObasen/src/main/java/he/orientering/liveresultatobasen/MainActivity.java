package he.orientering.liveresultatobasen;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import he.orientering.liveresultatobasen.reader.Commands;

//TODO:fix error with setContentView
//Todo: Do a graphical UI
//todo: DO the comunicater with the server

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView();
        Commands.getLastPassingCommand(12345);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;

    }

}
