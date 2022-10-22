package typingsJapgolly.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationInfo extends StObject {
  
  /** lat/long location coordinates. */
  var latLng: js.UndefOr[LatLng] = js.undefined
}
object LocationInfo {
  
  inline def apply(): LocationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationInfo]
  }
  
  extension [Self <: LocationInfo](x: Self) {
    
    inline def setLatLng(value: LatLng): Self = StObject.set(x, "latLng", value.asInstanceOf[js.Any])
    
    inline def setLatLngUndefined: Self = StObject.set(x, "latLng", js.undefined)
  }
}
