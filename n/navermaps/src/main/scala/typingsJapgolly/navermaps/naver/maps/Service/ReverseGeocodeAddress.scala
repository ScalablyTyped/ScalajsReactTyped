package typingsJapgolly.navermaps.naver.maps.Service

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReverseGeocodeAddress extends StObject {
  
  var jibunAddress: String
  
  var roadAddress: String
}
object ReverseGeocodeAddress {
  
  inline def apply(jibunAddress: String, roadAddress: String): ReverseGeocodeAddress = {
    val __obj = js.Dynamic.literal(jibunAddress = jibunAddress.asInstanceOf[js.Any], roadAddress = roadAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReverseGeocodeAddress]
  }
  
  extension [Self <: ReverseGeocodeAddress](x: Self) {
    
    inline def setJibunAddress(value: String): Self = StObject.set(x, "jibunAddress", value.asInstanceOf[js.Any])
    
    inline def setRoadAddress(value: String): Self = StObject.set(x, "roadAddress", value.asInstanceOf[js.Any])
  }
}
