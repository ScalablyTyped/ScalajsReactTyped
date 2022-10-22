package typingsJapgolly.babylonjs.camerasIndexMod

import typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
import typingsJapgolly.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Cameras/index", "DeviceOrientationCamera")
@js.native
open class DeviceOrientationCamera protected ()
  extends typingsJapgolly.babylonjs.camerasDeviceOrientationCameraMod.DeviceOrientationCamera {
  /**
    * Creates a new device orientation camera
    * @param name The name of the camera
    * @param position The start position camera
    * @param scene The scene the camera belongs to
    */
  def this(name: String, position: Vector3) = this()
  def this(name: String, position: Vector3, scene: Scene) = this()
}
