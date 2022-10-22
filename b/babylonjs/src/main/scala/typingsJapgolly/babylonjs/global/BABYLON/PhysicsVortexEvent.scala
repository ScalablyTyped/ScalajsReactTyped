package typingsJapgolly.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a physics vortex event
  */
@JSGlobal("BABYLON.PhysicsVortexEvent")
@js.native
open class PhysicsVortexEvent protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.PhysicsVortexEvent {
  /**
    * Initializes the physics vortex event
    * @param _scene The BabylonJS scene
    * @param _origin The origin position of the vortex
    * @param _options The options for the vortex event
    */
  def this(
    _scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    _origin: typingsJapgolly.babylonjs.BABYLON.Vector3,
    _options: typingsJapgolly.babylonjs.BABYLON.PhysicsVortexEventOptions
  ) = this()
}
