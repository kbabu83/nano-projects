package com.infinity.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;


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

    public void sendMessage(View view) {
        String projectText = null;
        switch (view.getId()) {
            case R.id.btn_popular_movies:
                projectText = getString(R.string.popular_movies);
                break;

            case R.id.btn_live_scores:
                projectText = getString(R.string.scores_app);
                break;

            case R.id.btn_library_app:
                projectText = getString(R.string.library_app);
                break;

            case R.id.btn_build_it_bigger:
                projectText = getString(R.string.build_big);
                break;

            case R.id.btn_xyz_reader:
                projectText = getString(R.string.xyz_read);
                break;

            case R.id.btn_capstone:
                projectText = "capstone";
                break;

            default:
                break;
        }
        if (projectText != null) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "This button will launch my " + projectText + " app",
                    Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.TOP|Gravity.LEFT,
                            (int)Math.abs(view.getX()),
                            (int)Math.abs(view.getY() + view.getHeight() + findViewById(R.id.content_header).getHeight()));
            toast.show();
        }
    }
}
