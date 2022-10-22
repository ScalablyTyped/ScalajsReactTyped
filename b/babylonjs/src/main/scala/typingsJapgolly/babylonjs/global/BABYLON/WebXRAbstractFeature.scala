package typingsJapgolly.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSGlobal("BABYLON.WebXRAbstractFeature")
@js.native
open class WebXRAbstractFeature protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.WebXRAbstractFeature {
  /**
    * Construct a new (abstract) WebXR feature
    * @param _xrSessionManager the xr session manager for this feature
    */
  def this(_xrSessionManager: typingsJapgolly.babylonjs.BABYLON.WebXRSessionManager) = this()
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}
