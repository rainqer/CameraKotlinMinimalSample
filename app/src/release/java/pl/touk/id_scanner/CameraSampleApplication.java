package pl.touk.id_scanner;

import timber.log.Timber;

public class CameraSampleApplication extends BaseApplication {

    @Override
    protected void provideLogging() {
        Timber.plant(new Timber.HollowTree());
    }

//    @Override
//    protected void provideCrashlytics() {
//        Fabric.with(this, new Crashlytics());
//    }
}
