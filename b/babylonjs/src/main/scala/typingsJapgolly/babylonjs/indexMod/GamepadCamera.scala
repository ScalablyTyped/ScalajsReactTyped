package typingsJapgolly.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "GamepadCamera")
@js.native
open class GamepadCamera protected ()
  extends typingsJapgolly.babylonjs.camerasIndexMod.GamepadCamera {
  /**
    * Instantiates a new Gamepad Camera
    * This represents a FPS type of camera. This is only here for back compat purpose.
    * Please use the UniversalCamera instead as both are identical.
    * @see https://doc.babylonjs.com/features/cameras#universal-camera
    * @param name Define the name of the camera in the scene
    * @param position Define the start position of the camera in the scene
    * @param scene Define the scene the camera belongs to
    */
  def this(name: String, position: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3) = this()
  def this(
    name: String,
    position: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    scene: typingsJapgolly.babylonjs.sceneMod.Scene
  ) = this()
}
