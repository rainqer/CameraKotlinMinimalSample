package pl.rhinoonabus.camera.presenter.camera

import android.view.SurfaceHolder
import pl.rhinoonabus.camera.presenter.ActivityPresenter
import pl.rhinoonabus.camera.ui.camera.CameraActivityView

interface CameraActivityPresenter : ActivityPresenter<CameraActivityView> {

    fun cameraSurfaceReady(holder: SurfaceHolder)
    fun cameraSurfaceRefresh()
    fun onRequestPermissionsResult(requestCode: Int, grantResults: IntArray)
}
