package typingsJapgolly.cesium.anon

import typingsJapgolly.cesium.mod.Cartesian2
import typingsJapgolly.cesium.mod.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableCheckIfAllPixelsAreTransparent extends StObject {
  
  var disableCheckIfAllPixelsAreTransparent: js.UndefOr[Boolean] = js.undefined
  
  var missingImageUrl: Resource | String
  
  var pixelsToCheck: js.Array[Cartesian2]
}
object DisableCheckIfAllPixelsAreTransparent {
  
  inline def apply(missingImageUrl: Resource | String, pixelsToCheck: js.Array[Cartesian2]): DisableCheckIfAllPixelsAreTransparent = {
    val __obj = js.Dynamic.literal(missingImageUrl = missingImageUrl.asInstanceOf[js.Any], pixelsToCheck = pixelsToCheck.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableCheckIfAllPixelsAreTransparent]
  }
  
  extension [Self <: DisableCheckIfAllPixelsAreTransparent](x: Self) {
    
    inline def setDisableCheckIfAllPixelsAreTransparent(value: Boolean): Self = StObject.set(x, "disableCheckIfAllPixelsAreTransparent", value.asInstanceOf[js.Any])
    
    inline def setDisableCheckIfAllPixelsAreTransparentUndefined: Self = StObject.set(x, "disableCheckIfAllPixelsAreTransparent", js.undefined)
    
    inline def setMissingImageUrl(value: Resource | String): Self = StObject.set(x, "missingImageUrl", value.asInstanceOf[js.Any])
    
    inline def setPixelsToCheck(value: js.Array[Cartesian2]): Self = StObject.set(x, "pixelsToCheck", value.asInstanceOf[js.Any])
    
    inline def setPixelsToCheckVarargs(value: Cartesian2*): Self = StObject.set(x, "pixelsToCheck", js.Array(value*))
  }
}
