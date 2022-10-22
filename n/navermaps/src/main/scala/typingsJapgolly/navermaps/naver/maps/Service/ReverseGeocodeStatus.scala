package typingsJapgolly.navermaps.naver.maps.Service

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReverseGeocodeStatus extends StObject {
  
  var code: ReverseGeocodeStatusCode
  
  var message: String
  
  var name: ReverseGeocodeStatusName
}
object ReverseGeocodeStatus {
  
  inline def apply(code: ReverseGeocodeStatusCode, message: String, name: ReverseGeocodeStatusName): ReverseGeocodeStatus = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReverseGeocodeStatus]
  }
  
  extension [Self <: ReverseGeocodeStatus](x: Self) {
    
    inline def setCode(value: ReverseGeocodeStatusCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setName(value: ReverseGeocodeStatusName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
