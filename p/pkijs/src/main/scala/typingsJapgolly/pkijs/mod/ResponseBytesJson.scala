package typingsJapgolly.pkijs.mod

import typingsJapgolly.asn1js.mod.OctetStringJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseBytesJson extends StObject {
  
  var response: OctetStringJson
  
  var responseType: String
}
object ResponseBytesJson {
  
  inline def apply(response: OctetStringJson, responseType: String): ResponseBytesJson = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseBytesJson]
  }
  
  extension [Self <: ResponseBytesJson](x: Self) {
    
    inline def setResponse(value: OctetStringJson): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
  }
}
