package typingsJapgolly.babylonjs.camerasIndexMod

import typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
import typingsJapgolly.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Cameras/index", "AnaglyphUniversalCamera")
@js.native
open class AnaglyphUniversalCamera protected ()
  extends typingsJapgolly.babylonjs.camerasStereoscopicIndexMod.AnaglyphUniversalCamera {
  /**
    * Creates a new AnaglyphUniversalCamera
    * @param name defines camera name
    * @param position defines initial position
    * @param interaxialDistance defines distance between each color axis
    * @param scene defines the hosting scene
    */
  def this(name: String, position: Vector3, interaxialDistance: Double) = this()
  def this(name: String, position: Vector3, interaxialDistance: Double, scene: Scene) = this()
}
