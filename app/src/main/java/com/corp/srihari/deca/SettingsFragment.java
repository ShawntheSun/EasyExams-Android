package com.corp.srihari.deca;

/**
 * Created by sriharivishnu on 2018-09-11.
 */


import android.content.Intent;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by sriharivishnu on 2018-08-15.
 */

public class SettingsFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Load the preferences from an XML resource
        addPreferencesFromResource(R.xml.app_preferences);
        Preference preference = (Preference) findPreference("clear");
        preference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                QuoteBank mQuotebank = new QuoteBank(getContext());
                mQuotebank.clear();
                return true;
            }
        });
    }
}