package typingsJapgolly.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a gravitational field event
  */
@JSGlobal("BABYLON.PhysicsGravitationalFieldEvent")
@js.native
open class PhysicsGravitationalFieldEvent protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.PhysicsGravitationalFieldEvent {
  /**
    * Initializes the physics gravitational field event
    * @param _physicsHelper A physics helper
    * @param _scene BabylonJS scene
    * @param _origin The origin position of the gravitational field event
    * @param _options The options for the vortex event
    */
  def this(
    _physicsHelper: typingsJapgolly.babylonjs.BABYLON.PhysicsHelper,
    _scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    _origin: typingsJapgolly.babylonjs.BABYLON.Vector3,
    _options: typingsJapgolly.babylonjs.BABYLON.PhysicsRadialExplosionEventOptions
  ) = this()
}
