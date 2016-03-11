package pl.rhinoonabus.camera.presenter.landing

import android.app.Activity
import android.os.Bundle
import android.view.MenuItem
import pl.rhinoonabus.camera.ui.landing.LandingActivityView

class LandingActivityPresenterImpl : LandingActivityPresenter {

    private lateinit var landingActivityView: LandingActivityView
    private lateinit var activity: Activity

    override fun attach(activityView: LandingActivityView, activity: Activity, savedInstanceState: Bundle?) {
        this.landingActivityView = activityView
        this.activity = activity
    }

    override fun onNavigationItemSelected(menuItem: MenuItem?): Boolean {
        landingActivityView.closeDrawer()
        return true;
    }

    override fun resume() {
    }

    override fun pause() {
    }
}
