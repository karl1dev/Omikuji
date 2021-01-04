package app.android.androidomikuji

import android.os.Bundle
import androidx.preference.PreferenceFragment
import app.android.androidomikuji.R

class OmikujiPreferenceFragment: PreferenceFragment() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        addPreferencesFromResource(R.xml.preference)
    }
}