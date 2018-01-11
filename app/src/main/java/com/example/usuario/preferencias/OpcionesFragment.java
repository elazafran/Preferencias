package com.example.usuario.preferencias;

import android.preference.PreferenceFragment;
import android.os.Bundle;

public class OpcionesFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.preferencias);
    }
}