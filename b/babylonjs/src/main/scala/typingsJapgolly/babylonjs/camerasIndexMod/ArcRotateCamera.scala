package typingsJapgolly.babylonjs.camerasIndexMod

import typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
import typingsJapgolly.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Cameras/index", "ArcRotateCamera")
@js.native
open class ArcRotateCamera protected ()
  extends typingsJapgolly.babylonjs.camerasArcRotateCameraMod.ArcRotateCamera {
  /**
    * Instantiates a new ArcRotateCamera in a given scene
    * @param name Defines the name of the camera
    * @param alpha Defines the camera rotation along the longitudinal axis
    * @param beta Defines the camera rotation along the latitudinal axis
    * @param radius Defines the camera distance from its target
    * @param target Defines the camera target
    * @param scene Defines the scene the camera belongs to
    * @param setActiveOnSceneIfNoneActive Defines whether the camera should be marked as active if not other active cameras have been defined
    */
  def this(name: String, alpha: Double, beta: Double, radius: Double, target: Vector3) = this()
  def this(name: String, alpha: Double, beta: Double, radius: Double, target: Vector3, scene: Scene) = this()
  def this(
    name: String,
    alpha: Double,
    beta: Double,
    radius: Double,
    target: Vector3,
    scene: Unit,
    setActiveOnSceneIfNoneActive: Boolean
  ) = this()
  def this(
    name: String,
    alpha: Double,
    beta: Double,
    radius: Double,
    target: Vector3,
    scene: Scene,
    setActiveOnSceneIfNoneActive: Boolean
  ) = this()
}
