package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.Behavior
import typingsJapgolly.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.StereoscopicUniversalCamera")
@js.native
open class StereoscopicUniversalCamera protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.StereoscopicUniversalCamera {
  /**
    * Creates a new StereoscopicUniversalCamera
    * @param name defines camera name
    * @param position defines initial position
    * @param interaxialDistance defines distance between each color axis
    * @param isStereoscopicSideBySide defines is stereoscopic is done side by side or over under
    * @param scene defines the hosting scene
    */
  def this(
    name: String,
    position: typingsJapgolly.babylonjs.BABYLON.Vector3,
    interaxialDistance: Double,
    isStereoscopicSideBySide: Boolean
  ) = this()
  def this(
    name: String,
    position: typingsJapgolly.babylonjs.BABYLON.Vector3,
    interaxialDistance: Double,
    isStereoscopicSideBySide: Boolean,
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
