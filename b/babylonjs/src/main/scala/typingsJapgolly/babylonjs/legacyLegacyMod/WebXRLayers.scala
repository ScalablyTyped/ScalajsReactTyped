package typingsJapgolly.babylonjs.legacyLegacyMod

import typingsJapgolly.babylonjs.xRFeaturesWebXRLayersMod.IWebXRLayersOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "WebXRLayers")
@js.native
open class WebXRLayers protected ()
  extends typingsJapgolly.babylonjs.indexMod.WebXRLayers {
  def this(_xrSessionManager: typingsJapgolly.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager) = this()
  def this(
    _xrSessionManager: typingsJapgolly.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager,
    _options: IWebXRLayersOptions
  ) = this()
}
/* static members */
object WebXRLayers {
  
  /**
    * The module's name
    */
  @JSImport("babylonjs/Legacy/legacy", "WebXRLayers.Name")
  @js.native
  val Name: String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSImport("babylonjs/Legacy/legacy", "WebXRLayers.Version")
  @js.native
  val Version: Double = js.native
}
