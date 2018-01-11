package com.example.usuario.preferencias;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by usuario on 11/01/18.
 */

public class OpcionesActivity extends PreferenceActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.preferencias);
    }
}