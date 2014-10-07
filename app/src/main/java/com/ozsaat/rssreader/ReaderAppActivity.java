package com.ozsaat.rssreader;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ReaderAppActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        try {

            RssReader rssReader = new RssReader("http://feeds.feedburner.com/androidpolice?format=xml");

            ListView listView = (ListView)findViewById(R.id.listView);

            ArrayAdapter<RssItem> adapter = new ArrayAdapter<RssItem>(this, android.R.layout.simple_list_item_1, rssReader.getItems());

            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new ListListener(rssReader.getItems(), this));

        } catch (Exception e) {
            Log.e("RssReader", e.getMessage());
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
