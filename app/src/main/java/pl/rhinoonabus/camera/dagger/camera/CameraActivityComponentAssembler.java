package pl.rhinoonabus.camera.dagger.camera;

import android.app.Application;

import pl.rhinoonabus.camera.dagger.Components;

public class CameraActivityComponentAssembler {

    private CameraActivityComponentAssembler() {
        throw new AssertionError("No instances.");
    }

    public static CameraActivityComponent assemble(Application application) {
        return DaggerCameraActivityComponent.builder()
                .applicationComponent(Components.from(application))
                .cameraModule(new CameraModule())
                .build();
    }
}
