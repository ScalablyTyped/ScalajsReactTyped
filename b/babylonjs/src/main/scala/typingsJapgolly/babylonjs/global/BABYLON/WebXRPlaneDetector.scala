package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.IWebXRPlaneDetectorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRPlaneDetector")
@js.native
open class WebXRPlaneDetector protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.WebXRPlaneDetector {
  /**
    * construct a new Plane Detector
    * @param _xrSessionManager an instance of xr Session manager
    * @param _options configuration to use when constructing this feature
    */
  def this(_xrSessionManager: typingsJapgolly.babylonjs.BABYLON.WebXRSessionManager) = this()
  def this(
    _xrSessionManager: typingsJapgolly.babylonjs.BABYLON.WebXRSessionManager,
    _options: IWebXRPlaneDetectorOptions
  ) = this()
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}
/* static members */
object WebXRPlaneDetector {
  
  /**
    * The module's name
    */
  @JSGlobal("BABYLON.WebXRPlaneDetector.Name")
  @js.native
  val Name: /* "xr-plane-detection" */ String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSGlobal("BABYLON.WebXRPlaneDetector.Version")
  @js.native
  val Version: /* 1 */ Double = js.native
}
