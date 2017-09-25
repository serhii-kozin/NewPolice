/*
 * Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://mindorks.com/license/apache-v2
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package com.klg.newpolice;

import android.app.Application;

import com.klg.newpolice.util.AppLogger;

import io.realm.Realm;


/**
 * Created by sergejkozin on 9/22/17.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AppLogger.init();
        Realm.init(getApplicationContext());
    }
}