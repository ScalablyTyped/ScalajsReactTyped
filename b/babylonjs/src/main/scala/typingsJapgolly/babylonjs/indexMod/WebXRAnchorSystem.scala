package typingsJapgolly.babylonjs.indexMod

import typingsJapgolly.babylonjs.xRFeaturesWebXRAnchorSystemMod.IWebXRAnchorSystemOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "WebXRAnchorSystem")
@js.native
open class WebXRAnchorSystem protected ()
  extends typingsJapgolly.babylonjs.xRIndexMod.WebXRAnchorSystem {
  /**
    * constructs a new anchor system
    * @param _xrSessionManager an instance of WebXRSessionManager
    * @param _options configuration object for this feature
    */
  def this(_xrSessionManager: typingsJapgolly.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager) = this()
  def this(
    _xrSessionManager: typingsJapgolly.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager,
    _options: IWebXRAnchorSystemOptions
  ) = this()
}
/* static members */
object WebXRAnchorSystem {
  
  /**
    * The module's name
    */
  @JSImport("babylonjs/index", "WebXRAnchorSystem.Name")
  @js.native
  val Name: String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSImport("babylonjs/index", "WebXRAnchorSystem.Version")
  @js.native
  val Version: Double = js.native
}
