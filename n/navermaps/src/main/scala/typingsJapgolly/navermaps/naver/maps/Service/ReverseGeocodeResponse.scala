package typingsJapgolly.navermaps.naver.maps.Service

import typingsJapgolly.navermaps.anon.Address
import typingsJapgolly.navermaps.anon.Total
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReverseGeocodeResponse extends StObject {
  
  var result: Total
  
  var v2: Address
}
object ReverseGeocodeResponse {
  
  inline def apply(result: Total, v2: Address): ReverseGeocodeResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], v2 = v2.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReverseGeocodeResponse]
  }
  
  extension [Self <: ReverseGeocodeResponse](x: Self) {
    
    inline def setResult(value: Total): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setV2(value: Address): Self = StObject.set(x, "v2", value.asInstanceOf[js.Any])
  }
}
