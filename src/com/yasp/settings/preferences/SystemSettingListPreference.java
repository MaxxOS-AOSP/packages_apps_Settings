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

import android.content.Context;
import android.provider.Settings;
import androidx.preference.ListPreference;
import android.util.AttributeSet;

public class SystemSettingListPreference extends ListPreference {

    private String mSetting;

    public SystemSettingListPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setSetting(String setting) {
        mSetting = setting;
    }

    @Override
    public void setValue(String value) {
        super.setValue(value);
        if (mSetting != null) {
            Settings.System.putString(getContext().getContentResolver(), mSetting, value);
        }
    }
}