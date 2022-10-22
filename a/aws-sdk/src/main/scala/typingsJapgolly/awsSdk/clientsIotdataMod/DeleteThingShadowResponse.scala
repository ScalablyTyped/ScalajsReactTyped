package typingsJapgolly.awsSdk.clientsIotdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteThingShadowResponse extends StObject {
  
  /**
    * The state information, in JSON format.
    */
  var payload: JsonDocument
}
object DeleteThingShadowResponse {
  
  inline def apply(payload: JsonDocument): DeleteThingShadowResponse = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteThingShadowResponse]
  }
  
  extension [Self <: DeleteThingShadowResponse](x: Self) {
    
    inline def setPayload(value: JsonDocument): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
  }
}
