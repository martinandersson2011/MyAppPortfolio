package com.martinandersson.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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

    @OnClick(R.id.popular_movies)
    public void onPopularMoviesClicked() {
        Toast.makeText(this, "This button will launch my popular movies app", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.scores_app)
    public void onScoresAppClicked() {
        Toast.makeText(this, "This button will launch my scores app", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.library_app)
    public void onLibraryAppClicked() {
        Toast.makeText(this, "This button will launch my library app", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.build_it_bigger)
    public void onBuildItBiggerClicked() {
        Toast.makeText(this, "This button will launch my build it bigger app", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.xyz_reader)
    public void onXyzReaderClicked() {
        Toast.makeText(this, "This button will launch my xyz reader app", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.capstone)
    public void onCapstoneClicked() {
        Toast.makeText(this, "This button will launch my capstone app", Toast.LENGTH_SHORT).show();
    }

}
