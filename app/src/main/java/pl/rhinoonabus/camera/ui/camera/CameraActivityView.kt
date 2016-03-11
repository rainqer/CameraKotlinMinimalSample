package pl.rhinoonabus.camera.ui.camera

import pl.rhinoonabus.camera.presenter.camera.Ratio

interface CameraActivityView {

    fun setupCameraPreviewRatio(ratio: Ratio)

    fun setupSurfaceForCameraAndUnblock()

}