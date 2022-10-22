package typingsJapgolly.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRFeaturePointSystem")
@js.native
open class WebXRFeaturePointSystem protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.WebXRFeaturePointSystem {
  /**
    * construct the feature point system
    * @param _xrSessionManager an instance of xr Session manager
    */
  def this(_xrSessionManager: typingsJapgolly.babylonjs.BABYLON.WebXRSessionManager) = this()
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}
/* static members */
object WebXRFeaturePointSystem {
  
  /**
    * The module's name
    */
  @JSGlobal("BABYLON.WebXRFeaturePointSystem.Name")
  @js.native
  val Name: /* "xr-feature-points" */ String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSGlobal("BABYLON.WebXRFeaturePointSystem.Version")
  @js.native
  val Version: /* 1 */ Double = js.native
}
