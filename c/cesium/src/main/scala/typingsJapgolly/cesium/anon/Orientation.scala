package typingsJapgolly.cesium.anon

import typingsJapgolly.cesium.mod.Cartesian3
import typingsJapgolly.cesium.mod.OrthographicFrustum
import typingsJapgolly.cesium.mod.PerspectiveFrustum
import typingsJapgolly.cesium.mod.Quaternion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Orientation extends StObject {
  
  var frustum: PerspectiveFrustum | OrthographicFrustum
  
  var orientation: Quaternion
  
  var origin: Cartesian3
}
object Orientation {
  
  inline def apply(frustum: PerspectiveFrustum | OrthographicFrustum, orientation: Quaternion, origin: Cartesian3): Orientation = {
    val __obj = js.Dynamic.literal(frustum = frustum.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Orientation]
  }
  
  extension [Self <: Orientation](x: Self) {
    
    inline def setFrustum(value: PerspectiveFrustum | OrthographicFrustum): Self = StObject.set(x, "frustum", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: Quaternion): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: Cartesian3): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
  }
}
