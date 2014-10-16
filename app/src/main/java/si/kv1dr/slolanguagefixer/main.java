package si.kv1dr.slolanguagefixer;

import android.content.res.XResources;

import de.robv.android.xposed.IXposedHookZygoteInit;
import de.robv.android.xposed.XSharedPreferences;

/**
 * Created by kv1dr on 19.3.2014.
 */
public class main implements IXposedHookZygoteInit {
    private static XSharedPreferences prefs; //povzeto po kodi GravityBox-a
    public static final String IME_PAKETA = main.class.getPackage().getName();
    @Override
    public void initZygote(IXposedHookZygoteInit.StartupParam startupParam) throws Throwable {
        prefs = new XSharedPreferences(IME_PAKETA); //nastavitve
        XResources.setSystemWideReplacement("android", "string", "capital_on", prefs.getString("switchon_text", XResources.getSystem().getString(R.string.pref_default_switchon_name)));
        XResources.setSystemWideReplacement("android", "string", "capital_off", prefs.getString("switchoff_text", XResources.getSystem().getString(R.string.pref_default_switchoff_name)));
    }
}