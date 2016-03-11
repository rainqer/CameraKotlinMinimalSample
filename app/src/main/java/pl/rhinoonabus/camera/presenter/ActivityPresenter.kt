package pl.rhinoonabus.camera.presenter

import android.app.Activity
import android.os.Bundle

interface ActivityPresenter <in T>{

    fun attach(activityView: T,
               activity: Activity,
               savedInstanceState: Bundle?)
    fun resume()
    fun pause()
}
