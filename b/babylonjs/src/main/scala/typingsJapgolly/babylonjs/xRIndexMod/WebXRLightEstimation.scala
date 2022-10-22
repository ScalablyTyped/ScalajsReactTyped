package typingsJapgolly.babylonjs.xRIndexMod

import typingsJapgolly.babylonjs.xRFeaturesWebXRLightEstimationMod.IWebXRLightEstimationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/index", "WebXRLightEstimation")
@js.native
open class WebXRLightEstimation protected ()
  extends typingsJapgolly.babylonjs.xRFeaturesIndexMod.WebXRLightEstimation {
  /**
    * Creates a new instance of the light estimation feature
    * @param _xrSessionManager an instance of WebXRSessionManager
    * @param options options to use when constructing this feature
    */
  def this(
    _xrSessionManager: typingsJapgolly.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager,
    /**
    * options to use when constructing this feature
    */
  options: IWebXRLightEstimationOptions
  ) = this()
}
/* static members */
object WebXRLightEstimation {
  
  /**
    * The module's name
    */
  @JSImport("babylonjs/XR/index", "WebXRLightEstimation.Name")
  @js.native
  val Name: String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSImport("babylonjs/XR/index", "WebXRLightEstimation.Version")
  @js.native
  val Version: Double = js.native
}
