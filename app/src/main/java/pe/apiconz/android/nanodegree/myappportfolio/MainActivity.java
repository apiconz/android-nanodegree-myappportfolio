package pe.apiconz.android.nanodegree.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void openStreamer(View view){
        showToast(view,"This button will launch my streamer app!");
    }

    public void openScores(View view){
        showToast(view,"This button will launch my football score app!");
    }

    public void openLibrary(View view){
        showToast(view,"This button will launch my library app!");
    }

    public void openBuildIt(View view){
        showToast(view,"This button will launch my build it app!");
    }

    public void openReader(View view){
        showToast(view,"This button will launch my xyz reader app!");
    }

    public void openCapstone(View view){
        showToast(view,"This button will launch my capstone app!");
    }

    private void showToast(View view, String message){
        Toast.makeText(view.getContext(),message,Toast.LENGTH_LONG).show();

    }
}
