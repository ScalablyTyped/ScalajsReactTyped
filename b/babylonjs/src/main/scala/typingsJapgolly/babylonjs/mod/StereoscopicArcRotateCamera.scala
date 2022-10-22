package typingsJapgolly.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "StereoscopicArcRotateCamera")
@js.native
open class StereoscopicArcRotateCamera protected ()
  extends typingsJapgolly.babylonjs.legacyLegacyMod.StereoscopicArcRotateCamera {
  /**
    * Creates a new StereoscopicArcRotateCamera
    * @param name defines camera name
    * @param alpha defines alpha angle (in radians)
    * @param beta defines beta angle (in radians)
    * @param radius defines radius
    * @param target defines camera target
    * @param interaxialDistance defines distance between each color axis
    * @param isStereoscopicSideBySide defines is stereoscopic is done side by side or over under
    * @param scene defines the hosting scene
    */
  def this(
    name: String,
    alpha: Double,
    beta: Double,
    radius: Double,
    target: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    interaxialDistance: Double,
    isStereoscopicSideBySide: Boolean
  ) = this()
  def this(
    name: String,
    alpha: Double,
    beta: Double,
    radius: Double,
    target: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    interaxialDistance: Double,
    isStereoscopicSideBySide: Boolean,
    scene: typingsJapgolly.babylonjs.sceneMod.Scene
  ) = this()
}
