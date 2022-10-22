package typingsJapgolly.babylonjs.legacyLegacyMod

import typingsJapgolly.babylonjs.xRFeaturesWebXRMeshDetectorMod.IWebXRMeshDetectorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "WebXRMeshDetector")
@js.native
open class WebXRMeshDetector protected ()
  extends typingsJapgolly.babylonjs.indexMod.WebXRMeshDetector {
  def this(_xrSessionManager: typingsJapgolly.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager) = this()
  def this(
    _xrSessionManager: typingsJapgolly.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager,
    _options: IWebXRMeshDetectorOptions
  ) = this()
}
/* static members */
object WebXRMeshDetector {
  
  /**
    * The module's name
    */
  @JSImport("babylonjs/Legacy/legacy", "WebXRMeshDetector.Name")
  @js.native
  val Name: String = js.native
  
  /**
    * The (Babylon) version of this module.
    * This is an integer representing the implementation version.
    * This number does not correspond to the WebXR specs version
    */
  @JSImport("babylonjs/Legacy/legacy", "WebXRMeshDetector.Version")
  @js.native
  val Version: Double = js.native
}
