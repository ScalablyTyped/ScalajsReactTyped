package typingsJapgolly.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRControllerPhysics")
@js.native
open class WebXRControllerPhysics protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.WebXRControllerPhysics {
  /**
    * Construct a new Controller Physics Feature
    * @param _xrSessionManager the corresponding xr session manager
    * @param _options options to create this feature with
    */
  def this(
    _xrSessionManager: typingsJapgolly.babylonjs.BABYLON.WebXRSessionManager,
    _options: typingsJapgolly.babylonjs.BABYLON.IWebXRControllerPhysicsOptions
  ) = this()
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}
/* static members */
object WebXRControllerPhysics {
  
  /**
    * The module's name
    */
  @JSGlobal("BABYLON.WebXRControllerPhysics.Name")
  @js.native
  val Name: /* "xr-physics-controller" */ String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the webxr specs version
    */
  @JSGlobal("BABYLON.WebXRControllerPhysics.Version")
  @js.native
  val Version: /* 1 */ Double = js.native
}
