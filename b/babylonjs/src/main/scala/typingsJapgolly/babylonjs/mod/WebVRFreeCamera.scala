package typingsJapgolly.babylonjs.mod

import typingsJapgolly.babylonjs.camerasVRWebVRCameraMod.WebVROptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "WebVRFreeCamera")
@js.native
open class WebVRFreeCamera protected ()
  extends typingsJapgolly.babylonjs.legacyLegacyMod.WebVRFreeCamera {
  /**
    * Instantiates a WebVRFreeCamera.
    * @param name The name of the WebVRFreeCamera
    * @param position The starting anchor position for the camera
    * @param scene The scene the camera belongs to
    * @param _webVROptions a set of customizable options for the webVRCamera
    */
  def this(name: String, position: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3) = this()
  def this(
    name: String,
    position: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    scene: typingsJapgolly.babylonjs.sceneMod.Scene
  ) = this()
  def this(
    name: String,
    position: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    scene: Unit,
    _webVROptions: WebVROptions
  ) = this()
  def this(
    name: String,
    position: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    _webVROptions: WebVROptions
  ) = this()
}
