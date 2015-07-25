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
        p.setName("Лекция № 1");
        p.setDescription("Понятие информационной безопасности");
        artic.add(p);

        p = new Articles();
        p.setName("Лекция № 2");
        p.setDescription("Психологические и социальные аспекты информационной безопасности");
        artic.add(p);

        p = new Articles();
        p.setName("Лекция № 3");
        p.setDescription("Теоретическая акмеология");
        artic.add(p);

        p = new Articles();
        p.setName("Лекция № 4");
        p.setDescription("Система информационной безопасности");
        artic.add(p);

        p = new Articles();
        p.setName("Лекция № 5");
        p.setDescription("Человеческий ресурс в системе ИБ");
        artic.add(p);

        p = new Articles();
        p.setName("Лекция № 6");
        p.setDescription("Аналитическая психология Юнга");
        artic.add(p);

        p = new Articles();
        p.setName("Лекция № 7");
        p.setDescription("Типология Юнга");
        artic.add(p);

        p = new Articles();
        p.setName("Лекция № 8");
        p.setDescription("Типология К. Г. Юнга в контексте расстановки и адаптации людей к профессиональной деятельности");
        artic.add(p);

        p = new Articles();
        p.setName("Лекция № 9");
        p.setDescription("Цветовые индикаторы предрасположенности к профессиональной деятельности");
        artic.add(p);

        p = new Articles();
        p.setName("Лекция № 10");
        p.setDescription("Акмеологичекая оценка профессиональной компетентности");
        artic.add(p);

        p = new Articles();
        p.setName("Лекция № 11");
        p.setDescription("Модель личносто-профессионального профиля руководителя ИТ");
        artic.add(p);

        p = new Articles();
        p.setName("Лекция № 12");
        p.setDescription("Подбор, обучение и расстановка специалистов системы ИБ на основании важности и критичности обслуживаемого ресурса в соответствии с набором компетентностей");
        artic.add(p);

        p = new Articles();
        p.setName("Лекция № 13");
        p.setDescription("Акмеология профессиональной карьеры");
        artic.add(p);

        p = new Articles();
        p.setName("Лекция № 14");
        p.setDescription("Психологические основы управленческой деятельности");
        artic.add(p);

        p = new Articles();
        p.setName("Лекция № 15");
        p.setDescription("Эффективное управление");
        artic.add(p);

        p = new Articles();
        p.setName("Лекция № 16");
        p.setDescription("Руководство и лидерство");
        artic.add(p);

        p = new Articles();
        p.setName("Лекция № 17");
        p.setDescription("Современные взгляды на лидерство");
        artic.add(p);

        // Toast.makeText(this, "OLOLOOLLLl",Toast.LENGTH_SHORT).show();
    }

}