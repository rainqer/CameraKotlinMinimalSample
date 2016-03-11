package pl.rhinoonabus.camera.dagger.camera;

import dagger.Module;
import dagger.Provides;
import pl.rhinoonabus.camera.model.camera.CameraActivityModel;
import pl.rhinoonabus.camera.model.camera.CameraAdapter;
import pl.rhinoonabus.camera.presenter.camera.CameraActivityPresenter;
import pl.rhinoonabus.camera.presenter.camera.CameraActivityPresenterImpl;

@Module
public class CameraModule {

    @CameraActivityScope
    @Provides
    CameraActivityPresenter provideCameraActivityPresenter(CameraActivityModel cameraActivityModel) {

        return new CameraActivityPresenterImpl(
                cameraActivityModel
        );
    }

    @CameraActivityScope
    @Provides
    CameraActivityModel provideCameraActivityModel(CameraAdapter cameraAdapter) {

        return new CameraActivityModel(
                cameraAdapter
        );
    }

    @CameraActivityScope
    @Provides
    CameraAdapter provideCameraAdapter() {

        return new CameraAdapter();
    }
}
