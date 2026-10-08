/*
 * Copyright (C) 2022 Yet Another AOSP Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.yasp.settings.preferences;

import android.content.ContentResolver;
import android.provider.Settings;

public class SecureSettingsStore {
    private ContentResolver mContentResolver;

    public SecureSettingsStore(ContentResolver contentResolver) {
        mContentResolver = contentResolver;
    }

    public int getInt(String key, int def) {
        return Settings.Secure.getInt(mContentResolver, key, def);
    }

    public String getString(String key, String def) {
        return Settings.Secure.getString(mContentResolver, key, def);
    }

    public boolean putInt(String key, int value) {
        return Settings.Secure.putInt(mContentResolver, key, value);
    }

    public boolean putString(String key, String value) {
        return Settings.Secure.putString(mContentResolver, key, value);
    }
}