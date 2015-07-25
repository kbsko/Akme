package com.dev.mobile.akme;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kubish on 25.07.2015.
 */
public class ArticlesAdapter extends BaseAdapter {

    private ArrayList<Articles> articles;
    private Context c;

    public ArticlesAdapter(ArrayList<Articles> articles, Context c) {
        this.articles = articles;
        this.c = c;
    }

    @Override
    public int getCount() {
        return articles.size();
    }

    @Override
    public Object getItem(int position) {
        return articles.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null)
            convertView = LayoutInflater.from(c).inflate(R.layout.list_item_articles, null); //
                fillView(convertView, position);
        return convertView;
    }

    private void fillView(View v, int position) {
        final Articles p = (Articles) getItem(position);
        final Map<String, String> hm = new HashMap<>();
        hm.put("Лекция № 1", new String("lection1.pdf"));
        hm.put("Лекция № 2", new String("lection2.pdf"));
        hm.put("Лекция № 3", new String("lection3.pdf"));
        hm.put("Лекция № 4", new String("lection4.pdf"));
        hm.put("Лекция № 5", new String("lection5.pdf"));
        hm.put("Лекция № 6", new String("lection6.pdf"));
        hm.put("Лекция № 7", new String("lection7.pdf"));
        hm.put("Лекция № 8", new String("lection8.pdf"));
        hm.put("Лекция № 9", new String("lection9.pdf"));
        hm.put("Лекция № 10", new String("lection10.pdf"));
        hm.put("Лекция № 11", new String("lection11.pdf"));
        hm.put("Лекция № 12", new String("lection12.pdf"));
        hm.put("Лекция № 13", new String("lection13.pdf"));
        hm.put("Лекция № 14", new String("lection14.pdf"));
        hm.put("Лекция № 15", new String("lection15.pdf"));
        hm.put("Лекция № 16", new String("lection16.pdf"));
        hm.put("Лекция № 17", new String("lection17.pdf"));

        TextView arName = (TextView) v.findViewById(R.id.articleName);
        arName.setText(p.getName());
        TextView arDescr = (TextView) v.findViewById(R.id.articleDescription);
        arDescr.setText(p.getDescription());
       v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AssetManager assetManager = c.getAssets();
                InputStream in = null;
                OutputStream out = null;
                String filename=hm.get(p.getName());
                File file = new File(c.getFilesDir(), filename);
                try
                {
                    in = assetManager.open(filename);
                    out = c.openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

                    copyFile(in, out);
                    in.close();
                    in = null;
                    out.flush();
                    out.close();
                    out = null;
                } catch (Exception e)
                {
                    Log.e("tag", e.getMessage());
                }

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(
                        Uri.parse("file://" + c.getFilesDir() + "/"+filename),
                        "application/pdf");

                c.startActivity(intent);

            }
        });
    }


    private void copyFile(InputStream in, OutputStream out) throws IOException
    {
        byte[] buffer = new byte[1024];
        int read;
        while ((read = in.read(buffer)) != -1)
        {
            out.write(buffer, 0, read);
        }
    }

}