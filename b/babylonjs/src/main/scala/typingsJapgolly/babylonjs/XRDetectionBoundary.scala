package typingsJapgolly.babylonjs

import typingsJapgolly.std.DOMPointReadOnly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babylonjs.XRFrustumDetectionBoundary
  - typingsJapgolly.babylonjs.XRSphereDetectionBoundary
  - typingsJapgolly.babylonjs.XRBoxDetectionBoundary
*/
trait XRDetectionBoundary extends StObject
object XRDetectionBoundary {
  
  inline def XRBoxDetectionBoundary(extent: DOMPointReadOnly): typingsJapgolly.babylonjs.XRBoxDetectionBoundary = {
    val __obj = js.Dynamic.literal(extent = extent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("box")
    __obj.asInstanceOf[typingsJapgolly.babylonjs.XRBoxDetectionBoundary]
  }
  
  inline def XRFrustumDetectionBoundary(frustum: XRFrustum): typingsJapgolly.babylonjs.XRFrustumDetectionBoundary = {
    val __obj = js.Dynamic.literal(frustum = frustum.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("frustum")
    __obj.asInstanceOf[typingsJapgolly.babylonjs.XRFrustumDetectionBoundary]
  }
  
  inline def XRSphereDetectionBoundary(radius: Double): typingsJapgolly.babylonjs.XRSphereDetectionBoundary = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sphere")
    __obj.asInstanceOf[typingsJapgolly.babylonjs.XRSphereDetectionBoundary]
  }
}
