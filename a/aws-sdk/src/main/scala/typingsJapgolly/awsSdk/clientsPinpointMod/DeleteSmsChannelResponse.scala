package typingsJapgolly.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSmsChannelResponse extends StObject {
  
  var SMSChannelResponse: typingsJapgolly.awsSdk.clientsPinpointMod.SMSChannelResponse
}
object DeleteSmsChannelResponse {
  
  inline def apply(SMSChannelResponse: SMSChannelResponse): DeleteSmsChannelResponse = {
    val __obj = js.Dynamic.literal(SMSChannelResponse = SMSChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSmsChannelResponse]
  }
  
  extension [Self <: DeleteSmsChannelResponse](x: Self) {
    
    inline def setSMSChannelResponse(value: SMSChannelResponse): Self = StObject.set(x, "SMSChannelResponse", value.asInstanceOf[js.Any])
  }
}
