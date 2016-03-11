package pl.rhinoonabus.camera.dagger.camera;

import dagger.Component;
import pl.rhinoonabus.camera.dagger.ApplicationComponent;
import pl.rhinoonabus.camera.ui.camera.CameraActivity;

@CameraActivityScope
@Component (
        dependencies = ApplicationComponent.class,
        modules = CameraModule.class
)
public interface CameraActivityComponent {
        void inject(CameraActivity activity);
}
