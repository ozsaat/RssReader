package com.ozsaat.rssreader;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.AdapterView;

import java.util.List;

/**
 * Created by Oz on 07/10/2014.
 */
public class ListListener implements AdapterView.OnItemClickListener {

    List<RssItem> listItems;
    Activity activity;

    // Slightly different
    public ListListener(List<RssItem> listItems, Activity activity) {
        this.listItems = listItems;
        this.activity = activity;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int pos, long id) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(listItems.get(pos).getLink()));

        activity.startActivity(intent);

    }
}
