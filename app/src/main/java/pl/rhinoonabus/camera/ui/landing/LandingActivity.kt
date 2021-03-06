package pl.rhinoonabus.camera.ui.landing

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.view.Menu
import butterknife.bindView
import pl.rhinoonabus.camera.presenter.ActivityPresenter
import pl.rhinoonabus.camera.R
import pl.rhinoonabus.camera.dagger.HasComponent
import pl.rhinoonabus.camera.dagger.landing.LandingActivityComponent
import pl.rhinoonabus.camera.dagger.landing.LandingActivityComponentAssembler
import pl.rhinoonabus.camera.presenter.landing.LandingActivityPresenter
import pl.rhinoonabus.camera.ui.SlowkaActivity
import pl.rhinoonabus.camera.ui.camera.CameraActivity
import javax.inject.Inject

class LandingActivity : SlowkaActivity<LandingActivityView>(),
        LandingActivityView,
        HasComponent<LandingActivityComponent?> {

    @Inject
    protected lateinit var presenter: LandingActivityPresenter
    override var component: LandingActivityComponent? = null
    override val activityPresenter: ActivityPresenter<LandingActivityView>
        get() = presenter

    val navigationView : NavigationView by bindView(R.id.nav_view)
    val drawer : DrawerLayout by bindView(R.id.drawer_layout)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentViewWithToolbar(R.layout.activity_landing)

        val fab = findViewById(R.id.fab) as FloatingActionButton
        fab.setOnClickListener {
            startActivity(CameraActivity.createIntent(this))
        }

        val drawer = findViewById(R.id.drawer_layout) as DrawerLayout
        val toggle = ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer.setDrawerListener(toggle)
        toggle.syncState()

        setDaggerComponent(LandingActivityComponentAssembler.assemble(application))
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        attachPresenter(this, this, savedInstanceState)
        navigationView.setNavigationItemSelectedListener(presenter)
    }

    private fun setDaggerComponent(component: LandingActivityComponent) {
        this.component = component
        this.component?.inject(this)
    }

    override fun onBackPressed() {
        closeDrawer()
        super.onBackPressed()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.landing, menu)
        return true
    }

    override fun closeDrawer() {
        drawer.closeDrawer(GravityCompat.START)
    }
}
