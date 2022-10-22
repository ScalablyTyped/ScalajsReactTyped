package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.IWebXRAnchorSystemOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRAnchorSystem")
@js.native
open class WebXRAnchorSystem protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.WebXRAnchorSystem {
  /**
    * constructs a new anchor system
    * @param _xrSessionManager an instance of WebXRSessionManager
    * @param _options configuration object for this feature
    */
  def this(_xrSessionManager: typingsJapgolly.babylonjs.BABYLON.WebXRSessionManager) = this()
  def this(
    _xrSessionManager: typingsJapgolly.babylonjs.BABYLON.WebXRSessionManager,
    _options: IWebXRAnchorSystemOptions
  ) = this()
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}
/* static members */
object WebXRAnchorSystem {
  
  /**
    * The module's name
    */
  @JSGlobal("BABYLON.WebXRAnchorSystem.Name")
  @js.native
  val Name: /* "xr-anchor-system" */ String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSGlobal("BABYLON.WebXRAnchorSystem.Version")
  @js.native
  val Version: /* 1 */ Double = js.native
}
