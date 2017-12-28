package sudo.example.org.myapplication;


import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by cr7 on 19/12/17.
 */

public class Prefs extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings);
    }
}
