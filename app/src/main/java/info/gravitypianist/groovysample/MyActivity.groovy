package info.gravitypianist.groovysample

import android.app.Activity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.arasthel.swissknife.SwissKnife
import com.arasthel.swissknife.annotations.OnClick

public class MyActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate savedInstanceState
        setContentView R.layout.activity_my
        SwissKnife.inject this
    }

    boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate R.menu.my, menu
        true
    }

    boolean onOptionsItemSelected(MenuItem item) {
        int id = item.itemId
        if (id == R.id.action_settings) {
            return true
        }
        super.onOptionsItemSelected item
    }

    @OnClick(R.id.button)
    public void onClick(View v) {
        Toast.makeText(this, "Hello Groovy on Android", Toast.LENGTH_LONG).show();
    }

}
