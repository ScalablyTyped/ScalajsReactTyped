package typingsJapgolly.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a physics updraft event
  */
@JSGlobal("BABYLON.PhysicsUpdraftEvent")
@js.native
open class PhysicsUpdraftEvent protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.PhysicsUpdraftEvent {
  /**
    * Initializes the physics updraft event
    * @param _scene BabylonJS scene
    * @param _origin The origin position of the updraft
    * @param _options The options for the updraft event
    */
  def this(
    _scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    _origin: typingsJapgolly.babylonjs.BABYLON.Vector3,
    _options: typingsJapgolly.babylonjs.BABYLON.PhysicsUpdraftEventOptions
  ) = this()
}
