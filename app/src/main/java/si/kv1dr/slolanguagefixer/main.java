package si.kv1dr.slolanguagefixer;

import android.content.res.XResources;

import de.robv.android.xposed.IXposedHookZygoteInit;

/**
 * Created by kv1dr on 19.3.2014.
 */
public class main implements IXposedHookZygoteInit {
    @Override
    public void initZygote(IXposedHookZygoteInit.StartupParam startupParam) throws Throwable {
        XResources.setSystemWideReplacement("android", "string", "capital_on", "VKL.");
        XResources.setSystemWideReplacement("android", "string", "capital_off", "IZKL.");
    }
}