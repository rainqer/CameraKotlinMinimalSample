package pl.rhinoonabus.camera.dagger;

import android.content.Context;
import javax.inject.Singleton;
import dagger.Component;

@Singleton
@Component(
        modules = {
                AndroidModule.class,
        }
)
public interface ApplicationComponent {
        Context providesContext();
}
