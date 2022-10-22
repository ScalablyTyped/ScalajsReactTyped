package typingsJapgolly.babylonjs.camerasIndexMod

import typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
import typingsJapgolly.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Cameras/index", "FlyCamera")
@js.native
open class FlyCamera protected ()
  extends typingsJapgolly.babylonjs.camerasFlyCameraMod.FlyCamera {
  /**
    * Instantiates a FlyCamera.
    * This is a flying camera, designed for 3D movement and rotation in all directions,
    * such as in a 3D Space Shooter or a Flight Simulator.
    * @param name Define the name of the camera in the scene.
    * @param position Define the starting position of the camera in the scene.
    * @param scene Define the scene the camera belongs to.
    * @param setActiveOnSceneIfNoneActive Defines whether the camera should be marked as active, if no other camera has been defined as active.
    */
  def this(name: String, position: Vector3) = this()
  def this(name: String, position: Vector3, scene: Scene) = this()
  def this(name: String, position: Vector3, scene: Unit, setActiveOnSceneIfNoneActive: Boolean) = this()
  def this(name: String, position: Vector3, scene: Scene, setActiveOnSceneIfNoneActive: Boolean) = this()
}
