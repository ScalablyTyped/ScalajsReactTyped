package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.Behavior
import typingsJapgolly.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.HemisphericLight")
@js.native
open class HemisphericLight protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.HemisphericLight {
  /**
    * Creates a HemisphericLight object in the scene according to the passed direction (Vector3).
    * The HemisphericLight simulates the ambient environment light, so the passed direction is the light reflection direction, not the incoming direction.
    * The HemisphericLight can't cast shadows.
    * Documentation : https://doc.babylonjs.com/babylon101/lights
    * @param name The friendly name of the light
    * @param direction The direction of the light reflection
    * @param scene The scene the light belongs to
    */
  def this(
    name: String,
    direction: typingsJapgolly.babylonjs.BABYLON.Vector3,
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
  
  /**
    * Defines the rendering priority of the lights. It can help in case of fallback or number of lights
    * exceeding the number allowed of the materials.
    */
  /* CompleteClass */
  var renderPriority: Double = js.native
  
  /**
    * Gets or sets whether or not the shadows are enabled for this light. This can help turning off/on shadow without detaching
    * the current shadow generator.
    */
  /* CompleteClass */
  var shadowEnabled: Boolean = js.native
}
