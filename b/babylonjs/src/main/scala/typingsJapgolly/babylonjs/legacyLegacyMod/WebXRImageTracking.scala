package typingsJapgolly.babylonjs.legacyLegacyMod

import typingsJapgolly.babylonjs.xRFeaturesWebXRImageTrackingMod.IWebXRImageTrackingOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "WebXRImageTracking")
@js.native
open class WebXRImageTracking protected ()
  extends typingsJapgolly.babylonjs.indexMod.WebXRImageTracking {
  /**
    * constructs the image tracking feature
    * @param _xrSessionManager the session manager for this module
    * @param options read-only options to be used in this module
    */
  def this(
    _xrSessionManager: typingsJapgolly.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager,
    /**
    * read-only options to be used in this module
    */
  options: IWebXRImageTrackingOptions
  ) = this()
}
/* static members */
object WebXRImageTracking {
  
  /**
    * The module's name
    */
  @JSImport("babylonjs/Legacy/legacy", "WebXRImageTracking.Name")
  @js.native
  val Name: String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSImport("babylonjs/Legacy/legacy", "WebXRImageTracking.Version")
  @js.native
  val Version: Double = js.native
}
