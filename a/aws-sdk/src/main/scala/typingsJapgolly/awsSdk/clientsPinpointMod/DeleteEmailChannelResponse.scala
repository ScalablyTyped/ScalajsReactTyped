package typingsJapgolly.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEmailChannelResponse extends StObject {
  
  var EmailChannelResponse: typingsJapgolly.awsSdk.clientsPinpointMod.EmailChannelResponse
}
object DeleteEmailChannelResponse {
  
  inline def apply(EmailChannelResponse: EmailChannelResponse): DeleteEmailChannelResponse = {
    val __obj = js.Dynamic.literal(EmailChannelResponse = EmailChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEmailChannelResponse]
  }
  
  extension [Self <: DeleteEmailChannelResponse](x: Self) {
    
    inline def setEmailChannelResponse(value: EmailChannelResponse): Self = StObject.set(x, "EmailChannelResponse", value.asInstanceOf[js.Any])
  }
}
