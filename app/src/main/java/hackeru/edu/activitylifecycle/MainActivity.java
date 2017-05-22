package hackeru.edu.activitylifecycle;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        tvNumber = (TextView) findViewById(R.id.tvCounter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    int counter = 1;

    public void minus(View view) {
        counter--;
        Toast.makeText(this, String.valueOf(counter), Toast.LENGTH_SHORT).show();
        tvNumber.setText(String.valueOf(counter));
    }

    public void plus(View view) {
        counter++;
        Toast.makeText(this, String.valueOf(counter), Toast.LENGTH_SHORT).show();
        tvNumber.setText(String.valueOf(counter));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Hackeru", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Hackeru", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Hackeru", "onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Hackeru", "onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Hackeru", "onStop");
    }
}
