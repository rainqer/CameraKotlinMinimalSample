package pl.rhinoonabus.camera.dagger

interface HasComponent<out T> {
    val component: T
}
