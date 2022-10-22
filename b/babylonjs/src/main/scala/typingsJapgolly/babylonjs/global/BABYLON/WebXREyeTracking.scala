package typingsJapgolly.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXREyeTracking")
@js.native
open class WebXREyeTracking protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.WebXREyeTracking {
  /**
    * Creates a new instance of the XR eye tracking feature.
    * @param _xrSessionManager An instance of WebXRSessionManager.
    */
  def this(_xrSessionManager: typingsJapgolly.babylonjs.BABYLON.WebXRSessionManager) = this()
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}
/* static members */
object WebXREyeTracking {
  
  /**
    * The module's name
    */
  @JSGlobal("BABYLON.WebXREyeTracking.Name")
  @js.native
  val Name: /* "xr-eye-tracking" */ String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSGlobal("BABYLON.WebXREyeTracking.Version")
  @js.native
  val Version: /* 1 */ Double = js.native
}
