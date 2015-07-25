package com.dev.mobile.akme;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/**
 * Created by Kubish on 25.07.2015.
 */
public class ArticleActivity extends ActionBarActivity {
    private ArticlesAdapter adapter;
    private ArrayList<Articles> artic;
    private ListView lvArtic;
    Context c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.articles);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        TextView textView = (TextView) findViewById(R.id.textView);

        actionBar.setTitle(textView.getText().toString());
        lvArtic = (ListView) findViewById(R.id.lvArticles);
        createFriendsList();
        fillList();
    }


    private void fillList() {
        adapter = new ArticlesAdapter(artic, this);
        lvArtic.setAdapter(adapter);

    }

    private void createFriendsList() {
        artic = new ArrayList<Articles>();
        Articles p = new Articles();
        p.setName("������ � 1");
        p.setDescription("������� �������������� ������������");
        artic.add(p);

        p = new Articles();
        p.setName("������ � 2");
        p.setDescription("��������������� � ���������� ������� �������������� ������������");
        artic.add(p);

        p = new Articles();
        p.setName("������ � 3");
        p.setDescription("������������� ����������");
        artic.add(p);

        p = new Articles();
        p.setName("������ � 4");
        p.setDescription("������� �������������� ������������");
        artic.add(p);

        p = new Articles();
        p.setName("������ � 5");
        p.setDescription("������������ ������ � ������� ��");
        artic.add(p);

        p = new Articles();
        p.setName("������ � 6");
        p.setDescription("������������� ���������� ����");
        artic.add(p);

        p = new Articles();
        p.setName("������ � 7");
        p.setDescription("��������� ����");
        artic.add(p);

        p = new Articles();
        p.setName("������ � 8");
        p.setDescription("��������� �. �. ���� � ��������� ����������� � ��������� ����� � ���������������� ������������");
        artic.add(p);

        p = new Articles();
        p.setName("������ � 9");
        p.setDescription("�������� ���������� ������������������� � ���������������� ������������");
        artic.add(p);

        p = new Articles();
        p.setName("������ � 10");
        p.setDescription("�������������� ������ ���������������� ��������������");
        artic.add(p);

        p = new Articles();
        p.setName("������ � 11");
        p.setDescription("������ ��������-����������������� ������� ������������ ��");
        artic.add(p);

        p = new Articles();
        p.setName("������ � 12");
        p.setDescription("������, �������� � ����������� ������������ ������� �� �� ��������� �������� � ����������� �������������� ������� � ������������ � ������� ���������������");
        artic.add(p);

        p = new Articles();
        p.setName("������ � 13");
        p.setDescription("���������� ���������������� �������");
        artic.add(p);

        p = new Articles();
        p.setName("������ � 14");
        p.setDescription("��������������� ������ �������������� ������������");
        artic.add(p);

        p = new Articles();
        p.setName("������ � 15");
        p.setDescription("����������� ����������");
        artic.add(p);

        p = new Articles();
        p.setName("������ � 16");
        p.setDescription("����������� � ���������");
        artic.add(p);

        p = new Articles();
        p.setName("������ � 17");
        p.setDescription("����������� ������� �� ���������");
        artic.add(p);

        // Toast.makeText(this, "OLOLOOLLLl",Toast.LENGTH_SHORT).show();
    }

}