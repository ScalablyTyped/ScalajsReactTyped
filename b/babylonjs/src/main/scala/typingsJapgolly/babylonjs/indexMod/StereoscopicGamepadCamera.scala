package typingsJapgolly.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "StereoscopicGamepadCamera")
@js.native
open class StereoscopicGamepadCamera protected ()
  extends typingsJapgolly.babylonjs.camerasIndexMod.StereoscopicGamepadCamera {
  /**
    * Creates a new StereoscopicGamepadCamera
    * @param name defines camera name
    * @param position defines initial position
    * @param interaxialDistance defines distance between each color axis
    * @param isStereoscopicSideBySide defines is stereoscopic is done side by side or over under
    * @param scene defines the hosting scene
    */
  def this(
    name: String,
    position: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    interaxialDistance: Double,
    isStereoscopicSideBySide: Boolean
  ) = this()
  def this(
    name: String,
    position: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    interaxialDistance: Double,
    isStereoscopicSideBySide: Boolean,
    scene: typingsJapgolly.babylonjs.sceneMod.Scene
  ) = this()
}
