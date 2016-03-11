package pl.rhinoonabus.camera.dagger.landing;

import dagger.Component;
import pl.rhinoonabus.camera.dagger.ApplicationComponent;
import pl.rhinoonabus.camera.ui.landing.LandingActivity;

@LandingActivityScope
@Component (
        dependencies = ApplicationComponent.class,
        modules = LandingModule.class
)
public interface LandingActivityComponent {
        void inject(LandingActivity activity);
}
