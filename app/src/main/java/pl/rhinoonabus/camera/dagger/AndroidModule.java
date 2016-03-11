package pl.rhinoonabus.camera.dagger;

import android.app.Application;
import android.content.Context;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;
import pl.rhinoonabus.camera.CameraSampleApplication;

@Module
public class AndroidModule {

    @Provides
    @Singleton
    Application provideApplication() {
        return CameraSampleApplication.getInstance();
    }

    @Provides
    @Singleton
    Context provideContext() {
        return provideApplication();
    }
}
