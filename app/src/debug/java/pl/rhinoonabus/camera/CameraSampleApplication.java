package pl.rhinoonabus.camera;

import timber.log.Timber;

public class CameraSampleApplication extends BaseApplication {

    @Override
    protected void provideLogging() {
        Timber.plant(new Timber.DebugTree());
    }

//    @Override
//    protected void provideCrashlytics() {
//        Fabric.with(this, new Crashlytics());
//    }
}
