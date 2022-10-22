package typingsJapgolly.awsSdk.clientsIotdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateThingShadowResponse extends StObject {
  
  /**
    * The state information, in JSON format.
    */
  var payload: js.UndefOr[JsonDocument] = js.undefined
}
object UpdateThingShadowResponse {
  
  inline def apply(): UpdateThingShadowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateThingShadowResponse]
  }
  
  extension [Self <: UpdateThingShadowResponse](x: Self) {
    
    inline def setPayload(value: JsonDocument): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
  }
}
