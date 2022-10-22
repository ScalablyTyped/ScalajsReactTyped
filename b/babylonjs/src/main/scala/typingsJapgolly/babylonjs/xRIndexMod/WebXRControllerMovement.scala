package typingsJapgolly.babylonjs.xRIndexMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.babylonjs.xRFeaturesWebXRControllerMovementMod.IWebXRControllerMovementOptions
import typingsJapgolly.babylonjs.xRFeaturesWebXRControllerMovementMod.WebXRControllerMovementRegistrationConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/index", "WebXRControllerMovement")
@js.native
open class WebXRControllerMovement protected ()
  extends typingsJapgolly.babylonjs.xRFeaturesIndexMod.WebXRControllerMovement {
  /**
    * constructs a new movement controller system
    * @param _xrSessionManager an instance of WebXRSessionManager
    * @param options configuration object for this feature
    */
  def this(
    _xrSessionManager: typingsJapgolly.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager,
    options: IWebXRControllerMovementOptions
  ) = this()
}
/* static members */
object WebXRControllerMovement {
  
  /**
    * The module's name
    */
  @JSImport("babylonjs/XR/index", "WebXRControllerMovement.Name")
  @js.native
  val Name: String = js.native
  
  /**
    * Standard controller configurations.
    */
  @JSImport("babylonjs/XR/index", "WebXRControllerMovement.REGISTRATIONS")
  @js.native
  val REGISTRATIONS: StringDictionary[js.Array[WebXRControllerMovementRegistrationConfiguration]] = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the webxr specs version
    */
  @JSImport("babylonjs/XR/index", "WebXRControllerMovement.Version")
  @js.native
  val Version: Double = js.native
}
