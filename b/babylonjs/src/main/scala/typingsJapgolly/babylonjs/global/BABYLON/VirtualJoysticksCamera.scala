package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.Behavior
import typingsJapgolly.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.VirtualJoysticksCamera")
@js.native
open class VirtualJoysticksCamera protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.VirtualJoysticksCamera {
  /**
    * Instantiates a VirtualJoysticksCamera. It can be useful in First Person Shooter game for instance.
    * It is identical to the Free Camera and simply adds by default a virtual joystick.
    * Virtual Joysticks are on-screen 2D graphics that are used to control the camera or other scene items.
    * @see https://doc.babylonjs.com/features/cameras#virtual-joysticks-camera
    * @param name Define the name of the camera in the scene
    * @param position Define the start position of the camera in the scene
    * @param scene Define the scene the camera belongs to
    */
  def this(name: String, position: typingsJapgolly.babylonjs.BABYLON.Vector3) = this()
  def this(
    name: String,
    position: typingsJapgolly.babylonjs.BABYLON.Vector3,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene
  ) = this()
  
  /**
    * Attach a behavior
    * @param behavior defines the behavior to attach
    * @returns the current host
    */
  /* CompleteClass */
  override def addBehavior(behavior: Behavior[typingsJapgolly.babylonjs.BABYLON.Node]): typingsJapgolly.babylonjs.BABYLON.Node = js.native
  
  /**
    * Gets a behavior using its name to search
    * @param name defines the name to search
    * @returns the behavior or null if not found
    */
  /* CompleteClass */
  override def getBehaviorByName(name: String): Nullable[Behavior[typingsJapgolly.babylonjs.BABYLON.Node]] = js.native
  
  /**
    * Remove a behavior from the current object
    * @param behavior defines the behavior to detach
    * @returns the current host
    */
  /* CompleteClass */
  override def removeBehavior(behavior: Behavior[typingsJapgolly.babylonjs.BABYLON.Node]): typingsJapgolly.babylonjs.BABYLON.Node = js.native
}
