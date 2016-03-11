package pl.rhinoonabus.camera.presenter.landing

import android.support.design.widget.NavigationView
import pl.rhinoonabus.camera.presenter.ActivityPresenter
import pl.rhinoonabus.camera.ui.landing.LandingActivityView

interface LandingActivityPresenter : ActivityPresenter<LandingActivityView>,
        NavigationView.OnNavigationItemSelectedListener