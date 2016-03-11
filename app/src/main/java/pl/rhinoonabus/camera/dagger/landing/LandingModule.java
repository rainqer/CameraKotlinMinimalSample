package pl.rhinoonabus.camera.dagger.landing;

import dagger.Module;
import dagger.Provides;
import pl.rhinoonabus.camera.presenter.landing.LandingActivityPresenter;
import pl.rhinoonabus.camera.presenter.landing.LandingActivityPresenterImpl;

@Module
public class LandingModule {

    @LandingActivityScope
    @Provides
    LandingActivityPresenter provideLandingActivityPresenter() {

        return new LandingActivityPresenterImpl();
    }
}
