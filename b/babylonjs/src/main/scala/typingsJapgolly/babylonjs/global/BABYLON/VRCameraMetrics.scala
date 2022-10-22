package typingsJapgolly.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.VRCameraMetrics")
@js.native
open class VRCameraMetrics ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.VRCameraMetrics
/* static members */
object VRCameraMetrics {
  
  @JSGlobal("BABYLON.VRCameraMetrics")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get the default VRMetrics based on the most generic setup.
    * @returns the default vr metrics
    */
  inline def GetDefault(): typingsJapgolly.babylonjs.BABYLON.VRCameraMetrics = ^.asInstanceOf[js.Dynamic].applyDynamic("GetDefault")().asInstanceOf[typingsJapgolly.babylonjs.BABYLON.VRCameraMetrics]
}
